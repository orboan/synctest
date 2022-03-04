package traffic;

import java.util.ArrayList;

/*
 * RoadStretch.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a road stretch.
 */
public class RoadStretchSolution {

    /** The road's name. */
    private String name;
    /** The current queue of cars on the road stretch. */
    private ArrayList<Car> queue;

    /**
     * Constructor.
     */
    public RoadStretchSolution() {
        this.queue = new ArrayList<Car>();
    }

    /**
     * Constructor.
     * 
     * @param name
     */
    public RoadStretchSolution(String name) {
        this.name = name;
        this.queue = new ArrayList<Car>();
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
        if (!queue.contains(c)) {
            queue.add(c);
            return queue.indexOf(c) + 1;
        }
        return -1;
    }

    /**
     * Removes the first car of the queue and returns it.
     * 
     * @return the first car of the queue or null if it is not on the road.
     */
    public Car firstCar() {
        Car c = null;
        if (queue.size() > 0) {
            c = queue.get(0);
            queue.remove(0);
        }
        return c;
    }

    /**
     * Calculates the length of the queue in meters. The distance between two
     * cars is 2 meters.
     * 
     * @return the length of the queue.
     */
    public double queueLength() {
        double l = 0;
        for (Car c : queue) {
            l += c.getLength();
            l += 2;
        }

        return l - 2;
    }

    /**
     * Calculates how many cars there are in teh queue.
     * 
     * @return the number of cars.
     */
    public int numCars() {
        return queue.size();
    }

    // Getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
