package lessons16;

import java.util.*;

/**
 * @author Serhii Klunniy
 */
public class MyArrayList<T> implements MyList<T> {

    private T[] arr = (T[]) new Object[10];
    private int size;

    public void add(T value) {
        if (size == arr.length) {
            grow();
        }
        arr[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (size == index) {
            add(value);
            return;
        } else {
            scheckIndex(index);
        }

        if (size == arr.length) {
            grow();
        }
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = value;
        size++;
    }

    private void scheckIndex(int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException("Вы вышли за пределы массива");
    }

    @Override
    public void addAll(List<T> list) {
        if (list != null) {
            if (arr.length < size + list.size()) {
                arr = Arrays.copyOf(arr, size + list.size());
            }

            for (int i = 0, j = size; i < list.size(); i++, j++) {
                arr[j] = list.get(i);
            }

            size = size + list.size();

        }
    }

    private void growArr(int index) {
        Arrays.copyOf(arr, arr.length + size);
    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public void set(T value, int index) {

        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("вы вышли за пределы массива");

        arr[index] = value;
    }

    @Override
    public T remove(int index) {

        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("вы вышли за пределы массива");

        T value = arr[index];

        System.arraycopy(arr, index + 1, arr, index, size-- - index);

        return value;
    }

    @Override
    public T removeFirst(T t) {
        if (t == null) throw new NoSuchElementException();

        for (int i = 0; i < size; i++) {
            if (arr[i].equals(t)) {
                System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1 );
                size--;
                return t;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }

        return true;
    }

    private void grow() {
        arr = Arrays.copyOf(arr, arr.length * 3 / 2);
        //System.arraycopy();
    }

    @Override
    public String toString() {
        T[] arr2 = (T[]) new Object[size];
        System.arraycopy(arr, 0, arr2, 0, size);

        return "MyArrayList: " + Arrays.toString(arr2);
    }
}
