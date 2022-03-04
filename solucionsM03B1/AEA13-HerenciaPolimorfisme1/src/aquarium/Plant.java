/*
 * Plant.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a plant.
 */
public class Plant extends Organism {

    private char type;

    // Constructor
    public Plant(String name, String family, char light, double maxTemp, double minTemp, double maxPH, double minPH) {
        super(name, family, light, maxTemp, minTemp, maxPH, minPH);
    }

    /**
     * Translates the plant type code to a detailed explanation.
     * 
     * @return the translation.
     */
    public String plantType() {
        String plantType = null;
        switch (type) {
        case 'S':
            plantType = "Tija";
            break;
        case 'B':
            plantType = "Bulb";
            break;
        case 'R':
            plantType = "Arrel";
            break;
        }
        return plantType;
    }

    // Getters & setters

    public void setType(char type) {
        this.type = type;
    }

}
