package lesson_4.exercises.Date_Package;

/**
 * Create class Date with the following capabilities:
 * a) Output the date in multiple formats, such as
 * MM/DD/YYYY
 * June 14, 1992
 * DDD YYYY
 * b) Use overloaded constructors to create Date objects initialized with dates of the formats in part (a). In
 * the first case the constructor should receive three integer values. In the second case it should receive a
 * String and two integer values. In the third case it should receive two integer values, the first of which
 * represents the day number in the year. [Hint: To convert the String representation of the month to a
 * numeric value, compare Strings using the equals method. For example, if s1 and s2 are Strings, the
 * method call s1.equals(s2) returns true if the Strings are identical and otherwise returns false.]
 */

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month, year, yearDays;
        boolean singleDay = false, singleMonth = false, error;
        String monthStr;

        System.out.println("Type in a month:");
        do {
            error = false;
            monthStr = input.next();
            if (isStringInt(monthStr)) {
                month = Integer.parseInt(monthStr);
                monthStr = IntToStrMonth(month);
            } else {
                month = StrToIntMonth(monthStr);
            }
            if (month < 10) {
                singleMonth = true;
            }
            if ((month < 1) | (month > 12)) {
                error = true;
                System.out.println("Please type in a valid month!");
            }
        } while (error);
        System.out.println("Type in a day:");
        do {
            day = input.nextInt();
            if (day < 10) {
                singleDay = true;
            }
            error = toManyDays(day, month, false);
            if (error) {
                System.out.println("Please type in a valid day!");
            }
        } while (error);
        System.out.println("Type in a year:");
        year = input.nextInt();
        final boolean leapYear = (year % 4 == 0) && ((year % 400 == 0) ^ (year % 100 != 0));
        if (!leapYear) {
            if (day > 28) {
                day = 28;
            }

        }
        yearDays = MonthDaysToYearDays(day, month, leapYear);
        DateOverload MDY = new DateOverload(day, month, year);
        DateOverload StrMDY = new DateOverload(day, year, monthStr);
        DateOverload DaysYear = new DateOverload(year, yearDays);
        System.out.println((singleMonth ? "0" : "") + MDY.getMonth() + "/" + (singleDay ? "0" : "") + MDY.getDay() + "/" + MDY.getYear());
        System.out.println(StrMDY.getMonthStr() + " " + (singleDay ? "0" : "") + StrMDY.getDay() + " " + StrMDY.getYear());
        System.out.println("Day " + DaysYear.getYearDays() + " of the year " + DaysYear.getYear());


    }

    private static int MonthDaysToYearDays(int day, int month, boolean leapYear) {
        int yearDays;
        yearDays = day;
        switch (month) {
            case 12:
                yearDays += 30;
            case 11:
                yearDays += 31;

            case 10:
                yearDays += 30;
            case 9:
                yearDays += 31;
            case 8:
                yearDays += 31;
            case 7:
                yearDays += 30;
            case 6:
                yearDays += 31;
            case 5:
                yearDays += 30;
            case 4:
                yearDays += 31;
            case 3:
                if (leapYear) {
                    yearDays += 29;
                } else {
                    yearDays += 28;
                }
            case 2:
                yearDays += 31;
            case 1:
                break;
        }
        return yearDays;
    }

    private static boolean toManyDays(int day, int month, boolean error) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    error = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    error = true;
                }
                break;
            case 2:
                if (day > 29) {
                    error = true;
                }
        }
        return error;
    }

    private static int StrToIntMonth(String monthStr) {
        int month;
        switch (monthStr) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
            default:
                month = 13;
        }
        return month;
    }

    private static String IntToStrMonth(int month) {
        String monthStr;
        switch (month) {
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "February";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "December";
                break;
            default:
                monthStr = "Invalid month";
        }
        return monthStr;
    }

    public static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
