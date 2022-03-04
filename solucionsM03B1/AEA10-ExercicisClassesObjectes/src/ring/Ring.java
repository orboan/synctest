/*
 * Ring.java 1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a ring.
 */
public class Ring {

    /** Manufacturing cost. */
    private static final double CF = 40;
    /** Gold price €/gr */
    private static final double PO = 10;
    /** Profit margin 210 % */
    private static final double MB = 2.1;
    /** Gold specific weight in gr/cm3 */
    private static final double PE = 19.3;
    /** Ring's model */
    private String model;
    /** Ring's pitch diameter in mm */
    private double pitchDiameter;
    /** Ring's diameter section in mm. */
    private double sectionDiameter;

    // Constructor
    public Ring(String model, double pitchDiameter, double sectionDiameter) {
        this.model = model;
        this.pitchDiameter = pitchDiameter;
        this.sectionDiameter = sectionDiameter;
    }

    // Methods

    /**
     * Calculate the ring's volume.
     * 
     * @return the volume in cm3
     */
    public double volume() {
        // In mm3
        double volume = 2 * Math.PI * Math.PI * 
                        this.pitchDiameter / 2 * 
                        this.sectionDiameter / 2 * this.sectionDiameter / 2;
        // In cm3
        volume = volume / 1000;
        return volume;
    }

    /**
     * Claculates the ring's weight.
     * 
     * @return the weight in gr
     */
    public double weight() {
        double weight = Ring.PE * this.volume();
        return weight;
    }

    /**
     * Calculates the gold price of the ring.
     * 
     * @return the price in €
     */
    public double goldPrice() {
        double goldP = this.weight() * Ring.PO;
        return goldP;
    }

    /**
     * Calculates the ring's price.
     * 
     * @return the price in €
     */
    public double ringPrice() {
        double ringPrice = Ring.CF + this.goldPrice() +
                           Ring.MB * (Ring.CF + this.goldPrice());
        return ringPrice;
    }

    // Getters i setters
    public String getModel() {
        return model;
    }

}
