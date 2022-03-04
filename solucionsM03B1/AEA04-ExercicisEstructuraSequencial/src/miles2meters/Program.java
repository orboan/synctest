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
     * Convert a distance from miles into meters.
     * 
     * @param miles a distance, in miles.
     * @return the distance, in meters.
     */
    public double miles2meters(double miles) {
        double meters = miles * 1852;
        return meters;
    }
}
