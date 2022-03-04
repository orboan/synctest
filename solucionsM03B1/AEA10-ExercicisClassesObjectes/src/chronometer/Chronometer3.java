import org.joda.time.DateTime;

/*
 * Chronometer3.java 1.1 20/02/2012 
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
public final class Chronometer3 {
    /** Initial time */
    private DateTime t1;
    /** Final time */
    private DateTime t2;

    /**
     * Starts chronometer.
     */
    public void start() {
        t1 = new DateTime();
    }

    /**
     * Stops chronometer.
     */
    public void stop() {
        t2 = new DateTime();
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
        long s = JodaDT.durationInSeconds(t1, t2);
        long h = s / 3600;
        long rs = s - h * 3600;
        long m = rs / 60;
        rs = rs - m * 60;
        s = rs;
        String hms = h + ":" + m + ":" + s;
        return hms;
    }
}
