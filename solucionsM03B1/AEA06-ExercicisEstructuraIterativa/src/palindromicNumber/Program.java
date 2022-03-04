/*
 * Program.java        1.0 08/11/2011
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
     * Determines whether an integer number is palindromic.
     * 
     * @param n an integer number
     * @return true if n is palindromic, false otherwise.
     */
    public boolean isPalindromic(int n) {
        int i, inv;
        n = Math.abs(n); // Remove the sign
        i = n;
        inv = 0;
        while (i >= 1) {
            // Add the last digit of i to the end of inv
            inv = inv * 10 + i % 10;            
            // Remove the last digit
            i = i / 10;
        }
        return n == inv;
    }

}
