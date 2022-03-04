/*
 * Program.java        1.0 08/01/2012
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
     * Determines what is the most repeated character and how many times appears
     * in the string.
     * 
     * @param str a string
     * @return an array with two cells: in the first cell there is ASCII value
     *         of the most repeated character, in the second cell there is the
     *         number of occurrences of this character
     */
    public int[] moreRepeatedChar(String str) {
        int i, j, nc, nrep, nrepmax;
        char c1, c2, crepmax;
        nc = str.length();
        crepmax = str.charAt(0);
        nrepmax = 1;
        // Traverse the string
        for (i = 0; i < nc; i++) {
            c1 = str.charAt(i);
            // Count how many times appears the char in position i
            nrep = 0;
            for (j = 0; j < nc; j++) {
                c2 = str.charAt(j);
                if (c1 == c2) {
                    nrep++;
                }
            }
            // If it is the most repeated, change the values
            if (nrepmax < nrep) {
                nrepmax = nrep;
                crepmax = c1;
            }
        }
        // Fill the array with the results
        int[] ar = new int[2];
        ar[0] = crepmax;
        ar[1] = nrepmax;
        return ar;
    }

}
