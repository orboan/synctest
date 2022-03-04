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
     * Determines the greatest number of two real numbers.
     * 
     * @param n1 a real number.
     * @param n2 a real number.
     * @return the greatest number.
     */
    double max2(double n1, double n2) {
        double max;
        if (n1 > n2) {
            // If n1 is greater than n2, n1 is the greatest number
            max = n1;
        } else {
            // If n2 is greater or equals than n1, n2 is the greatest number
            max = n2;
        }
        return max;
    }
}
