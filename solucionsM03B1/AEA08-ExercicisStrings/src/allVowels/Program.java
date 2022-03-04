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
     * Determines whether a string contains all the vowels.
     * 
     * @param s a string.
     * @return trues if s has all the vowels, false otherwise.
     */
    public boolean allVowels(String s) {
        char c;
        int j;
        boolean a = false, e = false, i = false, o = false, u = false;
        for (j = 0; j < s.length(); j++) {
            c = s.charAt(j);
            if (c == 'A' || c == 'a') {
                a = true;
            } else if (c == 'E' || c == 'e') {
                e = true;
            } else if (c == 'I' || c == 'i') {
                i = true;
            } else if (c == 'O' || c == 'o') {
                o = true;
            } else if (c == 'U' || c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }

}
