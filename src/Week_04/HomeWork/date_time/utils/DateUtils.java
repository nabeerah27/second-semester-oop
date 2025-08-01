package Week_04.HomeWork.date_time.utils;

public class DateUtils {

    // Validates if a given day, month, and year form a valid date.
    // Ensures month is 1-12, year is positive, and day is within month’s limits.

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || year < 1)
        {
            return false;
        }
        int daysInMonth = getDaysInMonth(month, year);
        return day >= 1 && day <= daysInMonth;
    }

    // Returns the number of days in a given month of a given year.
    public static int getDaysInMonth(int month, int year) {
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 4: case 6: case 9: case 11:
                return 30;

            // February is handled based on leap year calculation.
            case 2:
                return isLeapYear(year) ? 29 : 28;

            default:
                return 0;
        }
    }

    // Checks if a given year is a leap year.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Converts a month number (1-12) to its corresponding name.
    public static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12)
        {
            return monthNames[month - 1];
        }
        else
        {
            return "Invalid Month";
        }
    }


}
