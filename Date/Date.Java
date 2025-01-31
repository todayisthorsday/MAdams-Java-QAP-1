public class Date {
    // Private instance variables
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to set date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to return string representation of the date in "dd/mm/yyyy" format
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}