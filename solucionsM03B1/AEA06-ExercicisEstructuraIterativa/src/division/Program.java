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
     * Divide two numbers.
     * 
     * @param a the dividend of a division.
     * @param b the divisor of a division.
     * @return the string "quotient:remainder"
     */
    public String division(int a, int b) {
        int n, q, r;
        q = 0;
        // Calculate the quotient
        n = b;
        while (n <= a) {
            n = n + b;
            q++;
        }
        // Calculate the remainder: a = b * q + r
        r = a - b * q;
        return q + ":" + r;
    }

}
