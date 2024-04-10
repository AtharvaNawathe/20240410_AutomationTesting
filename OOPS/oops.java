package OOPS;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

class Student extends Person { 
    private int studentId;
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentId);
    }
}

public class oops {
    public static void main(String[] args) {
        Student student1 = new Student("Atharva", 21, 1001);
        System.out.println("Student Information:");
        student1.displayInfo();
    }
}


