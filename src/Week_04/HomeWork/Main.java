package Week_04.HomeWork;

import Week_04.HomeWork.date_time.Time;

public class Main {

    public static void main(String[] args) {

        Time t1 = new Time();
        System.out.println(t1);

        System.out.println("-----------------------------------");

        Time t2 =  new Time(12, 36, 55);
        System.out.println(t2);

        System.out.println("-----------------------------------");

        Time t3 = new Time(42, 70, 100);
        System.out.println(t3);

        System.out.println("-----------------------------------");




    }

}
