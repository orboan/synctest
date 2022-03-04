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
     * Determines if a number is a square number.
     * 
     * @param n an integer number
     * @return true if n is a square a number or false, otherwise.
     */
    public boolean isSquareNumber(int n) {
        int s;
        boolean found = false;
        if (n >= 0) {
            s = 0;
            while (s * s <= n && !found) {
                found = n == s * s;
                if (!found) {
                    s++;
                }
            }
        }
        return found;
    }
}
