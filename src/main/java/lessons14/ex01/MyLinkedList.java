package lessons14.ex01;

public class MyLinkedList<T> {
    private Node first;
    private Node last;
    private int size;

    public void add(T value) {
        Node node = new Node();
        node.value = value;

        if (size == 0) {
            this.first = node;
            this.last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public void add(int index, T value) {
        Node current = first;
        Node node = new Node();
        node.value = value;
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("IndexOutOfBounds");
        } else if (size == 0) {
            this.first = node;
            this.last = node;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            node.next = current;
            node.prev = current.prev;
            current.prev.next = node;
            current.prev = node;
            size++;
        }
    }

    public T get(int index) {
        Node current = first;
        if (index < 0 || index > size) { // >=
            throw new ArrayIndexOutOfBoundsException("IndexOutOfBounds");
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    class Node {
        private T value;
        private Node next;
        private Node prev;
    }
}