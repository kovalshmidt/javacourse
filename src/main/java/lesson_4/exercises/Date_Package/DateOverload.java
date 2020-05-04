package lesson_4.exercises.Date_Package;

public class DateOverload {
    private int day;
    private int Month;
    private int year;
    private String monthStr;
    private int yearDays;

    public DateOverload(int day, int month, int year) {
        this.day = day;
        Month = month;
        this.year = year;
    }

    public DateOverload(int day, int year, String monthStr) {
        this.day = day;
        this.year = year;
        this.monthStr = monthStr;
    }

    public DateOverload(int year, int yearDays) {
        this.year = year;
        this.yearDays = yearDays;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return year;
    }

    public String getMonthStr() {
        return monthStr;
    }

    public int getYearDays() {
        return yearDays;
    }
}
