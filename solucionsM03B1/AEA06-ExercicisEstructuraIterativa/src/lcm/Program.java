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
     * Calculates the least common multiple of two numbers.
     * 
     * @param a an integer number.
     * @param b an integer number.
     * @return the least common multiple of a and b.
     */
    public int lcm(int a, int b) {
        int lcm, aux;
        boolean found = false;
        // Set a with the minimum number
        if (b < a) {
            aux = a;
            a = b;
            b = aux;
        }
        lcm = b; // This is the minimum candidate to be the LCM
        while (!found) {
            // lcm is the least common multiple
            // if it can be divided by a and b
            found = lcm % a == 0 && lcm % b == 0;
            if (!found) {
                lcm++;
            }
        }
        return lcm;
    }
}
