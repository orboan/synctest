/*
 * Player.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a player on a board.
 */
public class Player {

    /** The player's number */
    private int number;
    /** The player's position */
    private Position pos;

    // Constructors

    public Player() {
        this.number = 0;
        this.pos = new Position();
    }

    public Player(Position pos) {
        this.number = 0;
        this.pos = pos;
    }
    
    public Player(int x, int y) {
        this.number = 0;
        this.pos = new Position(x,y);
    }

    // Methods

    /**
     * Move the player right.
     */
    public void moveRight() {
        this.pos.incX();
    }

    /**
     * Move the player left.
     */
    public void moveLeft() {
        this.pos.decX();
    }

    /**
     * Move the player up.
     */
    public void jump() {
        this.pos.incY();
    }

    /**
     * Move the player down.
     */
    public void fall() {
        this.pos.decY();
    }

    // Getters i setters

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position getPos() {
        return this.pos;
    }

}
