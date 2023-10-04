package QuestionThree;

public class Student {


    String name;
    int age;
    double gpa;
    String phone;

    public Student() {

    }

    public Student(String name, int age, double gpa, String phone) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.phone = phone;
    }

    public void printStatus() {
        System.out.println(name + ", Age: " + age + ", GPA :" + gpa + ", Phone Num: " + phone);
    }
}
