package Week_01.ClassCode;

public class Main {

    public static void main(String[] args) {

        // Creating first Student object
        Student s1 = new Student("Amna", 20, 7);
        s1.printInfo();

        System.out.println("-------------------------------");

        // Creating second Student object
        Student s2 = new Student("Ali", 25, 17);
        s2.printInfo();

        System.out.println("-------------------------------");

        // Creating first Vehicle object
        Vehicle myCar = new Vehicle("Green", "Honda", 2023);
        myCar.printDetails();

        System.out.println("-------------------------------");

        // Creating second Vehicle object
        Vehicle myBus = new Vehicle("Blue", "Daewoo Express", 2015);
        myBus.printDetails();

    }

}
