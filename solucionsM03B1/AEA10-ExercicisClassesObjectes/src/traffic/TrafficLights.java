/*
 * TrafficLights.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * Modelizes traffic lights.
 * 
 * @author Mònica Ramírez Arceda
 * @version 25/02/2010
 * 
 */
public class TrafficLights {

    /** The colour. */
    private String colour;
    /** The road stretch where traffic lights are. */
    private RoadStretch c;
    /** Internal chronometre */
    private DateTime t1;
    private DateTime t2;

    /**
     * Constructor.
     * 
     * @param c a road stretch.
     */
    public TrafficLights(RoadStretch c) {
        // TODO
    }

    /**
     * Changes colour of traffic lights: * If the light is green, calls
     * green2orange() * If the light is orange, calls orange2red() * If the
     * light is red, calls red2green()
     * 
     * Returns a list with all cars that have gone through the transition of
     * colours. The list is got through the previous methods.
     * 
     * @return a list with cars that have gone through traffic lights.
     * 
     */
    public ArrayList<Car> changeColour() {
        // TODO
        return null;
    }

    /**
     * Simulates the transition from red to green. Sets the light to green and
     * starts the internal chronometer. The light was red, so no cars have gone
     * through traffic lights.
     * 
     * @return null
     */
    private ArrayList<Car> red2green() {
        // TODO
        return null;
    }

    /**
     * Simulates the transition from green to orange. Sets the light to orange
     * and builds a list with cars that have gone through: stops the internal
     * chronometer and gets the number of seconds. We can suppose that when the
     * ligth is green, each second a car go through traffic lights.
     * 
     * @return a list with cars that have gone through or null if no cars have
     *         gone through.
     */
    private ArrayList<Car> green2orange() {
        // TODO
        return null;
    }

    /**
     * Simulates the transition from orange to red. Sets the light to red and
     * it's supposed that a car can go through or not randomly.
     * 
     * @return a list with one car or null.
     */
    private ArrayList<Car> orange2red() {
        // TODO
        return null;
    }

    // Getters & setters

    public String getColour() {
        // TODO
        return null;
    }

}
