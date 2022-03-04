/*
 * Program.java        1.0 25/10/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Get how many days a month has.
     * 
     * @param m a month
     * @param y a year
     * @return the number of days of the month
     */
    public int getNumberOfDays(int m, int y) {
        int numberOfDays;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            numberOfDays = 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            numberOfDays = 30;
        } else if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { // We now the month is February            
            numberOfDays = 29;
        } else { // We know the month is February and it's not a leap year
            numberOfDays = 28;
        }
        return numberOfDays;
    }

}
