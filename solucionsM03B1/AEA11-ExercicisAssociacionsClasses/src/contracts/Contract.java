/*
 * Contract.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import org.joda.time.DateTime;

/**
 * Modelizes a contract between a person and a company.
 */
public class Contract {

    // Fields
    /** Contract's code. */
    private int code;
    /** Contract's initial date, with format DD/MM/YYYY. */
    private String initialDate;
    /** Contract's end date, with format DD/MM/YYYY. */
    private String endDate;
    /*** Company who does the contract. */
    private Company company;

    /**
     * Constructor by default.
     */
    public Contract() {
        this.code = 123;
        this.initialDate = "13/04/2009";
        this.endDate = null;
    }

    /**
     * Constructor.
     * 
     * @param code the contract's code.
     */
    public Contract(int code) {
        this.code = code;
    }

    /**
     * Constructor.
     * 
     * @param code the contract's code.
     * @param initialDate the contract's initial date with format DD/MM/YYYY
     * @param endDate the contract's end date with format DD/MM/YYYY
     */
    public Contract(int code, String initialDate, String endDate) {
        this.code = code;
        this.initialDate = initialDate.trim();
        if (endDate != null) {
            this.endDate = endDate.trim();
        } else {
            this.endDate = endDate; // Admitting null
        }
    }

    /**
     * Calculates how long the contract is.
     * 
     * @return the contract's number of days.
     */
    public int duration() {
        int days;
        DateTime dtInit = JodaDT.parseDDMMYYYY(this.initialDate);
        if (this.endDate != null) {
            DateTime dtEnd = JodaDT.parseDDMMYYYY(this.endDate);
            days = (int) (JodaDT.durationInSeconds(dtInit, dtEnd) / 60 / 60 / 24);
        } else {
            days = (int) (JodaDT.durationInSeconds(dtInit, new DateTime()) / 60 / 60 / 24);
        }
        return days;
    }

    // Equals & hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
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
        Contract other = (Contract) obj;
        if (code != other.code)
            return false;
        return true;
    }

    // Getters & setters
    public Company getCompany() {
        return company;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
