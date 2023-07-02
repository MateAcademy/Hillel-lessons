package lesson10.tryWithRes;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {

        try(DoSomething doSomething = new DoSomething()) {
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            throw new NullPointerException();
        }
    }
}
