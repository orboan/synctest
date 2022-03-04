/*
 * Laboratory.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a laboratory.
 */
public class Laboratory extends Classroom {

    /** Number of bunsens the laboratory has */
    private int nBunsen;

    // Constructor.

    public Laboratory(String code, double surfaceArea, boolean naturalLight, int consumption, int capacity) {
        super(code, surfaceArea, naturalLight, consumption, capacity);
    }

    // Getters & setters.

    public int getnBunsen() {
        return nBunsen;
    }

    public void setnBunsen(int nBunsen) {
        this.nBunsen = nBunsen;
    }

}
