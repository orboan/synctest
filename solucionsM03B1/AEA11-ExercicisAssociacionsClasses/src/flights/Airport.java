/*
 * Airport.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes an airport.
 */
public class Airport {

    // Fields
    /** Airport's code. */
    private String code;
    /** Airport or city name. */
    private String name;
    /** Airport's latitude in format: "degrees minutes hemisphere". */
    private String lat;
    /** Airport's longitude in format: "degrees minutes hemisphere". */
    private String lon;
    /** GMT time zone in hours with decimals. */
    private double gmt;

    // Constructors
    /**
     * Constructor by default.
     */
    public Airport() {
        this.code = "BCN";
        this.name = "Barcelona";
        this.lat = "41 18 N";
        this.lon = "2 5 O";
        this.gmt = 1;
    }

    /**
     * Constructor.
     * 
     * @param code the airport's code.
     */
    public Airport(String code) {
        this.code = code.trim();
    }

    /**
     * Constructor.
     * 
     * @param code the airport's code.
     * @param name the airport or city name.
     * @param lat the airport's latitude in format:
     *        "degrees minutes hemisphere". Hemisphere can be N or S. Example:
     *        23 12 N
     * @param lon the airport's latitude in format:
     *        "degrees minutes hemisphere". Hemisphere can be E or W. Example:
     *        26 51 W
     * @param gmt the GMt time zone.
     */
    public Airport(String code, String name, String lat, String lon, double gmt) {
        this.code = code.trim();
        this.name = name.trim();
        this.lat = lat.trim();
        this.lon = lon.trim();
        this.gmt = gmt;
    }

    /**
     * Calculates orthodromic distance between two airports.
     * 
     * @param a2 another airport
     * @return the distance in km
     */
    public double distance(Airport a2) {
        String[] latA1 = this.lat.split("\\s+");
        String[] lonA1 = this.lon.split("\\s+");
        String[] latA2 = a2.getLat().split("\\s+");
        String[] lonA2 = a2.getLon().split("\\s+");
        // Calculate current airport's latitude, in degrees with decimals
        double latA1D = Double.parseDouble(latA1[0]); // Degrees
        double latA1M = Double.parseDouble(latA1[1]); // Minutes
        double lat1 = latA1D + latA1M / 60; // Degrees with decimals
        lat1 = latA1[2].equals("N") ? lat1 : -lat1; // Sign: + N, - S
        lat1 = Math.toRadians(lat1);
        // Calculate current airport's longitude, in degrees with decimals
        double lon1D = Double.parseDouble(lonA1[0]);
        double lon1M = Double.parseDouble(lonA1[1]);
        double lon1 = lon1D + lon1M / 60;
        lon1 = lonA1[2].equals("E") ? lon1 : -lon1; // sign + E, - W
        lon1 = Math.toRadians(lon1);
        // Calculate the other airport's latitude, in degrees with decimals
        double latA2D = Double.parseDouble(latA2[0]);
        double latA2M = Double.parseDouble(latA2[1]);
        double lat2 = latA2D + latA2M / 60;
        lat2 = latA2[2].equals("N") ? lat2 : -lat2;
        lat2 = Math.toRadians(lat2);
        // Calculate the other airport's latitude, in degrees with decimals
        double lonA2D = Double.parseDouble(lonA2[0]);
        double lonA2M = Double.parseDouble(lonA2[1]);
        double lon2 = lonA2D + lonA2M / 60;
        lon2 = lonA2[2].equals("E") ? lon2 : -lon2;
        lon2 = Math.toRadians(lon2);
        // Calculates angular distance between two airports, in radians
        double angleRad = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
                * Math.cos(lat2) * Math.cos(lon2 - lon1));
        // Orthodromic distance in km
        double dis = 1.852 * 60 * Math.toDegrees(angleRad);
        return dis;
    }

    // equals & hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airport other = (Airport) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    // Getters & setters

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLon() {
        return this.lon;
    }

    public double getGmt() {
        return this.gmt;
    }
}
