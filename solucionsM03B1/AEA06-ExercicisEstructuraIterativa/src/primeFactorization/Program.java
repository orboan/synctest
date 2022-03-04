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
     * Write the prime factorization of an integer number.
     * 
     * @param n an integer number.
     */
    public void primeFactorization(int n) {
        int s, fp;
        s = n;
        fp = 2;
        while (s != 1) {
            // if fp divides s, write it
            if (s % fp == 0) {
                System.out.printf("%d ", fp);
                // Divide s by the factor
                s /= fp;
            } else {
                fp++;
            }
        }
    }
}
