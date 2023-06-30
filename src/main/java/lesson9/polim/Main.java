package lesson9.polim;

/**
 * @author Serhii Klunniy
 */
public class Main {

    public void test(Car car) {
        car.go();
    }

    public static void main(String[] args) {
        Car car = new Bmw();
        car.go();
        System.out.println(car.name);
    }
}
