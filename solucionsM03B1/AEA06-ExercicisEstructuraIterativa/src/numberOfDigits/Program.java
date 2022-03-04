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
     * Calculates the number of digits of an integer number.
     * 
     * @param n an integer number.
     * @return the number of digits of n.
     */
    public int numberOfDigits(int n) {
        int i, nd;
        i = n;
        nd = 0;
        while (i != 0) {
            nd++;
            i = i / 10; // Remove the last digit
        }
        if (n == 0) { // The special case of 0
            nd = 1;
        }
        return nd;
    }

}
