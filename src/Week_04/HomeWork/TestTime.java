package Week_04.HomeWork;

import Week_04.HomeWork.date_time.Time;

public class TestTime {

    public static void main(String[] args) {

        // Using default constructor
        Time t1 = new Time();

        System.out.println("Default time:");
        System.out.println(t1);

        System.out.println("-----------------------------------");

        // Using parameterized constructor with normal values
        Time t2 = new Time(12, 36, 55);

        System.out.println("Parameterized constructor (valid values):");
        System.out.println(t2);

        System.out.println("-----------------------------------");

        // Using parameterized constructor with overflow values
        Time t3 = new Time(42, 70, 100);

        System.out.println("Parameterized constructor (overflow values handled):");
        System.out.println(t3);

        System.out.println("-----------------------------------");

        // Using setTime with normalization
        Time t4 = new Time();

        System.out.println("Set time to almost midnight:");
        t4.setTime(23, 59, 59);
        System.out.println(t4);

        System.out.println("-----------------------------------");

        // Adding seconds that causes minute and hour overflow
        System.out.println("After adding 120 seconds (2 minutes) in t4:");
        t4.addSeconds(120); // +2 minutes
        System.out.println(t4);

        System.out.println("-----------------------------------");

        // Adding minutes that causes hour overflow
        Time t5 = new Time(10, 50, 0);
        System.out.println("Adding 75 minutes to " + t5);

        t5.addMinutes(75); // +1 hour 15 minutes
        System.out.println(t5);

        System.out.println("-----------------------------------");

        // Adding hours with wrap-around
        Time t6 = new Time(20, 10, 0);
        System.out.println("Adding 10 hours to " + t6);

        t6.addHours(10); // wraps around (20 + 10 = 06)
        System.out.println(t6);

        System.out.println("-----------------------------------");

        // Combining multiple adds
        Time t7 = new Time(5, 30, 30);
        System.out.println("Multiple add operations to " + t7);

        t7.addHours(1);
        t7.addMinutes(40);
        t7.addSeconds(500); // 8 minutes 20 sec
        System.out.println(t7);

        System.out.println("-----------------------------------");

    }

}
