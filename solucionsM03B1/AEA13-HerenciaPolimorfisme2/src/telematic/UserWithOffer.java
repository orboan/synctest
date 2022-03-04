/*
 * UserWithOffer.java
 * 		
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

public abstract class UserWithOffer extends User {

    // Constructor
    public UserWithOffer(String name, String dni, double priceMinute) {
        super(name, dni, priceMinute);
    }

}
