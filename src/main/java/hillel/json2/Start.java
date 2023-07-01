package hillel.json2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        JsonProcessor jp = new JacksonJsonProcessor();
        String json = null;
        try {
            json = Files.readString(Paths.get("src/main/resources/sample.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String userName = jp.getUserName(json);
        System.out.println(userName);
    }
}
