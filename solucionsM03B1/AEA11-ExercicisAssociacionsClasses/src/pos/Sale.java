/*
 * Sale.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.HashSet;

/**
 * Modelizes a sale.
 */
public class Sale {

    // Fields
    /** Sale's code. */
    private int code;
    /** Sale's date time. */
    private String datatime;
    /** Sale lines. */
    private HashSet<SaleLine> saleLines;

    // Constructors

    /**
     * Constructor by default.
     */
    public Sale() {
        this.code = 123;
        this.datatime = "13/03/2010-12:15";
        this.saleLines = new HashSet<SaleLine>();
    }

    /**
     * Constructor.
     * 
     * @param code the sale's code
     * @param datatime the sale's date time
     */
    public Sale(int code, String datatime) {
        this.code = code;
        this.datatime = datatime.trim();
        this.saleLines = new HashSet<SaleLine>();
    }

    // Methods

    /**
     * Adds a sale line.
     * 
     * @param sl the sale line
     * @return true if it is added, false otherwise
     */
    public boolean add(SaleLine sl) {
        boolean added = this.saleLines.add(sl);
        return added;
    }

    /**
     * Removes a sale line.
     * 
     * @param sl the sale line to remove
     * @return true if it is removed, false otherwise
     */
    public boolean remove(SaleLine sl) {
        boolean removed = this.saleLines.remove(sl);
        return removed;
    }

    /**
     * Calculates the sale's amount.
     * 
     * @return the amount.
     */
    public double totalAmount() {
        double total = 0;
        for (SaleLine sl : saleLines) {
            Product product = sl.getProduct();
            double pu = product.getPrice(); // preu unitari
            int nu = sl.getNup();
            total += pu * nu;
        }
        return total;
    }

    // equals & hashCode

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
        Sale other = (Sale) obj;
        if (code != other.code)
            return false;
        return true;
    }

}
