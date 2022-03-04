/*
 * Program2.java        1.0 08/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {
    
    /**
     * Determine if two integer numbers are amicable.
     * 
     * @param a an integer number.
     * @param b an integer number.
     * @return true if a and b are amicable, false otherwise.
     */
    public int sumDivisors(int n) {
        int sdn = 0, i;
        // Sum the divisors
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sdn = sdn + i;
            }
        }
        return sdn;
    }   

    /**
     * Determine if two integer numbers are amicable.
     * 
     * @param a an integer number.
     * @param b an integer number.
     * @return true if a and b are amicable, false otherwise.
     */
    public boolean areAmicableNumbers(int a, int b) {
        int da = 0, db = 0;
        boolean areAmicable;
        // Sum the divisors of the first number
        da = sumDivisors(a);
        // Sum the divisors of the second number
        db = sumDivisors(b);
        // Determine if a and b are amicables.
        if (a == 0 && b == 0) {
            areAmicable = false; // 2 0s is a special case
        } else if (da == b && db == a) {
            areAmicable = true;
        } else {
            areAmicable = false;
        }
        return areAmicable;
    }
}
