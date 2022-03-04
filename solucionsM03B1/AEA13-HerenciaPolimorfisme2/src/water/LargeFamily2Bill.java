/*
 * LargeFamily2Bill.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class LargeFamily2Bill extends Bill {

    // Constructor
    public LargeFamily2Bill(double consumption, double cleaningUp, double sewerage) {
        super(consumption, cleaningUp, sewerage);
        this.cleaningUpDiscount = 75;
        this.sewerageDiscount = 50;
    }

    @Override
    protected double cleaningUpAmount() {
        double cua = this.cleaningUp * (1 - this.cleaningUpDiscount / 100);
        return cua <= 16 ? cua : 16;
    }

    @Override
    protected double sewerageAmount() {
        double sa = this.sewerage * (1 - this.sewerageDiscount / 100);
        return sa <= 16 ? sa : 16;
    }

    @Override
    public void details() {
        super.details();
        System.out
                .println("NOTA: si l'import màxim de sanejament i residuals és superior a 16, s'ha comptabilitzat 16.");
    }
}
