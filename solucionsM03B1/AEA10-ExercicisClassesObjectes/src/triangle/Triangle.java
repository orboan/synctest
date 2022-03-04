/*
 * Triangle.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a triangle. Calculates a triangle's perimeter and area.
 */
public class Triangle {

    /** First triangle's side */
    private double side1;
    /** Second triangle's side */
    private double side2;
    /** Third triangle's side */
    private double side3;

    // Constructors

    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Methods

    /**
     * Calculates the trinalge's perimeter.
     * 
     * @return the perimeter.
     */
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    /**
     * Calcula the triangle's area.
     * 
     * @return the area.
     */
    public double area() {
        double sp = this.perimeter() / 2; // Semiperimeter
        double s = Math.sqrt(sp * (sp - this.side1) * (sp - this.side2) * (sp - this.side3));
        return s;
    }
}
