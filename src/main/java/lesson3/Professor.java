package lesson3;

/**
 * @author Serhii Klunniy
 */
public class Professor extends Human {

    public Car car;
    public MobilePfone mobilePfone;

    public Professor(Car car, MobilePfone mobilePfone) {
        this.car = car;
        this.mobilePfone = mobilePfone;
    }

    public Professor(String name, int age, Car car, MobilePfone mobilePfone) {
        super(name, age);
        this.car = car;
        this.mobilePfone = mobilePfone;
    }

    @Override
    public String toString() {
        return "name='" + name + " age=" + age;
    }

    public void test() {
        System.out.println("test");
    }
}
