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
     * Determines if a positive integer is a perfect number.
     * 
     * @param n a positive integer.
     * @return true if n is perfect or false otherwise.
     */
    public boolean isPerfectNumber(int n) {
        int i, sum = 0;
        for (i = 1; i < n; i++) {
            // Sum all the divisors of i
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }

}
