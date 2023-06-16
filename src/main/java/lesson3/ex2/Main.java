package lesson3.ex2;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] a) {

        try {
            Cat cat = new Cat();
            Animal murka = new Cat();
            Animal dog = new Dog();

            test(murka);
        } catch (Exception e) {
            System.out.println("Была ошибка ");
        }

    }


    private static void test(Animal animal) {
       Dog dog = (Dog) animal;
       dog.say();
    }
}
