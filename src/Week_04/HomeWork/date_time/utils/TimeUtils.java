package Week_04.HomeWork.date_time.utils;

public class TimeUtils {

    // Validates hours (0-23)
    public static boolean isValidHour(int hour) {
        return hour >= 0 && hour < 24;
    }

    // Validates minutes or seconds (0-59)
    public static boolean isValidMinuteOrSecond(int value) {
        return value >= 0 && value < 60;
    }

    // Unified error message printer
    public static void printInvalid(String type) {

        switch (type.toLowerCase())
        {
            case "hours":
                System.out.println("Invalid hours! Must be between 0 and 23.");
                break;

            case "minutes":
                System.out.println("Invalid minutes! Must be between 0 and 59.");
                break;

            case "seconds":
                System.out.println("Invalid seconds! Must be between 0 and 59.");
                break;

            default:
                System.out.println("Invalid time! Hours 0-23, minutes and seconds 0-59.");

        }
    }

}
