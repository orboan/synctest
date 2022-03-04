/*
 * Motorbike.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a motorbike.
 */
public class Motorbike extends Vehicle {
    
    // Constructor
    public Motorbike(String regPlate, int power) {
        super(regPlate, power);
    }

    @Override
    public double calculateFee() {
        return this.power * 2;
    }

}
