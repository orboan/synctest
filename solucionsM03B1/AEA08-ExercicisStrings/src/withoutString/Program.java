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
     * Removes a substring from a string.
     * 
     * @param str1 a string
     * @param str2 a string
     * @return a copy of str1 with the first occurrence of s2
     */
    public String withoutString(String str1, String str2) {
        String sf;
        int s = 0, imaxstr1, imaxstr2;
        imaxstr1 = str1.length() - 1;
        imaxstr2 = str2.length() - 1;
        // Get the position where str2 is (inside str1)
        s = str1.indexOf(str2);
        if (s != -1) {
            // Build the string without the substring
            sf = str1.substring(0, s) + 
                 str1.substring(s + imaxstr2 + 1, imaxstr1 + 1);
        } else {
            sf = str1;
        }
        return sf;
    }
}
