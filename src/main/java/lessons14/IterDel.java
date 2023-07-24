package lessons14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Serhii Klunniy
 */
public class IterDel {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("first");
        collection.add("second");
        collection.add("third");
        collection.add("----");
        collection.add("!!!!");

        for (String s: collection) {
            if (s.equals("second")) {
                collection.remove("second");
                break;
            }
        }

        System.out.println(collection);

//        Iterator<String> iterator = collection.iterator();
//
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if (s.equals("----"))
//                iterator.remove();
//        }
//
//        //collection.removeIf(s -> s.equals("----"));
//        System.out.println(collection);
    }
}
