/*
 * Company.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modela a company.
 */
public class Company {

    // Fields
    /** Company's CIF. */
    private int cif;
    /** Company's name. */
    private String name;
    /** Company's sector. */
    private String sector;

    /**
     * Constructor by default.
     */
    public Company() {
        this.cif = 2345;
        this.name = "Erpa S.A.";
        this.sector = "Serveis";
    }

    /**
     * Constructor.
     * 
     * @param cif the company's CIF.
     */
    public Company(int cif) {
        this.cif = cif;
    }

    /**
     * Constructor.
     * 
     * @param cif the company's CIF.
     * @param name the company's name.
     * @param sector the company's sector.
     */
    public Company(int cif, String name, String sector) {
        this.cif = cif;
        this.name = name.trim();
        this.sector = sector.trim();
    }

    // Equals & hasCode
    // Two companies are equals if they have the same CIF.
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cif;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Company other = (Company) obj;
        if (cif != other.cif)
            return false;
        return true;
    }

    // Getters & setters
    public int getCif() {
        return cif;
    }
}
