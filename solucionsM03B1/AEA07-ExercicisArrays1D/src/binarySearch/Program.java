/*
 * binarySearch.java        1.0 30/11/2011
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

public class Program {

    /**
     * Search an element in an array.
     * 
     * @param a an array
     * @param n an integer number
     * @return true if n is in a, false otherwise
     */
    public boolean binarySearch(int[] a, int n) {
        int center, low, top;
        boolean found = false;
        // Sort the array
        Arrays.sort(a);
        low = 0; // First index
        top = a.length - 1; // Last index
        while (low <= top && !found) {
            // found the middle point between low and top
            center = (top + low) / 2;
            if (a[center] == n) { // Element found!
                found = true;
            } else if (n < a[center]) {
                // The element, if exists, it's in the left half of the table
                top = center - 1;
            } else {
                // The element, if exists, it's in the right half of the table
                low = center + 1;
            }

        }
        return found;
    }

}
