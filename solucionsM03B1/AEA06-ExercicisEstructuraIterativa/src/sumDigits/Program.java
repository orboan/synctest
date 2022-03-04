/*
 * Program.java        1.0 08/11/2011
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
     * Sum the digits of a number.
     * 
     * @param n an integer number.
     * @return the sum.
     */
    public int sumDigits(int n) {
        int digit, i, sum = 0;
        // Remove the sign
        n = Math.abs(n);
        i = n;
        digit = i % 10;
        while (i != 0) {
            sum = sum + digit; // Add 1 to the number of digits
            i = i / 10; // Remove the last digit
            digit = i % 10; // Save the last digit
        }
        return sum;
    }
}
