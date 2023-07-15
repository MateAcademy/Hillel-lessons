package lessons14;

import java.util.NoSuchElementException;

/**
 * @author Serhii Klunniy
 */
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value) {
        Node<T> node = new Node<>(value, null, null);

        if (size == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void add(T value, int index) {
        Node<T> node = new Node<>(value, null, null);
        checkIndexSize(index);
        if (index == 0) {
            first.prev = node;
            node.next = first;
            first = node;
        } else if (index == size) {
            last.next = node;
            node.prev = last;
            last = node;
        } else {
            Node<T> ser1 = first;
            Node<T> interim = first; //временное, промежуточное значение

            for (int i = 1; i < index; i++) {
                ser1 = interim.next;
                interim = ser1;
            }

            Node<T> ser2 = ser1.next;

            ser1.next = node;
            node.prev = ser1;
            node.next = ser2;
            ser2.prev = node;
        }
        size++;
    }

    private Node<T> getNodeByIndex(int index) {
        checkIndexSize(index);
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void checkIndexSize(int index) {
        if (index < 0 || index > size) throw new NoSuchElementException();
    }

    public T get(int size) {

        T value = null;

        if (first == null) throw new NoSuchElementException();

        Node<T> node = first;
        for (int i = -1; i < size; i++) {
            if (node == null) throw new NoSuchElementException();
            value = node.getValue();
            node = node.next;
        }

        return value;
    }


    @Override
    public String toString() {
        if (first == null) return null;

        StringBuilder str = new StringBuilder("MyLinkedList: { ");

        Node node = new Node(first.value, first.prev, first.next);
        str.append(node.value).append(" ");

        while (node.next != null) {
            node = node.next;
            str.append(node.value).append(" ");
        }

        str.append("}");

        return str.toString();
    }

    private static class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
