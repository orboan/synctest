/*
 * Program.java        1.0 11/10/2011
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
     * Verifies if a real number is in an open interval. See
     * http://mathworld.wolfram.com/OpenInterval.html for more information.
     * 
     * @param x a real number.
     * @param a lower limit of an interval.
     * @param b upper limit of an interval.
     * @return true if -a- is in the interval, false otherwise.
     */
    public boolean isInOpenInterval(double x, double a, double b) {
        boolean isInside = a < x && x < b;
        return isInside;
    }
}
