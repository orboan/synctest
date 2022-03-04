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
     * Convert Fahrenheit degrees into Celsius degrees.
     * 
     * @param f a temperature in Fahrenheit degrees.
     * @return the temperature in Celsius degrees.
     */
    public double fahrenheit2celsius(double f) {
        double c;
        // Calculate the temperature in Celsius degrees.
        c = 5.0 / 9 * (f - 32);
        return c;
    }
}
