package lessons14;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.add("home");
        myLinkedList.add("Last");
        myLinkedList.add(" --- ", 3);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(3));
    }
}
