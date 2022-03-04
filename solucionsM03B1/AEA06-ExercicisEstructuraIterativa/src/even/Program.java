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
     * Determines whether a positive integer number is even.
     * 
     * @param n a positive integer number
     * @return true if -n- is even, false otherwise
     */
    public boolean isEven(int n) {
        while (n >= 2) {
            n = n - 2;
        }
        return n == 0;
    }

}
