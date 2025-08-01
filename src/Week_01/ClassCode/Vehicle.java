package Week_01.ClassCode;

public class Vehicle {

    // Attributes (instance variables)
    String color;
    String company;
    int year;

    // Parameterized constructor
    Vehicle(String color, String company, int year) {
         this.color = color;
         this.company = company;
         this.year = year;
    }

    // Method to print details of a Vehicle object
    public void printDetails() {
        System.out.println("Color: " + color);
        System.out.println("Company: " + company);
        System.out.println("Year: " + year);
    }

}
