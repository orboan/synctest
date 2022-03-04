/*
 * Position.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a player's position on a board.
 */
public class Position {
    /** X coordinate */
    private int x;
    /** Y coordinate */
    private int y;

    // Constructors
    public Position() {
        //this.x = 0;
        //this.y = 0;
        this.setX(0);
        this.setY(0);
    }

    public Position(int x, int y) {
        //this.x = x;
        //this.y = y;
        this.setX(x);
        this.setY(y);
    }

    /**
     * Increments X coordinate.
     */
    public void incX() {
        this.x++;
    }

    /**
     * Increments Y coordinate.
     */
    public void incY() {
        this.y++;
    }

    /**
     * Decrease X coordinate.
     */
    public void decX() {
        this.x--;
    }

    /**
     * Decrease Y coordinate.
     */
    public void decY() {
        this.y--;
    }

    /**
     * Sets X and Y coordinates.
     * 
     * @param x the X coordinate
     * @param y the X coordinate
     */
    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // Getters and setters
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
