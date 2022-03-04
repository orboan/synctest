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
     * Determines if the elements of an array are sorted
     * 
     * @param array an array
     * @return true if the elements are sorted, false otherwise
     */
    public boolean areSorted(int[] array) {
        boolean sorted = true;
        int i = 0;
        while (i < array.length - 1 && sorted) {
            // If we find two elements that are not sorted, the array is not
            // sorted.
            if (array[i] > array[i + 1]) {
                sorted = false;
            }
            i++;
        }
        return sorted;
    }

}
