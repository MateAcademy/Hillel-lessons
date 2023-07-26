package lessons17;

import java.util.Arrays;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new MyArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);

        //   myList.remove(3);  // Хочу удалить по индексу 3
        myList.remove(1);  // Хочу удалить элемент 1

     //   System.out.println("List size: " + myList.size());

        System.out.println("List elements: " + myList);


    //    myList.add(4, 5);
    //    System.out.println("List size: " + myList.size());
    //    System.out.println("List elements: " + Arrays.toString(myList.getArray()));

//        MyArrayList<Integer> myList2 = new MyArrayList<>();
//        myList2.add(4);
//        myList2.add(5);
//        myList2.add(6);
//
//        myList.addAll(myList2);
//        System.out.println("List elements: " + Arrays.toString(myList.getArray()));


//        System.out.println("List size: " + myList.size());
//        System.out.println("Element at index 2: " + myList.get(2));
//        myList.set(5, 0);
//        System.out.println("List elements: " + Arrays.toString(myList.getArray()));
//        System.out.println("Removed element: " + myList.remove(3));
    }
}
