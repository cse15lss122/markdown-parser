//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()||openBracket!=null||closeBracket!=null||openParen!=null||closeParen!=null) {
            int openBracket = MarkdownParse.checkOpenBracket(markdown, currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            if(openBracket == -1 || closeBracket == -1){
                break;
            }
            int closeParen = markdown.indexOf(")", openParen);
            if(openBracket == -1){
                break;
            }
            toReturn.add(markdown.substring(openParen + 1, closeParen));
        
            currentIndex = closeParen + 1;
            
        }

        return toReturn;
    }

    public static int checkOpenBracket(String markdown, int currentIndex){
        int openBracket = markdown.indexOf("[", currentIndex);
            if(openBracket == -1){
                return null;
            }
        return openBracket;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String contentOfFile = Files.readString(fileName);
        ArrayList<String> links = getLinks(contentOfFile);
	    System.out.println(links);
        
    }
}
