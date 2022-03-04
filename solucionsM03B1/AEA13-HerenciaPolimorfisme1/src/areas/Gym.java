/*
 * Gym.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a gym.
 */
public class Gym extends Classroom {
    private boolean showers;
    private int nStands;

    // Constructor.
    public Gym(String code, int surfaceArea, boolean naturalLight, double consumption, int capacity) {
        super(code, surfaceArea, naturalLight, consumption, capacity);
    }

    @Override
    public double surfaceAreaStudent() {
        if (this.getCapacity() > 0) {
            return (this.getSurfaceArea() + nStands) / this.getCapacity();
        } else {
            return 0;
        }
    }

    // Getters & setters
    
    public boolean isShowers() {
        return showers;
    }

    public void setShowers(boolean showers) {
        this.showers = showers;
    }

    public int getNStands() {
        return nStands;
    }

    public void setNstands(int nStands) {
        this.nStands = nStands;
    }

}
