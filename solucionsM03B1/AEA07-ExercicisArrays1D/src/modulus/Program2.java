/*
 * Program.java        1.0 12/12/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Calculates the modulus of a vector.
     * 
     * @param v a vector
     * @return the modulus
     */
    public double modulus(int[] v) {
        double squareSum = 0, mod;
        for (double x : v) {
            //squareSum += x * x;
            squareSum = squareSum + x * x;
        }
        mod = Math.sqrt(squareSum);
        return mod;
    }

}
