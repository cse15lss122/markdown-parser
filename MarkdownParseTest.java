import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void checkLinks() throws IOException{
        MarkdownParse p = new MarkdownParse();
        System.out.println("Ooga booga");
        ArrayList<String> check = new ArrayList<>();
        check.add("https://something.com");
        check.add("some-thing.html");
        Path filename=Path.of("test-file.md");
        String cont=Files.readString(filename);
        assertEquals(check,p.getLinks(cont));
    }
}
