/*
 * Area.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a school area.
 */
public abstract class Area {
    /** Area code */
    private String code;
    /** Surface area */
    private double surfaceArea;
    /** Indicates whether there is natural light or not in the area */
    private boolean naturalLight;
    /** The consumption of the area */
    private double consumption;

    // Constructors.

    public Area() {
    }

    public Area(String code, double surfaceArea, boolean naturalLight, double consumption) {
        this.code = code;
        this.surfaceArea = surfaceArea;
        this.naturalLight = naturalLight;
        this.consumption = consumption;
    }

    /**
     * Calculates consumption per square meter.
     * 
     * @return the consumption.
     */
    public double consumptionM2() {
        if (this.surfaceArea > 0) {
            return this.consumption / this.surfaceArea;
        } else {
            return 0;
        }
    }

    // Getters & setters

    public String getCode() {
        return this.code;
    }

    public double getSurfaceArea() {
        return this.surfaceArea;
    }

    public boolean isNaturalLight() {
        return this.naturalLight;
    }

    public double getConsumption() {
        return this.consumption;
    }

}
