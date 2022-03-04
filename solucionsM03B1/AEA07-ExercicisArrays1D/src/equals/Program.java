/*
 * Program.java        1.0 12/12/2011
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
     * Determines if two arrays are equal.
     * 
     * @param a1 an array
     * @param a2 an array
     * @return true if a1 and a2 are equals, false otherwise
     */
    public boolean equals(int[] a1, int[] a2) {
        int i;
        boolean areEqual = true;
        // If the two arrays have not the same length, they are not equals
        if (a1.length != a2.length) {
            areEqual = false;
        } else {
            // If tthey have the same length, check if they have the same
            // elements
            i = 0;
            while (i < a1.length && areEqual) {
                if (a1[i] != a2[i]) {
                    areEqual = false;
                }
                i++;
            }
        }
        return areEqual;
    }

}
