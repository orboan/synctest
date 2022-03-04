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
     * Determines the greatest number of 3 real numbers .
     * 
     * @param n1 a real number
     * @param n2 a real number
     * @param n3 a real number
     * @return the greatest number
     */
    public double max3(double n1, double n2, double n3) {
        double max;
        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            max = n2;
        } else {
            max = n3;
        }
        return max;
    }
}