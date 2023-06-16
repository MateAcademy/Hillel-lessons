package lesson3;

/**
 * @author Serhii Klunniy
 */
public class Human {

   public String name;
   public int age;

   public String address;

   public Human() {}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
