package lesson18;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        try {
            Student student2 = (Student) student1.clone();

            student1.setAge(100);

            System.out.println(student2.getAge());

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
