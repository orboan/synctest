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
     * Calculate the factorial of a number.
     * 
     * @param n an integer number
     * @return the factorial
     */
    public double factorial(int n) {
        double fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
