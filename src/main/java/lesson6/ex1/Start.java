package lesson6.ex1;

import lesson6.ex1.db.Database;
import lesson6.ex1.model.Student;
import lesson6.ex1.util.Password;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Start {

    public static void main(String[] args) {
        Student[] students = Database.students;
        checkStudent(students);
    }

    private static void checkStudent(Student[] students) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите имя студента: ");
            String name = scanner.nextLine();
            System.out.println("Введите возраст студента: ");
            int age = scanner.nextInt();
            Student studentFromConsole = new Student(age, name);

            for (Student student : students) {
                if (Objects.equals(studentFromConsole, student)) {
                    System.out.println("Student found in DB");
                    checkPassword(scanner);
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
    }

    private static void checkPassword (Scanner scanner) {
        System.out.println("Enter the password:");
        scanner.nextLine();
        String passwordFromConsole = scanner.nextLine();

        String passwordFromDB = Password.getPassword();

        if (Objects.equals(passwordFromConsole, passwordFromDB)) {
            System.out.println("password correct");
        } else {
            System.out.println("password incorrect");
        }

    }
}
