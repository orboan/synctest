/*
 * Program.java        1.0 11/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Verifies if a date is valid.
     * 
     * @param day an integer number that represents a day number (1-31).
     * @param month an integer number that represents a month number (1-12).
     * @param year an integer number that represents a year
     * @return true if the date day/month/year is valid, false otherwise
     */
    public boolean isDate(int day, int month, int year) {
        // Validate if it is a date with a month of 30 days
        // (April, June, September or November)
        boolean isValidDateMonth30days = 0 < day && day <= 30
                && (month == 4 || month == 6 || month == 9 || month == 11)
                && 1583 <= year && year <= 3000;
        // Validate if it is a date with a month of 31 days
        // (January, March, May, July, August, October or December)
        boolean isValidDateMonth31days = 0 < day
                && day <= 31
                && (month == 1 || month == 3 || month == 5 || month == 7
                        || month == 8 || month == 10 || month == 12)
                && 1583 <= year && year <= 3000;
        // Validate if it is a date with a month of 28 days.
        // (February)
        boolean isValidDateMonth28days = 0 < day && day <= 28 && month == 2
                && 1583 <= year && year <= 3000;
        // Validate if it is a date with a month of 29 days.
        // (February in a leap year)
        boolean isValidDateMonth29days = 0 < day && day <= 29 && month == 2
                && 1583 <= year && year <= 3000
                && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        // If any of the above conditions is true, the date is valid.
        boolean isValidDate = isValidDateMonth30days || isValidDateMonth28days
                || isValidDateMonth29days || isValidDateMonth31days;
        return isValidDate;
    }
}
