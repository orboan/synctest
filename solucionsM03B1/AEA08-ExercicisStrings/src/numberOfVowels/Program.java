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
     * Calculates how many vowels a string has.
     * 
     * @param s a string.
     * @return the number of vowels.
     */
    public int numberOfVowels(String s) {
        int nv = 0, i;
        char c;
        String sl = s.toLowerCase();
        for (i = 0; i < sl.length(); i++) {
            c = sl.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || 
                c == 'o' || c == 'u') {
                nv++;
            }
        }
        return nv;
    }

}
