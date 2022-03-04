/*
 * Boat.java
 * 		
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a boat.
 */
public abstract class Boat {

    /** Boat registration plate */
    private String regPlate;
    /** Boat length */
    private double length;
    /** Boat fabrication year */
    private int year;

    // Constructor

    public Boat(String matricula, double eslora, int any) {
        this.regPlate = matricula;
        this.length = eslora;
        this.year = any;
    }

    /**
     * Calculates the amount according to the boat.
     * 
     * @return the amount
     */
    public abstract double amountAccordingToBoat();

    /**
     * Calculates the base amount for all vboats.
     * 
     * @return the amount
     */
    public double baseAmount() {
        return this.length * 10;
    }

    // Getters & setters

    public String getRegPlate() {
        return this.regPlate;
    }

    public int getYear() {
        return this.year;
    }

    public double getLength() {
        return this.length;
    }

}
