package lesson10.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Test {
    public static void main(String[] args) {
       //Container<? super Planner> container = new Container<Boing>();

//       container.getValue().getTest();
//       //container.setValue(new Aircraft());
//       container.setValue(new Planner());
//       container.setValue(new Boing());



       //PECS produser extends consumer super
        // extends  - мы можем брать в коллекцию
        // super    - мы можем класть из коллекции обьекты

       // Collections.copy();
    }
}

class Container<T> {
    T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
class Aircraft  { }

class Planner extends Aircraft {
    void getTest() {}
}
class Boing extends Planner {}