/*
 * Cpu.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a CPU.
 */
public class Cpu extends Product {

    /** CPU speed */
    private float speed;

    // Constructor.
    public Cpu(String code, String description, int units, float basePrice, float speed) {
        super(code, description, units, basePrice);
        this.speed = speed;
    }

    @Override
    public float price() {
        return this.getBasePrice() * this.speed;
    }

    @Override
    public String toString() {
        return this.getCode() + "\t" + this.getDescription() + "\t" 
            + this.getUnits() + "\t" + this.speed + "MHz"
            + "\t" + this.price() + "\t" 
            + this.price() * this.getUnits();
    }

    // Getters & setters

    public float getSpeed() {
        return this.speed;
    }

}
