package lesson8;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {



        try(Test test = new Test();
        Scanner scanner = new Scanner(System.in)) {

        } catch (Exception e) {
            System.out.println("ошибка");
        }



    }
}


class Test implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("вызван метод close");
    }
}