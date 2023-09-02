package lesson18;

public class Student implements Cloneable {
    private String name;
    private int age;
    private MobilePhone mobilePhone;

    public Student() {

    }

    public Student(String name, int age, MobilePhone mobilePhone) {
        this.name = name;
        this.age = age;
        this.mobilePhone = mobilePhone;
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

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.mobilePhone = (MobilePhone) mobilePhone.clone();
        return clonedStudent;
    }
}