package Week_04.LabTask.base_class;

// Base class (Grand parent class) representing a generic Cuddly Toy
public class CuddlyToy {

    // Private attributes common to all cuddly toys
    private String size;
    private String color;
    private String job;

    // Parameterized Constructor - initializes all attributes
    public CuddlyToy(String size, String color, String job) {
        this.size = size;
        this.color = color;
        this.job = job;
    }

    // Getter for color
    public String getColor() {
        return color ;
    }

    // Getter for job
    public String getJob() {
        return job;
    }

    // Method to get role - intended to be overridden by child classes
    public String getRole() {
        return "";
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
        System.out.println("Make noise! ");
    }

    // Overridden toString() method to display toy's details
    @Override
    public String toString() {
        return "\nSize: " + size +
                "\nColor: " + color +
                "\nJob: " + job;
    }

}
