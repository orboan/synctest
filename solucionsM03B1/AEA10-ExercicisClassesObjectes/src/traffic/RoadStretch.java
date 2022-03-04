/*
 * RoadStretch.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.ArrayList;

/**
 * Modelizes a road stretch.
 */
public class RoadStretch {

    /** The road's name. */
    private String name;
    /** The current queue of cars on the road stretch. */
    private ArrayList<Car> queue;

    /**
     * Constructor.
     */
    public RoadStretch() {
        // TODO
    }

    /**
     * Constructor.
     * 
     * @param name
     */
    public RoadStretch(String name) {
        // TODO
    }

    /**
     * Adds a car to the end of the queue and calculates in which position this
     * car is in the queue. The first car is in position 1, the second is in
     * position 2...
     * 
     * Two cars with the same registration number are not allowed.
     * 
     * @param c a car
     * @return the position of the car on the road or -1 if the car is already
     *         on the road.
     */
    public int addCar(Car c) {
        // TODO
        return 0;
    }

    /**
     * Removes the first car of the queue and returns it.
     * 
     * @return the first car of the queue or null if it is not on the road.
     */
    public Car firstCar() {
        // TODO
        return null;
    }

    /**
     * Calculates the length of the queue in meters. The distance between two
     * cars is 2 meters.
     * 
     * @return the length of the queue.
     */
    public double queueLength() {
        // TODO
        return 0;
    }

    /**
     * Calculates how many cars there are in teh queue.
     * 
     * @return the number of cars.
     */
    public int numCars() {
        // TODO
        return 0;
    }

    // Getters & setters

    public String getName() {
        // TODO
        return null;
    }

    public void setName(String name) {
        // TODO
    }

}
