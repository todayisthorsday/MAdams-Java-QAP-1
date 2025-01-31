public class Time {
    // Private instance variables
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter for hour
    public int getHour() {
        return hour;
    }

    // Setter for hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Getter for minute
    public int getMinute() {
        return minute;
    }

    // Setter for minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Getter for second
    public int getSecond() {
        return second;
    }

    // Setter for second
    public void setSecond(int second) {
        this.second = second;
    }

    // Method to set time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to return string representation of the time in "hh:mm:ss" format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to advance time by one second
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to go back by one second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}