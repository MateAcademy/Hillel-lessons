package hillel.json2;

import hillel.json2.model.User;

import java.util.Map;

/**
 * @author Serhii Klunniy
 */
public interface JsonProcessor {
    String toJson(User user);
    User fromJson(String json);

    Map<String, Object> fromJsonAsMap(String json);

    String getUserName(String json);
}
