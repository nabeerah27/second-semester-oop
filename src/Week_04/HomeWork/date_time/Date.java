package Week_04.HomeWork.date_time;

import Week_04.HomeWork.date_time.utils.DateUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date {

    // Attributes to store day, month and year
    private int day;
    private int month;
    private int year;

    // Default constructor sets a safe default date
    public Date() {
        setDate(1, 1, 2000);
    }

    // Parameterized Constructor with validation
    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    // Getters
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // Sets the date after validating it using DateUtils.
    // If invalid, automatically resets to default date (01/01/2000).

    public void setDate(int day, int month, int year) {
        if(DateUtils.isValidDate(day, month, year))
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
        {
            System.out.println("Invalid date! Day/Month/Year combination is not valid.");
            setDate(1, 1, 2000);    // fallback to default date
        }
    }

    // Uses java.time.LocalDate to get the name of the day of the week (e.g., Monday).
    public String getDayOfWeek() {

        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        // Capitalize the first letter (e.g., Monday instead of MONDAY)
        return dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();
    }

    // Returns a formatted string representation of the date e.g., "Saturday, January 01, 2000"
    @Override
    public String toString() {
        return String.format("%s, %s %02d, %d", getDayOfWeek(),
                DateUtils.getMonthName(month), day, year);
    }
}
