import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testMd() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ans.add("https://something.com");
        ans.add("some-thing.html");
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    }
    @Test
    public void testMd2() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ans.add("https://google.com");
        ans.add("some-thing.html");
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    } //memory error
    @Test
    public void testMd3() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ans.add("more text here");
       
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    }
    @Test
    public void testMd4() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
       //ans.add("more text here");
       
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    }//out of bounds 
    @Test
    public void testMd5() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ans.add("page.com");
       
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    }
    @Test
    public void testMd6() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ans.add("page.com");
       
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));

    }
    @Test
    public void testMd7() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
       // ans.add("page.com");
       
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(ExpectedValue,markdownParsePointer.getLinks(contents));//out of memory

    }
    @Test
    public void testMd8() throws IOException{
        ArrayList<String> ExpectedValue = new ArrayList<String>();
        //ans.add("a link on the page");
       
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        MarkdownParse markdownParsePointer = new MarkdownParse();
      
        assertEquals(anExpectedValues,markdownParsePointer.getLinks(contents));

    } //memory error 




}