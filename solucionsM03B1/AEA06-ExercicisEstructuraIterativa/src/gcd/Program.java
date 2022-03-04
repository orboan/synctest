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
     * Calculates the greatest common divisor of two numbers.
     * 
     * @param a an integer number.
     * @param b an integer number.
     * @return the greatest common divisor of a and b.
     */
    public int gcd(int a, int b) {
        int gcd, aux;
        boolean found = false;
        // Set a with the minimum number
        if (b < a) {
            aux = a;
            a = b;
            b = aux;
        }
        gcd = a; // This is the maximum candidate to be the GCD
        while (gcd >= 1 && !found) {
            // gcd is the greatest common divisor
            // if it divides a and b
            found = a % gcd == 0 && b % gcd == 0;
            if (!found) {
                gcd--;
            }
        }
        return gcd;
    }

}
