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
     * Determines wheter a string has more vowels than other characters.
     * 
     * @param s a string.
     * @return true if has more vowels, false otherwise.
     */
    public boolean moreVowels(String s) {
        int nv = 0, nc = 0, i;
        char c;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || 
                c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                nv++;
            } else {
                nc++;
            }
        }
        return nv > nc;
    }

}
