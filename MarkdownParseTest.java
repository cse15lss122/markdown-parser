import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void newTest1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> returnList=MarkdownParse.getLinks(content);
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(returnList, expected);
    }
    @Test
    public void newTest2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("https://google.com");
        expected.add("some-thing.html");
        expected.add("https://google.com");

        assertEquals(MarkdownParse.getLinks(content), expected);
    }

    @Test
    public void newTest3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("more text here");
        assertEquals(MarkdownParse.getLinks(content), expected);
    }

}