package lesson9.generics;

import java.io.Serializable;

/**
 * @author Serhii Klunniy
 */
public class Main {

    private int b;
    int c;
    protected int d;
    public int a;


    class Bug {
    }

    class Human {
    }

    class GermanHuman<T> extends Human {
        T value;
    }

    class Student extends GermanHuman {
    }
    class Horse {}
    class Student2 extends GermanHuman<Horse> {
    }
    class Student3<T> extends GermanHuman<T> {}
    class Student4<X, K, T> extends GermanHuman<T> {
        X item;
        K item2;
    }


    public void test() {
        GermanHuman<?> germanHuman = new GermanHuman<>();

        Box<Integer> box = new Box<>();
        box.item = 7;

    }

    class Box<T> {
       T item;
    }
}


@FunctionalInterface
interface Flyable<T> {
    T getFlyModel();
}

class Test implements Flyable {
    @Override
    public String getFlyModel() {
        System.out.println("мы в методе getFlyModel");
        return null;
    }
}

class Aircraft<T> implements Flyable<T> {
    @Override
    public T getFlyModel() {
        return null;
    }
}
