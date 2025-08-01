package Week_04.LabTask.intermediate_classes;

import Week_04.LabTask.base_class.CuddlyToy;

// TeddyBear is an intermediate class (Parent class) that extends the base class CuddlyToy
public class TeddyBear extends CuddlyToy {

    // Constructor - calls the base class (CuddlyToy) constructor
    // Sets size, color, and job (task/role) for the teddy bear

    public TeddyBear(String size, String color, String job) {
        super(size, color, job);
    }

    // A specific behavior for teddy bears - making noise
    public void makeNoise() {
        System.out.println("Teddy says: GROWL! ");
    }

    // Overriding toString() to include the toy type and base class details
    @Override
    public String toString() {
        return "Toy Type: Teddy Bear" + super.toString() ;
    }

}
