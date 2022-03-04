/*
 * Connexio.java
 * 		
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class Connection {

    /** Connection initial datetime */
    private String iniDateTime;
    /** Connection end datetime */
    private String endDateTime;

    // Constructor
    public Connection(String iniDateTime, String endDateTime) {
        this.iniDateTime = iniDateTime;
        this.endDateTime = endDateTime;
    }

    /**
     * Calculates the duration in minutes of the connection
     * 
     * @return number of minutes.
     */
    public long nMinutes() {
        long seconds = JodaDT.durationInSeconds(JodaDT.parseDDMMYYYYhhmm(this.iniDateTime),
                                                JodaDT.parseDDMMYYYYhhmm(this.endDateTime));
        return seconds / 60;
    }
}
