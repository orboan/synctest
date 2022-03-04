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

public class Program2 {

    /**
     * Determines if a string is a substring of another string.
     * 
     * @param s1 a string
     * @param s2 a string
     * @return true if s2 is a substring of s1, false otherwise.
     */
    public boolean isSubstring(String s1, String s2) {
        String sub;
        boolean esSubstring = false;
        int i;
        // If s2 length is greater than s1 length, s2 can't be a substring of s1
        if (s1.length() < s2.length()) {
            esSubstring = false;
        } else {
            i = 0;
            // Traverse s1 doing substrings of s2 length
            while (i <= s1.length() - s2.length() && !esSubstring) {
                sub = s1.substring(i, i + s2.length());
                if (sub.equals(s2)) {
                    esSubstring = true;
                }
                i++;
            }
        }
        return esSubstring;
    }

}
