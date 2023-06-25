package lesson6.ex1.db;

import lesson6.ex1.model.Student;

/**
 * @author Serhii Klunniy
 */
public class Database {

    public static Student[] students = new Student[2];

     static {
         try {
             students[0] = new Student(20, "Tom");
             students[1] = new Student(25, "Tania");
             students[2] = new Student(30, "Bob");
         } catch (ArrayIndexOutOfBoundsException e) {
           //  System.out.println("Out of array");
         }

    }
}
