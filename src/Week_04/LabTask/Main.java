package Week_04.LabTask;

import Week_04.LabTask.derived_classes.BankManager;
import Week_04.LabTask.derived_classes.Clown;
import Week_04.LabTask.derived_classes.EngineDriver;
import Week_04.LabTask.derived_classes.Gardener;

public class Main {

    public static void main(String[] args) {

        EngineDriver engineDriver = new EngineDriver("Large");
        System.out.println(engineDriver);
        System.out.println("-----------------------------------");

        Gardener gardener = new Gardener("Small");
        System.out.println(gardener);
        System.out.println("-----------------------------------");

        BankManager bankManager = new BankManager("Medium");
        System.out.println(bankManager);
        System.out.println("-----------------------------------");

        Clown clown = new Clown("Small");
        System.out.println(clown);

    }
}
