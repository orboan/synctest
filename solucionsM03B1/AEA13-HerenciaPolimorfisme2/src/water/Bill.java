/*
 * Bill.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a bill of water consumption.
 */
public abstract class Bill {

    /** Consumption of water */
    private double consumption;
    /** Amount for cleaning up */
    protected double cleaningUp;
    /** Amount for sewerage */
    protected double sewerage;
    /** Discount for cleaning up */
    protected double cleaningUpDiscount;
    /** Discount for sewerage */
    protected double sewerageDiscount;

    // Constructor
    public Bill(double consumption, double cleaningUp, double sewerge) {
        this.consumption = consumption;
        this.cleaningUp = cleaningUp;
        this.sewerage = sewerge;
    }

    /**
     * Calculates the consumption amount.
     * 
     * @return the consumption amount
     */
    private double consumptionAmount() {
        return consumption;
    }

    /**
     * Calculates the cleaning up amount.
     * 
     * @return the cleaning up amount.
     */
    protected abstract double cleaningUpAmount();

    /**
     * Calculates the sewerage amount.
     * 
     * @return the sewerage amount.
     */
    protected abstract double sewerageAmount();

    /**
     * Calculates the total amount of the bill.
     * 
     * @return he total amount.
     */
    public double totalAmount() {
        return this.consumptionAmount() + this.cleaningUpAmount() + this.sewerageAmount();
    }

    /**
     * Write the bill details.
     */
    public void details() {
        System.out.println("DETALL FACTURA");
        System.out.println("==============");
        System.out.println("Consum: " + this.consumptionAmount());
        System.out.println("Sanejament: " + this.cleaningUpAmount());
        System.out.println("Residuals: " + this.sewerageAmount());
        System.out.println("Descompte Aplicat a Sanejament: " + this.cleaningUpDiscount);
        System.out.println("Descompte Aplicat a Residuals: " + this.sewerageDiscount);
        System.out.println("TOTAL: " + this.totalAmount());
    }

}
