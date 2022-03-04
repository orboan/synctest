/*
 * Circle.java 1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a circle.
 */
public class Circle {

    /** The circle's radius */
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Mètodes

    /**
     * Calculates the circle's perimeter.
     * 
     * @return the perimeter
     */
    public double perimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    /**
     * Calculates the circle's area.
     * 
     * @return the circle's area.
     */
    public double area() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    /**
     * Determines which circle is the greatest.
     * 
     * @param anotherCircle another circle to be compared with the current
     *        circle.
     * @return the greatest circle
     */
    public Circle theGreatest(Circle anotherCircle) {
        if (this.getRadius() > anotherCircle.getRadius()) {
            return this;
        }
        return anotherCircle;
    }

    // Getters i setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
