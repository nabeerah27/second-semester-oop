package Week_04.LabTask.derived_classes;

import Week_04.LabTask.intermediate_classes.TeddyBear;

// EngineDriver class is a derived (child) class of TeddyBear
public class EngineDriver extends TeddyBear {

    // Constructor - calls the TeddyBear constructor
    // Sets a fixed color (Blue) and action (Drive engines)

    public EngineDriver(String size) {
        super(size, "Blue", "Drive engines");
    }

    // Overriding the getRole() method to specify this teddy bear's role
    @Override
    public String getRole() {
        return "Engine Driver";
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "Role : " + getRole() + " \n" + super.toString();
    }

}
