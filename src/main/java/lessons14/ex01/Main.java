package lessons14.ex01;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("hi");
        linkedList.add("hello");
        linkedList.add("+hello World!+");
        linkedList.add("hello World!---------");
        System.out.println(linkedList.get(3) + ", " + linkedList.get(2));
    }
}