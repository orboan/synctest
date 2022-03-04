/*
 * Vehicle.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a generic vehicle.
 */
public abstract class Vehicle {

    /** Vehicle registration plate */
    private String regPlate;
    /** Vehicle power */
    protected int power;

    // Constructor
    public Vehicle(String matricula, int potencia) {
        this.regPlate = matricula;
        this.power = potencia;
    }

    /**
     * Calculates the vehicle fee in a parking.
     * 
     * @return the fee.
     */
    public abstract double calculateFee();

    // Getters & setters

    public String getMatricula() {
        return regPlate;
    }

}
