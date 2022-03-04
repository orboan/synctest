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
     * Build an array with the elements that are even and greater than 50.
     * 
     * @return the array.
     */
    public int[] evenGreaterThan50() {
        int[] array = { 1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86 };
        int i, nEvenGreater50 = 0;
        // Calculate how many elements are evene and greater than 50
        for (i = 0; i < array.length; i++) {
            if (array[i] > 50 && array[i] % 2 == 0) {
                nEvenGreater50++;
            }
        }
        // Create the new array
        int[] arrayEvenGreater50 = new int[nEvenGreater50];
        // Fill the new array
        int j = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > 50 && array[i] % 2 == 0) {
                arrayEvenGreater50[j] = array[i];
                j++;
            }
        }
        return arrayEvenGreater50;
    }
}
