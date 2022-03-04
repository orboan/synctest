/*
 * Program.java        1.0 24/10/2011
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
     * Determines the minimum number of two real numbers.
     * 
     * @param n1 a real number.
     * @param n2 a real number.
     * @return the minimum number.
     */
    public double min2(double n1, double n2) {
        double min;
        if (n1 < n2) {
            // If n1 is smaller than n2, n1 is the minimum number
            min = n1;
        } else {
            // If n2 is smaller or equals than n1, n2 is the minimum number
            min = n2;
        }
        return min;

        // WRONG SOLUTION 1
        // if (n1 < n2) {
        //    // If n1 is smaller than n2, n1 is the minimum number
        //    min = n1;
        // } else if(n2 <= n1) {
        //    // If n2 is smaller or equals than n1, n2 is the minimum number
        //    min = n2;
        // }

        // WRONG SOLUTION 2
        // if (n1 < n2) {
        //    // If n1 is smaller than n2, n1 is the minimum number
        //    min = n1;
        // } 
        // if(n2 <= n1) {
        //    // If n2 is smaller or equals than n1, n2 is the minimum number
        //    min = n2;
        // }

    }
}
