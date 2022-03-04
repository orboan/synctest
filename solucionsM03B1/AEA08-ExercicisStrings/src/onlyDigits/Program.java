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
     * Determines whether a string has only digits.
     * 
     * @param s a string.
     * @return true if s has only digits, false otherwise.
     */
    public boolean onlyDigits(String s) {
        char c;
        boolean charsNoDigits = false;
        int i = 0;
        // Traverse the string
        while (i < s.length() && !charsNoDigits) {
            c = s.charAt(i);
            // If there is a character that is not a digit, go out of the loop
            //if ((int) c < 48 || ((int) c > 57)) {
            if (c < '0' || c > '9') {
                charsNoDigits = true;
            }
            i++;
        }
        return !charsNoDigits;
    }
}
