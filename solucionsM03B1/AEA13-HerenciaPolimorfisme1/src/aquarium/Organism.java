/*
 * Organism.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates an organism (a plant or a fish) of an aquarium.
 */
public abstract class Organism {

    /** Organism name */
    private String name;
    /** Organism family */
    private String family;
    /** Type of light the organism needs */
    private char light;
    /** Maximum temperature the organism can tolerate */
    private double maxTemp;
    /** Minimum temperature the organism can tolerate */
    private double minTemp;
    /** Maximum PH the organism can tolerate */
    private double maxPH;
    /** Minimum PH the organism can tolerate */
    private double minPH;

    // Constructor.

    public Organism(String name, String family, char light, double maxTemp, double minTemp, double maxPH, double minPH) {
        this.name = name;
        this.family = family;
        this.light = light;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.maxPH = maxPH;
        this.minPH = minPH;
    }

    /**
     * Builds a string with the range of water acidity that the organism can tolerate. For instance, 6-7.
     * 
     * @return the range of acidity.
     */
    public String acidity() {
        return minPH + "-" + maxPH;
    }

    /**
     * Builds a string with the range of temperature that the organism can tolerate. For instance, 10-20.
     * 
     * @return the range of temperatures.
     */
    public String temperature() {
        return minTemp + "-" + maxTemp;
    }

    /**
     * Translates the light type code to a detailed explanation.
     * 
     * @return the translation.
     */
    public String lightType() {
        String lightType = null;
        switch (this.light) {
        case 'H':
            lightType = "Necessitats altes de llum";
            break;
        case 'M':
            lightType = "Necessitats mitjanes de llum";
            break;
        case 'L':
            lightType = "Necessitats baixes de llum";
            break;
        }
        return lightType;
    }

    // Getters & setters
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public char getLight() {
        return light;
    }

}
