/*
 * HardDisk.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a hard disk.
 */
public class HardDisk extends Product {

    /** La capacitat del disc dur */
    private float capacity;

    // Constructor

    public HardDisk(String code, String description, int units, float price, float capacity) {
        super(code, description, units, price);
        this.capacity = capacity;
    }

    @Override
    public float price() {
        return this.getBasePrice() * this.capacity * (float) 0.9;
    }

    @Override
    public String toString() {
        return getCode() + "\t" + getDescription() + "\t" + getUnits()
            + "\t" + capacity + "GB" + "\t\t" + price()
            + "\t" + price() * getUnits();
    }

    // Getters & setters

    public float getCapacity() {
        return capacity;
    }

}
