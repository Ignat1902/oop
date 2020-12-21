import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
    public LinkedList<UrlDepthPair> proccessed;

    public Crawler() {
        proccessed = new LinkedList<>();
    }

    public void startParsing(URL baseUrl, int maxDepth, int currentDepth) {
        if (currentDepth > maxDepth) return;

        LinkedList<UrlDepthPair> links = getAllLinks(baseUrl, currentDepth);

        for (UrlDepthPair link: links) {
            startParsing(link.realUrl, maxDepth, currentDepth + 1);
        }

        proccessed.addAll(links);
    }

    private static LinkedList<UrlDepthPair> getAllLinks(URL url, int depth) {
        try {
            LinkedList<UrlDepthPair> links = new LinkedList<>();

            int port = 80;
            String hostname = url.getHost();

            Socket socket = new Socket(hostname, port);
            socket.setSoTimeout(3000);

            OutputStream outStream = socket.getOutputStream();

            PrintWriter writer = new PrintWriter(outStream, true);

            if (url.getPath().length() == 0) {
                writer.println("GET / HTTP/1.1");
                writer.println("Host: " + hostname);
                writer.println("Accept: text/html");
                writer.println("Accept-Language: en,en-US;q=0.9,ru;q=0.8");
                writer.println("Connection: close");
                writer.println();
            }
            else {
                writer.println("GET " + url.getPath() + " HTTP/1.1");
                writer.println("Host: " + hostname);
                writer.println("Accept: text/html");
                writer.println("Accept-Language: en,en-US;q=0.9,ru;q=0.8");
                writer.println("Connection: close");
                writer.println();
            }

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String htmlLine;

            Pattern patternURL = Pattern.compile(
                    "(href=\"http|href=\"https)://([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:/~+#-]*[\\w@?^=%&/~+#-])?"
            );

            while ((htmlLine = reader.readLine()) != null) {
                Matcher matcherURL = patternURL.matcher(htmlLine);
                while (matcherURL.find()) {
                    String link = htmlLine.substring(matcherURL.start() + 6,
                            matcherURL.end());

                    links.add(new UrlDepthPair(link, depth));
//                    if (links.size() >= 10) return links;
                }
            }
            socket.close();

            return links;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.print(Arrays.toString(e.getStackTrace()));

            return new LinkedList<>();
        }
    }
}
