import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JSoupDemo {

    public static void main(String[] args) {

        parseAndTraverseDocument();
    }

    private static void parseAndTraverseDocument() {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);

        System.out.println(doc);
    }


}
