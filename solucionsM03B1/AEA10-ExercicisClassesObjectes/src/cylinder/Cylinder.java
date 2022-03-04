/*
 * Cylindre.java 1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a cylinder.
 */
public class Cylinder {

    /** The radius of the cylinder's base. */
    private double radius;
    /** The cylinder's height. */
    private double height;

    // Constructor

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the cylinder's volume.
     * 
     * @return the volume.
     */
    public double volume() {
        // This object is local. It'll be destroyed when this method finishes.
        Circle base = new Circle(radius);
        double volum = base.area() * this.height;
        return volum;
    }

    /**
     * Calculates the cylinder's area.
     * 
     * @return the area.
     */
    public double area() {
        // This object is local. It'll be destroyed when this method finishes.
        Circle base = new Circle(radius);
        double at = base.perimeter() * this.height + 2 * base.area();
        return at;
    }

    /**
     * Determines which cylinder is the greatest.
     * 
     * @param anotherCylinder another cylinder to be compared with the current
     *        cylinder.
     * @return the greatest cylinder.
     */
    public Cylinder theGreatest(Cylinder anotherCylinder) {
        if (this.volume() > anotherCylinder.volume()) {
            return this;
        }
        return anotherCylinder;
    }

    // Getters i setters

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
