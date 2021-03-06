/*
 * Surgery.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import org.joda.time.DateTime;
import java.util.HashSet;

/**
 * Modelizes a surgery.
 */
public class Surgery {

    // Fields
    /** Doctor's name. */
    private String doctorName;
    /** Medical speciality. */
    private String speciality;
    /** Surgery's visits. */
    private HashSet<Visit> visits;

    // Constructors
    /**
     * Constructor by default.
     */
    public Surgery() {
        this.doctorName = "Rosa Pi";
        this.speciality = "Cardiologia";
        this.visits = new HashSet<Visit>();
    }

    /**
     * Constructor.
     * 
     * @param doctorName the doctor's name.
     * @param especiality the medical speciality
     */
    public Surgery(String doctorName, String especiality) {
        this.doctorName = doctorName.trim();
        this.speciality = especiality.trim();
        this.visits = new HashSet<Visit>();
    }

    // Methods

    /**
     * Checks whether a visit can be programmed.
     * 
     * @param visit the visit to be programmed
     * @return true if it can be programmed, false otherwise
     */
    public boolean isProgrammable(Visit visit) {
        DateTime visitDateTime = JodaDT.parseDDMMYYYYhhmm(visit.getVisitDateTime());
        DateTime visitDateTimePlusHalfHour = visitDateTime.plusMinutes(30);
        for (Visit programmedVisit : this.visits) {
            DateTime programmedVisitDateTime = JodaDT.parseDDMMYYYYhhmm(programmedVisit
                    .getVisitDateTime());
            DateTime programmedVisitDateTimePlusHalfHour = programmedVisitDateTime.plusMinutes(30);
            // Initial date times are equals
            boolean cond1 = programmedVisitDateTime.equals(visitDateTime);
            // visit date time is inside another programmed visit
            boolean cond2 = JodaDT.isInInterval(visitDateTime,
                                                programmedVisitDateTime,
                                                programmedVisitDateTimePlusHalfHour);
            // another programmed visit initial date time is inside the visit
            // date time
            boolean cond3 = JodaDT.isInInterval(programmedVisitDateTime,
                                                visitDateTime,
                                                visitDateTimePlusHalfHour);
            boolean cond = cond1 || cond2 || cond3;
            if (cond) {
                return false;
            }
        }
        return true;
    }

    /**
     * Programs a visit in the surgery.
     * 
     * @param visit the visit to be programmed
     * @return true if the visit is programmed, false otherwise
     */
    public boolean program(Visit visit) {
        boolean programmed = false;
        boolean programable = this.isProgrammable(visit);
        if (programable) {
            programmed = this.visits.add(visit);
        }
        return programmed;
    }

    /**
     * Calculates how many programmed visits there are.
     * 
     * @return the number of programmed visits
     */
    public int countVisits() {
        return this.visits.size();
    }

    /**
     * Calculates how many programmed visits there are between two dates.
     * 
     * @param date1 a date in format DD/MM/YYYY.
     * @param date2 a date in format DD/MM/YYYY, later than date1
     * @return the number of programmed visits between date1 and date2
     */
    public int countVisits(String date1, String date2) {
        int n = 0;
        DateTime dt1 = JodaDT.parseDDMMYYYY(date1.trim());
        DateTime dt2 = JodaDT.parseDDMMYYYY(date2.trim());
        for (Visit visit : this.visits) {
            String visitDTS = visit.getVisitDateTime();
            DateTime visitDT = JodaDT.parseDDMMYYYYhhmm(visitDTS);
            boolean cond = JodaDT.isInInterval(visitDT, dt1, dt2.plusDays(1));
            if (cond) {
                n++;
            }
        }
        return n;
    }

    /**
     * Cancel a visit.
     * 
     * @param visit the visit to cancel
     * @return true if it is cancelled, false otherwise
     */
    public boolean cancel(Visit visit) {
        boolean cond = this.visits.remove(visit);
        return cond;
    }

    /**
     * Cancel all visits.
     */
    public void cancelAll() {
        this.visits.clear();
    }

    // equals & hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
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
        Surgery other = (Surgery) obj;
        if (doctorName == null) {
            if (other.doctorName != null)
                return false;
        } else if (!doctorName.equals(other.doctorName))
            return false;
        return true;
    }

    // Getters & setters

    public String getDoctorName() {
        return this.doctorName;
    }
}
