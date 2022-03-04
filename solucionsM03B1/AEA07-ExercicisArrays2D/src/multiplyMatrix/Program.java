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
     * Multiply two matrices.
     * 
     * @param m1 a matrix of integer numbers of dimension n
     * @param m2 a matrix of integer numbers of dimension n
     * @return the prodcut m1 amd m2
     */
    public int[][] multiplyMatrix(int[][] m1, int[][] m2) {
        int n = m1.length, i, j, k;
        int[][] m3 = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // Put in m3[i][j] the contraction of the i-th row and the j-th
                // column
                for (k = 0; k < n; k++) {
                    m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }

}
