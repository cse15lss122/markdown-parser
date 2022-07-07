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
        assertEquals(["https://something.com,some-thing.html"],p.getLinks());
    }
}