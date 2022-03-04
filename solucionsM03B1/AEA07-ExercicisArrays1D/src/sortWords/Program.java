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
     * Sort an array of words and prints the sorted array.
     * 
     * @param words an array
     */
    public void sortWords(String[] words) {
        String aux;
        int i, j;
        for (i = 0; i < words.length; i++) {
            for (j = words.length - 1; j > i; j--) {
                if (words[j - 1].compareTo(words[j]) > 0) {
                    aux = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = aux;
                }
            }
        }
        System.out.printf("\nArray ordenat \n");
        for (i = 0; i < words.length; i++) {
            System.out.printf("%s\n", words[i]);
        }
        System.out.printf("\n");
    }

}
