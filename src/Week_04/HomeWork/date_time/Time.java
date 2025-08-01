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
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        this.hours = (totalSeconds / 3600) % 24;    // Normalize hours (24-hour format)
        this.minutes = (totalSeconds % 3600) / 60;  // Extract remaining minutes
        this.seconds = totalSeconds % 60;           // Extract remaining seconds
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

    public void addSeconds(int seconds) {
        int newSec = seconds + this.seconds;
        int extraMinutes = newSec / 60;
        this.seconds = newSec % 60;

        if(extraMinutes > 0)
        {
            addMinutes(extraMinutes);
        }
    }

    public void addMinutes(int minutes) {
        int newMins = minutes + this.minutes;
        int extraHours = newMins / 60;
        this.minutes = newMins % 60;

        if(extraHours > 0)
        {
            addHours(extraHours);
        }
    }

    public void addHours(int hours) {
        this.hours = (this.hours + hours) % 24;
    }

    @Override
    public String toString() {
        return String.format("Time is: %02d:%02d:%02d", hours, minutes, seconds);
    }


}
