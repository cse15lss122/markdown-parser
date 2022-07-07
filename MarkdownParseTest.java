import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void checkLinks(){
        MarkdownParse p = new MarkdownParse();
        ArrayList<String> check = new ArrayList<>();
        check.add("https://something.com");
        check.add("some-thing.html");
        assertEquals(check,p.getLinks());
    }
}