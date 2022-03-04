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
     * Determines the most frequent element of an array. If there are more than
     * one element that is the most frequent, returns the one that is in the
     * minimum index.
     * 
     * @param array an array.
     * @return the most frequent element.
     */
    public int frequent(int[] array) {
        int maxFrequence = 0, frequence = 0;
        int mostFrequent = array[0];
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            // Calculate how many times the element is in the array
            frequence = 0;
            for (int j = 0; j < array.length; j++) {
                // f += array[i] == array[j] ? 1 : 0;
                if (array[i] == array[j]) {
                    frequence++;
                }
            }
            // If this element is more frequent, change the most frequent
            // element
            if (frequence > maxFrequence) {
                maxFrequence = frequence;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }

}
