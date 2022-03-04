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
     * Get the first vowel of the string. If there are no vowels, returns ' '.
     * 
     * @param s a string.
     * @return the first vowel or ' '.
     */
    public char firstVowel(String s) {
        int i;
        char vowel = ' ', c;
        boolean vowelFound = false;
        i = 0;
        // Traverse the string
        while (i < s.length() && !vowelFound) {
            c = s.charAt(i);
            // If a vowel is found, store the found vowel and go out the loop
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
                c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                vowel = c;
                vowelFound = true;
            }
            i++;
        }
        return vowel;
    }

}
