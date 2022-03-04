/*
 * Program2.java        1.0 08/01/2012
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Determines if two strings have the same content.
     * 
     * @param s1 a string
     * @param s2 a string
     * @return true if s1 and s2 are equals, false otherwise
     */
    public boolean areEquals(String s1, String s2) {
        boolean equals = true;
        int i;
        if (s1.length() != s2.length()) {
            equals = false;
        } else {
            i = 0;
            while (i < s1.length() && equals) {
                // If there is a character that is not equal, strings are note
                // equal
                if (s1.charAt(i) != s2.charAt(i)) {
                    equals = false;
                }
                i++;
            }
        }
        return equals;
    }

}
