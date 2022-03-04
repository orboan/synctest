/*
 * Program.java        1.0 30/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program2 {

    /**
     * Sort an arrray with the bubble sort slgorithm.
     * 
     * @param a an array
     */
    public void bubbleSort(double[] a) {
        double aux;
        int i, j;
        // Traverse the array from the beginning to the end.
        for (i = 0; i < a.length; i++) {
            // Traverse the array from the last but one element until the first
            // unsorted element
            for (j = a.length - 1; j > i; j--) {
                // Put small elements to the left of the table 
                if (a[j] < a[j - 1]) {
                    aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                }
            }
        }
        // Print the sorted table
        System.out.println(Arrays.toString(a));
    }

}
