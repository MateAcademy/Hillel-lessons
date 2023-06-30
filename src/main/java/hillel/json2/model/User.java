package hillel.json2.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * @author Serhii Klunniy
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    String name;
    String lastName;

}
