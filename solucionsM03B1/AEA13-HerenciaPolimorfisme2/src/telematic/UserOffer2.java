/*
 * UserOffer2.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class UserOffer2 extends UserWithOffer {

    /** Discount applied to the user */
    private double discount;

    // Constructor
    public UserOffer2(String name, String dni, double priceMinute, double discount) {
        super(name, dni, priceMinute);
        this.discount = discount;
    }

    @Override
    public double billAmount() {
        double amountWithoutDiscount = this.totalMinutes() * this.priceMinute;
        double amountWithDiscount = amountWithoutDiscount * (1 - this.discount / 100);
        return amountWithDiscount;
    }
}
