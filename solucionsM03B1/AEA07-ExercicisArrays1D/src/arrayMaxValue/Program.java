/*
 * Program.java        1.0 28/11/2011
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
     * Find the greatest value of an integer array.
     * 
     * @param array A not empty integer array
     * @return the greatest value
     */
    public int findMaxValue(int[] array) {
        // Initialize the max value with the first element of the array
        int maxValue = array[0];
        // Traverse the rest of the array
        for (int i = 1; i < array.length; i++) {
            // If a greater number is found, it becomes the maximum
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
