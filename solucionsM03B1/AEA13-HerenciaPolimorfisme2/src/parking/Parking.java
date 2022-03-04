/*
 * Parking.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a parking.
 */
public class Parking {

    /** Number of places in the parking */
    private int nSpaces;
    /** Parking places */
    private Vehicle[] spaces;

    // Constructor
    public Parking(int nSpaces) {
        this.nSpaces = nSpaces;
        this.spaces = new Vehicle[nSpaces];
    }

    /**
     * Adds a vehicle into the parking.
     * 
     * @param v a vehicle
     * @param ns the number of the space where the vehicle will be added.
     * @return true if the vehicle has been added, false otherwise.
     */
    public boolean add(Vehicle v, int ns) {
        if (ns > 0 && ns <= this.nSpaces) {
            if (this.spaces[ns - 1] == null) {
                this.spaces[ns - 1] = v;
                return true;
            }
        }
        return false;
    }

    /**
     * Remove a vehcle from a space.
     * 
     * @param ns the number of the space.
     * @return the removed vehicle.
     */
    public Vehicle remove(int ns) {
        if (ns > 0 && ns <= nSpaces) {
            Vehicle v = this.spaces[ns - 1];
            this.spaces[ns - 1] = null;
            return v;
        }
        return null;
    }

    /**
     * Calculates the fee of a vehicle.
     * 
     * @param ns the parking space where the car is parked.
     * @return the fee.
     */
    public double calculateFee(int ns) {
        if (spaces[ns - 1] != null)
            return spaces[ns - 1].calculateFee();
        return 0;
    }

    /**
     * Calculates the total amount parking has received.
     * 
     * @return the total.
     */
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < nSpaces; i++) {
            if (spaces[i] != null) {
                total = total + calculateFee(i + 1);
            }
        }
        return total;
    }

    /**
     * Makes a report that for each occupied parking space details the vehicle registration plate, indicates if the
     * vehicle is a car or a motorbike and indicates fee.
     * 
     * @param pathReport the path file where the report will be written.
     */
    public void reportTotal(String pathReport) {
        Writer w = new Writer(pathReport);
        for (int i = 0; i < nSpaces; i++) {
            Vehicle v = spaces[i];
            if (spaces[i] != null) {
                w.print((i + 1) + ": ");
                w.print(v.getMatricula());
                if (v instanceof Car) {
                    w.print("\tCOTXE\t");
                } else if (v instanceof Motorbike) {
                    w.print("\tMOTO\t");
                }
                w.print(calculateFee(i));
                w.println("");
            }
        }
        w.println("");
        w.println("TOTAL RECAPTACIÓ: " + calculateTotal());
        w.close();
    }
}
