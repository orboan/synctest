/*
 * Bicycle.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a bicycle.
 */
public class Bicycle extends Transport {
    
    /** Number of gears of the bicycle */
    private int nGears;

    // Constructors.

    public Bicycle(String id, double speed) {
        super(id, speed);
    }

    public Bicycle(String id, double speed, int nGears) {
        super(id, speed);
        this.nGears = nGears;
    }

    @Override
    public double cost(double distance) {
        return 0;
    }

    // Getters & setters
    public int getNGears() {
        return nGears;
    }

}
