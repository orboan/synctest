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
     * Merge two sorted arrays.
     * 
     * @param a1 a sorted array
     * @param a2 a sorted array
     * @return the merged array
     */
    public int[] merge(int[] a1, int[] a2) {
        int i1 = 0, i2 = 0, j = 0, k = 0;
        int[] a3 = new int[a1.length + a2.length];
        // While we have elements in the two arrays, we pick the elements in
        // order.
        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] <= a2[i2]) {
                a3[j] = a1[i1];
                i1++;
            } else {
                a3[j] = a2[i2];
                i2++;
            }
            j++;
        }
        // Put the lements of the array that still has elements.
        if (i1 < a1.length) {
            for (k = j; k < a3.length; k++) {
                a3[k] = a1[i1];
                i1++;
            }
        } else {
            for (k = j; k < a3.length; k++) {
                a3[k] = a2[i2];
                i2++;
            }
        }
        return a3;
    }
}
