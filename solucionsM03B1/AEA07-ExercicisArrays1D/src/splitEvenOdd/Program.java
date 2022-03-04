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
     * Splits an array to build two arrays with the even numbers and the odd
     * numbers of the first array. Finally, prints these two arrays.
     * 
     * @param array an array
     */
    public void splitEvenOdd(int[] array) {
        int[] arrayEven = new int[array.length], arrayOdd = new int[array.length];
        int i, iEven = 0, iOdd = 0;
        // Fill the two arrays
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[iEven] = array[i];
                iEven++;
            } else {
                arrayOdd[iOdd] = array[i];
                iOdd++;
            }
        }
        // Print the ywo new arrays
        System.out.printf("\nParells: ");
        for (i = 0; i < iEven; i++)
            System.out.printf("%d ", arrayEven[i]);
        System.out.printf("\nSenars:  ");
        for (i = 0; i < iOdd; i++)
            System.out.printf("%d ", arrayOdd[i]);
        System.out.printf("\n\n");
    }
}
