package lessons16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);

        System.out.println(myArrayList);

//        myArrayList.add(100, 1);
//        System.out.println(myArrayList);

        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        myArrayList2.add(55);
        myArrayList2.add(99);

        myArrayList.addAll(myArrayList2);

        System.out.println(myArrayList);

        //System.out.println(myArrayList.get(7));

        myArrayList.set(7, 6);
        System.out.println(myArrayList);

        myArrayList.remove(6);
        System.out.println(myArrayList);

        myArrayList.removeFirst(5);
        System.out.println(myArrayList);

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());







//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Один");
//        myList.add("Два");
//
//        myList.add("Новое два", 1);


//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        int[] arr2 = {600, 700, 800, 900, 1000};
//
//        System.arraycopy(arr, 0, arr, 6, 2);
//        System.out.println(Arrays.toString(arr));
    }
}
