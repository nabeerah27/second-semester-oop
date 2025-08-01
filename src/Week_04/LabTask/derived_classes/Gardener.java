package Week_04.LabTask.derived_classes;

import Week_04.LabTask.intermediate_classes.TeddyBear;

// Gardener class is a derived (child) class of TeddyBear
public class Gardener extends TeddyBear {

    // Constructor - calls the TeddyBear constructor
    // Sets a fixed color (Red) and action (Water plants)

    public Gardener(String size) {
        super(size, "Red", "Water plants");
    }

    // Overriding the getRole() method to specify this teddy bear's role
    @Override
    public String getRole() {
        return "Gardener";
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "Role : " + getRole() + " \n" + super.toString();
    }

}
