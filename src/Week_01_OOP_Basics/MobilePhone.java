package Week_01_OOP_Basics;

public class MobilePhone {

    // Public Attributes
    String brand;
    int price;

    // Constructor
    public MobilePhone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to print attributes
    public void showSpecs() {
        System.out.println("Mobile brand: " + brand);
        System.out.println("Mobile price: $" + price) ;
    }

}
