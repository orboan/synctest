/*
 * UserOffer1.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class UserOffer1 extends UserWithOffer {

    // Constructor
    public UserOffer1(String name, String dni, double priceMinute) {
        super(name, dni, priceMinute);
    }

    @Override
    public double billAmount() {
        double minutes2invoice = 0;
        for (Connection c : this.connections) {
            double minutes = c.nMinutes();
            if (minutes > 3) {
                minutes2invoice += minutes - 3;
            }
        }
        return minutes2invoice * this.priceMinute;
    }

}
