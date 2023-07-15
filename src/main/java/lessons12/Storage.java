package lessons12;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Serhii Klunniy
 */
public class Storage<T, V> { //сразу параметризуем

    //private Object[] entries = new Object[1];
    //или Entry[] entries = (Entry[]) new Object[10];
    @SuppressWarnings({"rawtypes","unchecked"})
    private Entry<T, V>[] entries = (Entry<T, V>[]) new Entry[10];
    private int size = 0;


    void put(T key, V value) {
        Entry<T, V> entry = new Entry<>(key, value);
        if (size >= entries.length) {
            growArray();
        }
        entries[size] = entry;
        size++;
    }

    public int getSize() {
        return size;
    }

    private void growArray() {
        entries = Arrays.copyOf(entries, entries.length + 1); //entries.length*3/2
    }

    V get(T key) {
        for (Entry<T, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        throw new NoSuchElementException();
    }

    class Entry<T, V> {
        private T key;
        private V value;

        public Entry(T key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(T key) {
            this.key = key;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {

            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    @Override
    public String toString() {
        //entries = Arrays.copyOf(entries, size);
        return "Storage{" +
                "entries=" + Arrays.toString(entries) +
                '}';
    }
}