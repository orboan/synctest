/*
 * Chronometer2.java 1.1 20/02/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a chronometer.
 */
public final class Chronometer2 {
    /** Initial time */
    private long t1;
    /** Final time */
    private long t2;

    /**
     * Starts chronometer.
     */
    public void start() {
        // Miliseconds since 1/1/1970 at 00:00
        t1 = System.currentTimeMillis();
    }

    /**
     * Stops chronometer.
     */
    public void stop() {
        t2 = System.currentTimeMillis();
    }

    /**
     * Resets chronometer.
     */
    public void reset() {
        this.start();
    }

    /**
     * Shows interval time between t1 and t2.
     * 
     * @return time interval with format hh:mm:ss
     */
    public String getTimeInterval() {
        int s = (int) (t2 - t1) / 1000; // Convert into seconds
        int h = s / 3600;
        int rs = s - h * 3600;
        int m = rs / 60;
        rs = rs - m * 60;
        s = rs;
        String hms = h + ":" + m + ":" + s;
        return hms;
    }
}
