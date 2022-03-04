/*
 * Lorry.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Jiaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a lorry.
 */
public class Lorry {

    // Fields
    /** Lorry's registration number. */
    private String regNumber;
    /** Lorry's weight, in tons. */
    private double weight;
    /** Number of lorry's axles. */
    private int nAxles;

    // Constructors
    /**
     * Constructor by default.
     */
    public Lorry() {
        this.regNumber = "E-6666-ABC";
        this.weight = 30;
        this.nAxles = 3;
    }

    /**
     * Constructor.
     * 
     * @param regNumber the lorry's registration number.
     */
    public Lorry(String regNumber) {
        this.regNumber = regNumber.trim();
    }

    /**
     * Constructor.
     * 
     * @param regNumber the lorry's registration number
     * @param weight the lorry's weight, in tons
     * @param neixos the number of axles
     */
    public Lorry(String regNumber, double weight, int nAxles) {
        this.regNumber = regNumber.trim();
        this.weight = weight;
        this.nAxles = nAxles;
    }

    // Methods
    /**
     * Compares two lorries to decide if they're equals. Two lorries are equals
     * if both have the same registration number.
     * 
     * @param object an object
     * @return true if both have the same registration number, false otherwise
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Lorry other = (Lorry) obj;
        if ((this.regNumber == null) ? (other.regNumber != null) : !this.regNumber
                .equals(other.regNumber)) {
            return false;
        }
        return true;
    }

    /**
     * Calculates a hash code for this lorry.
     * 
     * @return a hash code for the lorry.
     */
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.regNumber != null ? this.regNumber.hashCode() : 0);
        return hash;
    }

    // Getters & setters
    public int getNAxles() {
        return nAxles;
    }

    public double getWeight() {
        return weight;
    }
}
