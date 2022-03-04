/*
 * LargeFamily1Bill.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class LargeFamily1Bill extends Bill {

    // Constructor
    public LargeFamily1Bill(double consumption, double cleaningUp, double sewerage) {
        super(consumption, cleaningUp, sewerage);
        this.cleaningUpDiscount = 25;
        this.sewerageDiscount = 25;
    }

    @Override
    protected double cleaningUpAmount() {
        return (1 - this.cleaningUpDiscount / 100) * this.cleaningUp;
    }

    @Override
    protected double sewerageAmount() {
        return (1 - this.sewerageDiscount / 100) * this.sewerage;
    }
}
