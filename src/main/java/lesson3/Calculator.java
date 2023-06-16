package lesson3;

/**
 * @author Serhii Klunniy
 */
public class Calculator {

    public void summ(int a, int b) {
        System.out.println(a + b);
    }

    public void summ(int a) {
        System.out.println(a * 2);
    }

    public void summ(int a, int b, int c) {
        System.out.println(a + b + 3);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.summ(5);
    }
}
