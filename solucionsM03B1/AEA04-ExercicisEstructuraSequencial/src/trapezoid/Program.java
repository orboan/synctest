/*
 * Program.java        1.0 13/10/2011
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
     * Calculates the area of a trapezoid.
     * 
     * @param smallBase the small base of a trapezoid.
     * @param bigBase the big base of a trapezoid.
     * @param height the height of a trapezoid.
     * @return the area of the trapezoid.
     */
    public double area(double smallBase, double bigBase, double height) {
        return (smallBase + bigBase) * height / 2;
    }

}
