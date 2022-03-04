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
     * Determines whether a matrix is symmetric.
     * @param m a matrix
     * @return true if m is symmetric, false otherwise
     */
    public boolean isSymmetric(int[][] m) {
        int n = m.length, i, j;
        boolean symmetric = true;
        for (i = 0; i < n && symmetric; i++) {
            for (j = i + 1; j < n && symmetric; j++) {
                if (m[i][j] != m[j][i]) {
                    symmetric = false;
                }
            }
        }
        return symmetric;
    }
}
