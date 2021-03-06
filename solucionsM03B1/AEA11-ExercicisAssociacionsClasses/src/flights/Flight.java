/*
 * Flight.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import org.joda.time.DateTime;

/**
 * Modelizes a flight.
 */
public class Flight {

    // Fields
    /** Flight's code. */
    private String code;
    /** Departure datetime with format DD/MM/YYYY-hh:mm */
    private String departureDT;
    /** Departure airport. */
    private Airport departureAirport;
    /** Arrival airport. */
    private Airport arrivalAirport;
    /** Flying plane. */
    private Plane plane;

    // Constructors
    /**
     * Constructor by default.
     */
    public Flight() {
        this.code = "BN-123-P";
        this.departureDT = "12/03/2010-06:23";
        this.departureAirport = new Airport();
        this.arrivalAirport = new Airport("TXL", "Berlin-Tegel", "52 33 N", "13 17 W", 1);
        this.plane = new Plane();
    }

    /**
     * Constructor.
     * 
     * @param code the flight's code.
     */
    public Flight(String code) {
        this.code = code.trim();
    }

    /**
     * Constructor.
     * 
     * @param code the flight's code.
     * @param departureDT the departure datetime with format DD/MM/YYYY-hh:mm
     */
    public Flight(String code, String departureDT) {
        this.code = code.trim();
        this.departureDT = departureDT.trim();
    }

    /**
     * Calculates the flight time between departure and arrival airports.
     * 
     * @return the flight time in hours with decimals.
     */
    private double durationInHours() {
        double d = this.departureAirport.distance(this.arrivalAirport);
        double v = this.plane.getV();
        double t = d / v;
        return t;
    }

    /**
     * Calculates the flight time between departure and arrival airports.
     * 
     * @return the flight time in format h:m
     */
    public String duration() {
        double dih = this.durationInHours();
        int h = (int) dih;
        int m = (int) ((dih - h) * 60);
        String d = h + ":" + m;
        return d;
    }

    /**
     * Calculates arrival datetime of the flight.
     * 
     * @return Arrival date and time in format DD/MM/YYYY-hh:mm
     */
    public String arrivalDateTime() {
        double h = this.durationInHours();
        // Flight duration in minutes
        int m = (int) (60 * h);
        DateTime dtDeparture = JodaDT.parseDDMMYYYYhhmm(this.departureDT);
        DateTime arrivalDateTimeWithoutTimezone = dtDeparture.plusMinutes(m);
        // GMT timezone difference in hours between departure and arrival
        // airports
        double dgmtH = this.arrivalAirport.getGmt() - this.departureAirport.getGmt();
        // GMT timezone difference in minutes between departure and arrival
        // airports
        int dgmtM = (int) (dgmtH * 60);
        DateTime arrivalDT = arrivalDateTimeWithoutTimezone.plusMinutes(dgmtM);
        String arrivalDTS = JodaDT.formatDDMMYYYYhhmm(arrivalDT);
        return arrivalDTS;
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
        Flight other = (Flight) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    // Getters i setters
    public Airport getArrivalAirport() {
        return this.arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return this.departureAirport;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getCode() {
        return this.code;
    }

    public String getDepartureDT() {
        return departureDT;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        if (departureAirport == null || !arrivalAirport.equals(departureAirport)) {
            this.arrivalAirport = arrivalAirport;
        }
    }

    public void setDepartureAirport(Airport departureAirport) {
        if (arrivalAirport == null || !arrivalAirport.equals(departureAirport)) {
            this.departureAirport = departureAirport;
        }
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
