import static org.junit.Assert.*;
import java.nio.file.Files;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1+1); //expected ok
    }

    @Test 
    public void getLinks() throws IOException{
        Path filename = Path.of("test-file8.md");
        String content = Files.readString(filename);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-thing.html");
        assertEquals(links, MarkdownParse.getLinks(content)); //expected error
    }

    
    
}
