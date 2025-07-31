package Week_01.ClassCode;

public class Student {

    // Public attributes representing students properties
    String name;
    int age;
    int rollNumber;

    // Parameterized constructor to initialize Student object
    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Prints the student's details (attributes) to the console
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll number: " + rollNumber);
    }

}
