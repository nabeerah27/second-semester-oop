package Week_04.LabTask.intermediate_classes;

import Week_04.LabTask.base_class.CuddlyToy;

// BunnyRabbits is an intermediate class (Parent class) that extends the base class CuddlyToy
public class BunnyRabbits extends CuddlyToy {

    // Constructor - calls the base class (CuddlyToy) constructor
    // Sets size, color, and job (task/role) for the bunny rabbits

    public BunnyRabbits(String size, String color, String job) {
        super(size, color, job);
    }

    // A specific behavior for bunny rabbits - making noise
    public void makeNoise() {
        System.out.println("Bunny says: SQUEAK! ");
    }

    // Overriding toString() to include the toy type and base class details
    @Override
    public String toString() {
        return "Toy Type: Bunny Rabbit" + super.toString() ;
    }


}
