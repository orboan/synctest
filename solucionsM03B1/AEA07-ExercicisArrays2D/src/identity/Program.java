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
     * Creates the identity matrix of dimension n.
     * 
     * @param n an integer number
     * @return the identity matrix.
     */
    int[][] identity(int n) {
        int i, j;
        int[][] matrix = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // Put 1s in the main diagonal
                // and 0s elsewhere.
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

}
