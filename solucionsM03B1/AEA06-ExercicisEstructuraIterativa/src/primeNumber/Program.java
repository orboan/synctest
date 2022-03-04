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
     * Determines if a number is prime.
     * 
     * @param n an integer number.
     * @return true if n is prime or false, otherwise.
     */
    public boolean isPrime(int n) {
        int i;
        boolean isDivisor;
        i = 2;
        isDivisor = false;
        // Check if there is a divisor of n between 2 and n-1
        while (i <= n - 1 && !isDivisor) {
            // Check if divides n
            isDivisor = n % i == 0;
            i++;
        }
        return !isDivisor;
    }

}
