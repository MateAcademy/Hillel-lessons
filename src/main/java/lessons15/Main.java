package lessons15;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 3;
//
//        a = a + b;
//        b = a - b;
//        a = a - b;

//        System.out.println("a=" + a);
//        System.out.println("b=" + b);


        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(3);
      //  myLinkedList.add(4);

        System.out.println(myLinkedList);

        myLinkedList.add(6, 5);
        System.out.println(myLinkedList);
    }
}
