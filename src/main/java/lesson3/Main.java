package lesson3;

/**
 * @author Serhii Klunniy
 */
public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor("Gregoriy", 34, new Car("BMW", "Red"), new MobilePfone());
        professor.sayHello();


       // Human student = new Student();
    }



}


class Car {

    private String name;
    private String color;

    private String cowsh;

    public void setCowsh(String cowsh) {
        this.cowsh = cowsh;
    }

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }


}