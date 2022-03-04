/*
 * Program.java        1.0 13/12/2011
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
     * Sum two matrices.
     * 
     * @param m1 a matrix of integer numbers of dimension n
     * @param m2 a matrix of integer numbers of dimension n
     * @return the sum of m1 and m2
     */
    public int[][] sumMatrix(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] m3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m3;
    }
}
