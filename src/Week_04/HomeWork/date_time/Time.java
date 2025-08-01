package Week_04.HomeWork.date_time;

import Week_04.HomeWork.date_time.utils.TimeUtils;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    // Null constructor to set default values of attributes
    public Time() {
        setTime(0, 0, 0);
    }

    // Parameterized constructor
    public Time(int hours, int minutes, int seconds) {
        // Start from zero to avoid double counting
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

        // Reuse addSeconds for normalization
        addSeconds((hours * 3600) + (minutes * 60) + seconds);
    }

    // Getter for hours, minutes and seconds
    public int getHrs() { return hours; }
    public int getMins() { return minutes; }
    public int getSec() { return seconds; }

    // Setter to set time
    public void setTime(int hours, int minutes, int seconds) {
        if (TimeUtils.isValidHour(hours) && TimeUtils.isValidMinuteOrSecond(minutes) &&
            TimeUtils.isValidMinuteOrSecond(seconds))
        {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else
        {
            TimeUtils.printInvalid("Invalid");
        }
    }

    // Add seconds in current seconds
    public void addSeconds(int seconds) {
        int totalSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds + seconds;

        this.hours = (totalSeconds / 3600) % 24;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    // Add minutes in current minutes
    public void addMinutes(int minutes) {
        addSeconds(minutes * 60);
    }

    // Add hours in current hours
    public void addHours(int hours) {
        addSeconds(hours * 3600);
    }

    // Returns a formatted string representation of the time e.g., "00:00:00"
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }


}
