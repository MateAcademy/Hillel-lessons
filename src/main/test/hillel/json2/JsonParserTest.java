package hillel.json2;

import hillel.json2.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Serhii Klunniy
 */
public class JsonParserTest {
    User user;
    JsonProcessor jsonProcessor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Toha");
        user.setLastName("Database");
    }

    @Test
    public void to_json_validObject_success() {

    }
}
