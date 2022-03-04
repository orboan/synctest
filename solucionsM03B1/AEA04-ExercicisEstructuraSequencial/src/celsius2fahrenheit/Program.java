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
     * Convert Celsius degrees into Fahrenheit degrees.
     * 
     * @param c a temperature in Celsius degrees.
     * @return the temperature in Fahrenheit degrees.
     */
    public double celsius2fahrenheit(double c) {
        double f;
        // Calculate the temperature in Fahrenheit degrees.
        f = 9.0 / 5 * c + 32;
        return f;
    }
}
