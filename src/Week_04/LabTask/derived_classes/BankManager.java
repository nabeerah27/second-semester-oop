package Week_04.LabTask.derived_classes;

import Week_04.LabTask.intermediate_classes.BunnyRabbits;

// BankManager class is a derived class (child) of BunnyRabbits
public class BankManager extends BunnyRabbits {

    // Constructor - calls the parent (BunnyRabbits) constructor
    // Sets a fixed color (White) and action (Manage accounts)

    public BankManager(String size) {
        super(size, "White", "Manage accounts");
    }

    // Overriding the getRole method to specify this bunny's role
    @Override
    public String getRole() {
        return "Bank Manager";
    }

    // Overriding toString() to include role and parent class details
    @Override
    public String toString() {
        return "Role : " + getRole() + " \n" + super.toString();
    }

}
