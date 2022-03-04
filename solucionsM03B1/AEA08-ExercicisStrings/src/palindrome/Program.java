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
     * Determines whether a string is a palindrome.
     * 
     * @param s a string
     * @return true if s is a plaindrome, false otherwise.
     */
    public boolean isPalindrome(String s) {
        boolean differentsChars = false;
        int ilr, irl; // ilr: index from left to right, irl: index from right to
                      // left
        char clr, crl; // clr: char in ilr, crl: char in irl
        ilr = 0;
        irl = s.length() - 1;        
        while (ilr < irl && !differentsChars) {
            clr = s.charAt(ilr);
            crl = s.charAt(irl);
            // Check whether chracters are different
            if (clr != crl && clr != ' ' && crl != ' ') {
                differentsChars = true;
            }
            // If chars are equal, move indexs
            if (!differentsChars) {
                if (clr == ' ' && crl != ' ') {
                    ilr++;
                } else if (clr != ' ' && crl == ' ') {
                    irl--;
                } else {
                    ilr++;
                    irl--;
                }
            }
        }
        return !differentsChars;
    }

}
