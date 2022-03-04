/*
 * Car.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a car.
 */
public class Car extends Vehicle {
    /** Number of seats of the car */
    public int nSeats;

    // Constructor
    public Car(String regPlate, int power, int nSeats) {
        super(regPlate, power);
        this.nSeats = nSeats;
    }

    @Override
    public double calculateFee() {
        return this.power * this.nSeats;
    }

}
