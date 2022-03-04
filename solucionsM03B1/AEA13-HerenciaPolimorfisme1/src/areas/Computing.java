/*
 * Computing.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a computing classroom.
 */
public class Computing extends Classroom {
    private int nPrinters;

    // Constructor.

    public Computing(String code, double surfaceArea, boolean naturalLight, double consumption,
        int capacity) {
        super(code, surfaceArea, naturalLight, consumption, capacity);
    }

    // Getters & setters

    public int getnPrinters() {
        return nPrinters;
    }

    public void setNPrinters(int nPrinters) {
        this.nPrinters = nPrinters;
    }   

}
