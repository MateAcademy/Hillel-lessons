package lesson5;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(age);

//        Cat cat = new Cat();
//        Cat cat2 = new Cat();
//        System.out.println(cat.equals(cat2));
//
//
////        if (cat instanceof Cat) {
////            cat.setName("myrka");
////        }
//
//        Dog dog = new Dog();
//
//        Start start = new Start();
//        start.test(cat);
//        start.test(dog);
    }

    public void test(Animal animal) {
        animal.eat();
    }
}
