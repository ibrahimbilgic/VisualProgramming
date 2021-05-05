import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WebCrawler {
    public static void main(String[] args) {
        String startingURL = "https://www.teknoise.com/";
        crawl(startingURL);
    }
    public static void crawl(String startingURL){
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();
        pendingURLs.add(startingURL);

        while(!pendingURLs.isEmpty()){
            String URLString = pendingURLs.remove(0);
            traversedURLs.add(URLString);
            System.out.println(URLString);
            ArrayList<String> subURLs = getSubURLs(URLString);
            for(String sub:subURLs){
                if(!pendingURLs.contains(sub) && !traversedURLs.contains(sub)){
                    pendingURLs.add(sub);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String URLString){
        ArrayList<String> list = new ArrayList<>();
        String regex = "(http|https)://(\\w+\\.)+(com|edu|org|gov)(\\.tr)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        try {
            URL url = new URL(URLString);
            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                matcher = pattern.matcher(line);
                while(matcher.find()){
                    list.add(matcher.group());
                }
            }
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }
}
