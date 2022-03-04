/*
 * Fish.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a fish in an aquarium.
 */
public class Fish extends Organism {

    private String origin;
    private char diet;
    private double length;

    // Constructors.

    public Fish(String name, String family, char light, double maxTemp, double minTemp, double maxPH, double minPH) {
        super(name, family, light, maxTemp, minTemp, maxPH, minPH);
    }

    /**
     * Translates the diet type code to a detailed explanation.
     * 
     * @return the translation.
     */
    public String tipusDieta() {
        String tipusDieta = null;
        switch (this.diet) {
        case 'W':
            tipusDieta = "Algues";
            break;
        case 'O':
            tipusDieta = "Omnívor";
            break;
        case 'L':
            tipusDieta = "Fulles";
            break;
        }
        return tipusDieta;
    }

    // Getters i setters.

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDiet(char diet) {
        this.diet = diet;
    }

}
