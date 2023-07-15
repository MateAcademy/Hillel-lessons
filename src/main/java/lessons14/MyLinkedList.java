package lessons14;

/**
 * @author Serhii Klunniy
 */
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value) {
        Node<T> node = new Node<>(value, last, null);

        if (size == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
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
