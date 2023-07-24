package lessons16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public interface MyList<T> {
    void add(T value);
    void add(T value, int index);

    void addAll(List<T> list);

    T get(int index);

    void set(T value, int index);

    //возвращает элемент который удалили
    T remove(int index);

    //удаляет первый, который встретится
    T removeFirst(T t);

    int size();

    boolean isEmpty();

}
