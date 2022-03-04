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
     * Calculates the area of a triangle.
     * 
     * @param b the base
     * @param h the height
     * @return the area
     */
    public double area(double b, double h) {
        // Variables declaration
        double a;
        // Calculates the area
        a = b * h / 2;
        // Returns the area
        return a;
    }
}
