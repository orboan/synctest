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
     * Calculates the integer part of the square root of a number. This
     * algorithm doesn't use Math.sqrt().
     * 
     * @param a an integer number.
     * @return the integer part of the square root of a.
     */
    public int mySqrt(int a) {
        int s = 0;
        while (s * s <= a) {
            s++;
        }
        return s - 1;
    }
}
