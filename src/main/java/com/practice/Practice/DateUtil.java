package com.practice.Practice;

/**
 * Given a specific date, return the day of the year for that date.
 * @author Yang
 */
public class DateUtil {
    private DateUtil() {}

    /**
     * Given a specific date, return the day of the year for that date.
     * @param year
     * @param month
     * @param day
     * @return the day of the year for that date, return -1 for invalid input
     */
    public static int dayOfYear(int year, int month, int day) {
        // define the number of days in each month of the year
        int[] daysOfMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // validate input
        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || ((!isLeapYear(year) || month != 2) && day > daysOfMonth[month - 1]) || (isLeapYear(year) && month == 2 && day > daysOfMonth[month - 1] + 1)) {
            return -1;
        }

        // the days in the month
        int days = day;

        // calculate the days in the previous months
        for (int i = 0; i < month - 1; i++) {
            days += daysOfMonth[i];
        }

        // if it is a leap year, there is an extra day
        return isLeapYear(year) && month > 2 ? days + 1 : days;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
