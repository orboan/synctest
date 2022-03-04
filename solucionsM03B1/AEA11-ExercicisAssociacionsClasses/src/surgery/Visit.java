/*
 * Visit.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a doctor's visit.
 */
public class Visit {

    // Fields
    /** Visit's datetime in format DD/MM/YYYY-hh:mm */
    private String visitDateTime;
    /** Patient's name */
    private String patientName;

    // Constructors
    /**
     * Constructor by default.
     */
    public Visit() {
        this.visitDateTime = "12/04/2009-17:15";
        this.patientName = "Joan Camps";
    }

    /**
     * Constructor.
     * 
     * @param visitDateTime the visit's datetime in format DD/MM/YYYY-hh:mm
     */
    public Visit(String visitDateTime) {
        this.visitDateTime = visitDateTime.trim();
    }

    /**
     * Constructor.
     * 
     * @param visitDateTime the visit's datetime in format DD/MM/YYYY-hh:mm
     * @param patientName the patient's name
     */
    public Visit(String visitDateTime, String patientName) {
        this.visitDateTime = visitDateTime.trim();
        this.patientName = patientName.trim();
    }

    // equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((visitDateTime == null) ? 0 : visitDateTime.hashCode());
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
        Visit other = (Visit) obj;
        if (visitDateTime == null) {
            if (other.visitDateTime != null)
                return false;
        } else if (!visitDateTime.equals(other.visitDateTime))
            return false;
        return true;
    }

    // Getters & setters
    public String getVisitDateTime() {
        return this.visitDateTime;
    }

    public String getPatientName() {
        return this.patientName;
    }
}
