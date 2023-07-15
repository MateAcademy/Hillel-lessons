package lesson10.homework;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;
    private static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Apple");
        list.add("Pineapple");
        list.add("Orange");

        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(0));
    }
}
