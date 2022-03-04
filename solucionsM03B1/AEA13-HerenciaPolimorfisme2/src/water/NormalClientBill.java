/*
 * NormalClientBill.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class NormalClientBill extends Bill {

    // Constructor
    public NormalClientBill(double consumption, double cleaningUp, double sewerage) {
        super(consumption, cleaningUp, sewerage);
        this.sewerageDiscount = 0;
        this.cleaningUpDiscount = 0;
    }

    @Override
    protected double cleaningUpAmount() {
        return this.cleaningUp;
    }

    @Override
    protected double sewerageAmount() {
        return this.sewerage;
    }

}
