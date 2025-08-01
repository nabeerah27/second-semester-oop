package Week_04.HomeWork;

import Week_04.HomeWork.date_time.Date;

public class TestDate {

    public static void main(String[] args) {

        // Default constructor
        Date d1 = new Date();

        System.out.println("Default Date:");
        System.out.println(d1);

        System.out.println("-----------------------------------");

        // Parameterized constructor with valid date
        Date d2 = new Date(27, 2, 2025);

        System.out.println("Valid Date:");
        System.out.println(d2);

        System.out.println("-----------------------------------");

        // Parameterized constructor with invalid date (Feb 30 → fallback to default)
        Date d3 = new Date(30, 2, 2024);

        System.out.print("Fall back to default date: ");
        System.out.println(d3);

        System.out.println("-----------------------------------");

        // Leap year test (Feb 29, 2024 is valid)
        Date d4 = new Date(29, 2, 2024);

        System.out.println("Leap Year Date:");
        System.out.println(d4);

        System.out.println("-----------------------------------");

        // Using setDate with valid date
        Date d5 = new Date();

        d5.setDate(14, 8, 1947);
        System.out.println("Set Date to Independence day:");
        System.out.println(d5);

        System.out.println("-----------------------------------");

        // Using setDate with invalid date → fallback
        d5.setDate(31, 11, 2025); // Nov has 30 days
        System.out.println("Fall back to default date: " + d5);

        System.out.println("-----------------------------------");

        // Getting day of the week for a given date
        Date d6 = new Date(25, 8, 2026);

        System.out.println("Day of the Week for 25 August 2026:");
        System.out.println(d6.getDayOfWeek());

        System.out.println("-----------------------------------");

    }
}
