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
     * Searches the multiples of the last element of an array and builds another
     * array with these elements.
     * 
     * @param array an array
     * @return an array with the multiples.
     */
    public int[] multipleLast(int[] array) {
        int nMultiples = 0;
        // Find out how many mutiples there are.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[array.length - 1] == 0) {
                nMultiples++;
            }
        }
        // Creates an array with as many cells as multiples.
        int[] multiples = new int[nMultiples];
        int j = 0;
        // Fill the array with the multiples.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[array.length - 1] == 0) {
                multiples[j] = array[i];
                j++;
            }
        }
        return multiples;
    }

}
