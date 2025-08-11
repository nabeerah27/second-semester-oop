package Week_04.LabTask.base_class;

// Base class (Grand parent class) representing a generic Cuddly Toy
public class CuddlyToy {

    // Private attributes common to all cuddly toys
    private String size;

    // Parameterized Constructor
    public CuddlyToy(String size) {
        this.size = size;
    }

    // Getter for size
    public String getSize() {
        return size;
    }

    // Setter for size
    public void setSize(String size) {
        this.size = size;
    }

    // Generic noise method - can be overridden in derived classes for specific sounds
    public void makeNoise() {

    }

    // Method to describe the attributes of an object
    public void describe() {
        System.out.println("My size is " + size);
    }

    // Overridden toString() method to display toy's details
    @Override
    public String toString() {
        return "🧩 Cuddly Toy [Size = " + size + "]";
    }

}
