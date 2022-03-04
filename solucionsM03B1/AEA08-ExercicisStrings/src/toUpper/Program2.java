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
     * Converts all of the characters of a string to upper case.
     * 
     * @param s a string
     * @return s converted to uppercase
     */
    public String toUpper(String str1) {
        int i;
        String str2 = "";
        char c;
        // Traverse characters of s
        for (i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            // If the character is lowercase
            if (c >= 'a' && c <= 'z'){
                //c = (char) (c - ('a'-'A')); // Convert to uppercase
                c = (char) (c + 'A' - 'a'); // Convert to uppercase
            }
            str2 += c;
        }
        return str2;
    }
}
