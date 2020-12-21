import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.logging.*;
public class CrawlerTask implements Runnable {
    public UrlDepthPair depthPair;
    public UrlPool pool;

    public CrawlerTask (UrlPool newPool) {
        pool = newPool;
    }

    public void run() {
        depthPair = pool.get();
        int depth = depthPair.depth;
        LinkedList<String> linksList = null;
        try {
            linksList = Crawler.getAllLinks(depthPair);
        }
        catch (IOException ex) {
            Logger.getLogger(CrawlerTask.class.getName()).log(Level.SEVERE,null, ex);
        }
        for (String newURL : linksList) {
            UrlDepthPair newDepthPair = null;
            try {
                newDepthPair = new UrlDepthPair(newURL, depth + 1);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            pool.put(newDepthPair);
        }
    }
}