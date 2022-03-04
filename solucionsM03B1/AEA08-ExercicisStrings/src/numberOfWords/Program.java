/*
 * Program.java        1.0 08/01/2012
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
     * Counts how many words a string has.
     * 
     * @param str a string
     * @return the number of words of s
     */
    public int numberOfWords(String str) {
        int imax, i, np;
        boolean previousBlankSpace = true, isBlankSpace;
        char c;
        str = str.trim();
        imax = str.length() - 1;
        np = 0;
        for (i = 0; i <= imax; i++) {
            c = str.charAt(i);
            // Store whether the current character is a space
            isBlankSpace = (c == ' ');
            // If a word is beggining, count it
            if (previousBlankSpace && !isBlankSpace) {
                np++;
            }
            // Store if the current character is a space, to remember it in the
            // next iteration
            previousBlankSpace = isBlankSpace;
        }
        return np;
    }

}
