package lesson9;

/**
 * @author Serhii Klunniy
 */
public class Student<T> {

    private T age;

    public void setName(T a) {
        this.age = a;
    }
}

class Start {
    public static void main(String[] args) {

        Student<? extends Number> student = new Student<>();
        //student.setName("Tom");

    }
}