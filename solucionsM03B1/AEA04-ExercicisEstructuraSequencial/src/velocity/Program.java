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
     * Calculates the velocity of a train.
     * 
     * @param distanceInMeters a distance traveled by a train, in meters.
     * @param timeInSeconds the time it takes the train to travel the distance,
     *        in seconds.
     * @return the velocity of the train, in km/h.
     */
    public double velocity(double distanceInMeters, double timeInSeconds) {
        double distanceInKm, timeInHours, velocityinKmH;
        // Convert the distance and the time into the desired unities.
        distanceInKm = distanceInMeters / 1000;
        timeInHours = timeInSeconds / 3600;
        // Calculate the velocity.
        velocityinKmH = distanceInKm / timeInHours;
        return velocityinKmH;
    }
}
