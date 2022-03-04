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
     * Calculates the flight time of a projectile.
     * 
     * @param v the velocity of a projectile, in m/s.
     * @param a the firing angle of a projectile, in degrees.
     * @return the flight time of the projectile, in seconds.
     */
    public int flightTime(double v, double a) {
        double g = 9.81; // gravity
        double t = 2 * v * Math.sin(Math.toRadians(a)) / g;
        // Remove the decimals.
        return (int) t;
    }

    /**
     * Calculates the distance covered by a projectile.
     * 
     * @param v the velocity of a projectile, in m/s.
     * @param a the firing angle of a projectile, in degrees.
     * @return the distance covered by the projectile, in meters.
     */
    public int distance(double v, double a) {
        double g = 9.81; // gravity
        double d = v * v * Math.sin(2 * Math.toRadians(a)) / g;
        // Remove the decimals.
        return (int) d;
    }

}
