package lesson9;

public class Horse<T> {
    T value;
    private String name;
    public <T>void take(T name) {

    }
    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Horse.<String>take("hello");
//        Horse.<Integer>take(123);

    }
}