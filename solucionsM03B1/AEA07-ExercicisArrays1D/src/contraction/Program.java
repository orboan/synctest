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

public class Program {

    /**
     * Calculates the contraction of two vectors.
     * 
     * @param v1 a vector
     * @param v2 a vector
     * @return the contraction of v1 and v2
     */
    public double contraction(double[] v1, double[] v2) {
        double c = 0;
        for (int i = 0; i < v1.length; i++) {
            // For each posotion , multiply corresponding elements and add to
            // the total
            c = c + v1[i] * v2[i];
        }
        return c;
    }
}
