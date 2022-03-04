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
     * Calculate the total of seconds.
     * 
     * @param h a number of hours.
     * @param m a number of minutes.
     * @param s a number of seconds.
     * @return the total number of equivalent seconds. 
     */
    public int hms2s(int h, int m, int s) {
        int totalSeconds = 0;
        totalSeconds = s + m * 60 + h * 3600;
        return totalSeconds;
    }

}
