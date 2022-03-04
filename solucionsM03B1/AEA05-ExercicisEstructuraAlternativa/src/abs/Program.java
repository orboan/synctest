/*
 * Program.java        1.0 24/10/2011
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
     * Calculates the absolute value of a real number.
     * 
     * @param n a real number.
     * @return the absolute value of -n-.
     */
    public double abs(double n) {
        double absoluteValue;
        // Initialize absoluteValue with the value of -n-
        absoluteValue = n;
        // If n is negative, change the sign to absoluteValue
        if (n < 0) {
            absoluteValue = -n;
        }
        // Return the absolute value
        return absoluteValue;

    }
}
