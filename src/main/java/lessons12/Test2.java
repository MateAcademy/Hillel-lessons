package lessons12;

import java.util.Arrays;

/**
 * @author Serhii Klunniy
 */
public class Test2 {

    private Integer[] arr = new Integer[10];

    private void grow() {
        Arrays.copyOf(arr, arr.length*3/2);
    }


    void test() {

        for (Integer a : arr) {
            if (a != null) {

            }
        }

    }

}
