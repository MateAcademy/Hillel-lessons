package hillel.json2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hillel.json2.model.User;

import java.util.Map;

/**
 * @author Serhii Klunniy
 */
public class JacksonJsonProcessor implements JsonProcessor {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JacksonJsonProcessor() {
        //По умолчанию ObjectMapper этого не делает, а вот если мы подключили новый модуль
        objectMapper.findAndRegisterModules();
    }

    @Override
    public String toJson(User user) {
        try {
            return objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User fromJson(String json) {
        try {
            return objectMapper.readValue(json, User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<String, Object> fromJsonAsMap(String json) {
        try {
            return objectMapper.readValue(json, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getUserName(String json) {
        JsonNode node = null;
        try {
            node = objectMapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return node.get("name").textValue();
    }

}
