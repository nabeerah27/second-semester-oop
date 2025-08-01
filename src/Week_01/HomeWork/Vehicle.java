package Week_01.HomeWork;

public class Vehicle {

    // Attributes (instance variables)
    String color;
    String company;
    int year;
    String[] features;

    // Parameterized constructor
    Vehicle(String color, String company, int year, String[] features) {
        this.color = color;
        this.company = company;
        this.year = year;
        this.features = features;
    }

    // Method to print details of a Vehicle object
    public void printDetails() {
        System.out.println("Color: " + color);
        System.out.println("Company: " + company);
        System.out.println("Year: " + year);

        System.out.print("Vehicle features: ");
        for(String feature : features)
        {
            System.out.println("- " + feature);
        }

    }

}
