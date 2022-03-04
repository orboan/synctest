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
     * Calculates the trace of a matrix.
     * 
     * @param m a matrix
     * @param n the dimension of the matrix
     * @return the trace
     */
    public double trace(double[][] m) {        
        int i;
        int n = m.length;
        double tr = 0;
        for (i = 0; i < n; i++) {
            tr = tr + m[i][i];
        }
        return tr;
    }
}
