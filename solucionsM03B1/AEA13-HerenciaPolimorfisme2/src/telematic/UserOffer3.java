/*
 * UsuariOferta3.java
 * 		
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public class UserOffer3 extends UserWithOffer {

    // Constructor
    public UserOffer3(String name, String dni, double priceMinute) {
        super(name, dni, priceMinute);
    }

    @Override
    public double billAmount() {
        double minutesLongestConection = 0;
        for (Connection c : connections) {
            double minutes = c.nMinutes();
            if (minutes > minutesLongestConection) {
                minutesLongestConection = minutes;
            }
        }
        return totalMinutes() * priceMinute - minutesLongestConection * priceMinute;
    }

}
