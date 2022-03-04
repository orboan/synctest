/*
 * Classroom.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a classroom.
 */
public class Classroom extends Area {

    /** Classroom capacity, how many students fit in */
    private int capacity;
    /** Indicates whether chairs have table or tables are independent */
    private boolean chairTable;
    /** Number of computers in the classroom */
    private int nComputers;
    /** Indicates if there is network connection in the classroom */
    private boolean networkConn;

    // Constructor.

    public Classroom(String code, double surfaceArea, boolean naturalLight, double consumption, int capacity) {
        super(code, surfaceArea, naturalLight, consumption);
        this.capacity = capacity;
    }

    /**
     * Calculates the surface area per student.
     * 
     * @return the surface area in m2.
     */
    public double surfaceAreaStudent() {
        if (this.capacity > 0) {
            return this.getSurfaceArea() / this.capacity;
        } else {
            return 0;
        }
    }

    // Getters & setters

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isChairTable() {
        return chairTable;
    }

    public void setChairTable(boolean chairTable) {
        this.chairTable = chairTable;
    }

    public int getNComputers() {
        return nComputers;
    }

    public void setNComputers(int nComputers) {
        this.nComputers = nComputers;
    }

    public boolean isNetworkConn() {
        return networkConn;
    }

    public void setNetworkConn(boolean networkConn) {
        this.networkConn = networkConn;
    }

}
