package lesson_1.excercises.date;

public class Date {
    public int day;
    public int month;
    public int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public void setDay(int input) {
        this.day = input;
    }

    public void setMonth(int input) {
        this.month = input;
    }

    public void setYear(int input) {
        this.year = input;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String displayDate(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}
