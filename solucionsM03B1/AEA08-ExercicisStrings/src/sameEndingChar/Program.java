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
     * Determines if all the words of a string end with the same character.
     * 
     * @param s a string
     * @return true if all the words ens with the same character, false
     *         otherwise.
     */
    public boolean sameEndingChar(String s) {
        int i = 0, space;
        char lc;
        boolean sec = true;
        // Remove leading and trailing whitespace.
        s = s.trim();
        // Store the last character of the string.
        lc = s.charAt(s.length() - 1);
        // Find the first whitespace of the string (if there are no whitespaces,
        // it means we only have a word)
        space = s.indexOf(' ');
        // Loop that traverses all the characters of the string. It ends when
        // the string ends or when we find a word that ends with a character
        // that is different to lc
        while (i < s.length() && sec && space > 0) {
            // If the current character is a space, check the previous
            // character. If it isn't a space and isn't equals to the last
            // character of the last word, go out of the loop because
            // not all words end with the same character
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != lc && s.charAt(i - 1) != ' ') {
                sec = false;
            }
            i++;
        }
        // If sec is true, it means that all words end with the same character
        return sec;
    }
}
