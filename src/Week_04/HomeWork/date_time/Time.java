package Week_04.HomeWork.date_time;

import Week_04.HomeWork.date_time.utils.TimeUtils;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    // Parameterized constructor
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Getter for hours, minutes and seconds
    public int getHrs() { return hours; }
    public int getMins() { return minutes; }
    public int getSec() { return seconds; }

    // Setters for hours, minutes and seconds (separately)
    public void setHrs(int hours) {
        if (TimeUtils.isValidHour(hours))
        {
            this.hours = hours;
        }
        else
        {
            TimeUtils.printInvalid("hours");
        }
    }

    public void setMins(int minutes) {
        if(TimeUtils.isValidMinuteOrSecond(minutes))
        {
            this.minutes = minutes;
        }
        else
        {
            System.out.println("minutes");
        }
    }

    public void setSec(int seconds) {
        if (TimeUtils.isValidMinuteOrSecond(seconds))
        {
            this.seconds = seconds;
        }
        else
        {
            System.out.println("seconds");
        }
    }

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
