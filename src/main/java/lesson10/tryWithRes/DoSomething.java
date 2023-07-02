package lesson10.tryWithRes;

/**
 * @author Serhii Klunniy
 */
public class DoSomething implements AutoCloseable {
    @Override
    public void close() {
        throw new RuntimeException();
    }
}
