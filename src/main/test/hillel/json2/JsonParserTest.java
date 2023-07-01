//package hillel.json2;
//
//import hillel.json2.model.User;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
////import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
///**
// * @author Serhii Klunniy
// */
//public class JsonParserTest {
//    User user;
//    JsonProcessor processor;
//
//    @BeforeEach
//    void setup() {
//        user = new User();
//        user.setName("Peter");
//        user.setLastName("Jones");
//        processor = new JacksonJsonProcessor();
//    }
//
//    @Test
//    public void to_json_validObject_success() {
//       String json = processor.toJson(user);
//    }
//
//    @Test
//    public void fromJson_validJson_success() throws IOException {
//        String json = Files.readString(Paths.get("src/main/resources/sample.json"));
//        User user = processor.fromJson(json);
//        assertEquals("Peter", user.getName());
//        assertEquals("Jones", user.getLastName());
//    }
//}
