/*
 * Program.java        1.0 05/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Verifies if two real numbers are equals regarding a certain tolerance.
     * See http://en.wikipedia.org/wiki/Real_number for more information.
     * 
     * @param a a real number.
     * @param b a real number.
     * @param tol a tolerance.
     * @return true if -a- and -b- are equals, false otherwise.
     */
    public boolean areEquals(double a, double b, double tol) {
        boolean areEquals = Math.abs(a - b) < tol;
        return areEquals;
    }
}
