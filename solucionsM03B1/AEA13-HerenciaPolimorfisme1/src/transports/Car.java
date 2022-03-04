/*
 * Car.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a car.
 */
public class Car extends Transport {

    /** Car's fuel type */
    private String fuelType;
    /** Fuel price per liter */
    private double literPrice;
    /** Liters of fuel the car needs to do 1 km */
    private double litersKm;

    // Constructors

    public Car(String id, double speed) {
        super(id, speed);
    }

    public Car(String id, double speed,
        String fuelType, double literPrice, double litersKm) {
        super(id, speed);
        this.fuelType = fuelType;
        this.literPrice = literPrice;
        this.litersKm = litersKm;
    }

    @Override
    public double cost(double distance) {
        double cost = distance * this.litersKm * this.literPrice;
        return cost;
    }

    // Getters i setters

    public double getLiterPrice() {
        return literPrice;
    }   

    public String getFuelType() {
        return fuelType;
    }

    public double getLitersKm() {
        return litersKm;
    }

}
