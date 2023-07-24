package lessons14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Serhii Klunniy
 */
public class ExMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hello1", 1);
        map.put("hello2", 2);
        map.put("hello3", 3);
        map.put("hello4", 4);

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
