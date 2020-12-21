import java.util.ArrayList;
import java.util.LinkedList;

public class UrlPool {
    private final LinkedList<UrlDepthPair> pendingURLs;
    public LinkedList<UrlDepthPair> processedURLs;
    private final ArrayList<String> seenURLs = new ArrayList<>();
    public int waitingThreads;
    int maxDepth;

    public UrlPool(int maxDepthPair) {
        maxDepth = maxDepthPair;
        waitingThreads = 0;
        pendingURLs = new LinkedList<>();
        processedURLs = new LinkedList<>();
    }
    public synchronized int getWaitThreads() {
        return waitingThreads;
    }

    public synchronized int size() { return pendingURLs.size(); }

    public synchronized void put(UrlDepthPair depthPair) {
        if (waitingThreads != 0) {
            --waitingThreads;
            this.notify();
        }
        if (!seenURLs.contains(depthPair.url) &
                !pendingURLs.contains(depthPair)) {
            if (depthPair.depth < maxDepth) {
                pendingURLs.add(depthPair);
            }
            else {
                processedURLs.add(depthPair);
                seenURLs.add(depthPair.url);
            }
        }
    }
    public synchronized UrlDepthPair get() {
        UrlDepthPair myDepthPair;
        while (pendingURLs.isEmpty()) {
            waitingThreads++;
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                System.err.println("MalformedURLException: " + e.getMessage());
                return null;
            }
        }
        myDepthPair = pendingURLs.pop();

        while (seenURLs.contains(myDepthPair.url)) {

            myDepthPair = pendingURLs.pop();
        }

        processedURLs.add(myDepthPair);
        seenURLs.add(myDepthPair.url);

        return myDepthPair;
    }
}
