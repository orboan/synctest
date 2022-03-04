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
     * Calculates how many times a character appears in a string.
     * 
     * @param s a string.
     * @param c a character.
     * @return the number of time that c appears in s.
     */
    public int occurrencesOfChar(String s, char c) {
        int i = 0;
        int num = 0;
        while (i < s.length()) {
            if (s.charAt(i) == c) {
                num++;
            }
            i++;
        }
        return num;
    }

}
