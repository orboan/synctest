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
     * Calculates the value of the first argument raised to the power of the
     * second argument.
     * 
     * @param a the base.
     * @param b the exponent
     * @return a^b
     */
    public int myPow(int a, int b) {
        int p = 1, i = 1;
        while (i <= b) {
            p = p * a;
            i++;
        }
        return p;
    }
}
