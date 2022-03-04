/*
 * Transport.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates a transport.
 */
public abstract class Transport {
    /** Transport identifier */
    private String id;
    /** Transport speed */
    private double speed;

    // Constructor
    public Transport(String id, double speed) {
        this.id = id;
        this.speed = speed;
    }

    /**
     * Calculates how long the transport takes (in hours) to do a distance in km. Speed is constant.
     * 
     * @param distance the distance
     * @return the time in hours
     */
    public double time(double distance) {
        double t = distance / this.speed;
        return t;
    }

    /**
     * Calculates the cost to be paid transport users to do a distance in km.
     * 
     * @param distance the distance
     * @return the cost in euros
     */
    public abstract double cost(double distance);

    // Getters & setters

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

}
