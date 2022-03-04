/*
 * Program.java        1.0 17/10/2011
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
     * Calculates the area of a cylinder.
     * 
     * @param r the radius of a cylinder.
     * @param h the height of a cylinder.
     * @return the area of the cylinder.
     */
    public double area(double r, double h) {
        return 2 * Math.PI * r * h;
    }

    /**
     * Calculates the volume of a cylinder.
     * 
     * @param r the radius of a cylinder.
     * @param h the height of a cylinder.
     * @return the volume of the cylinder.
     */
    public double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

}
