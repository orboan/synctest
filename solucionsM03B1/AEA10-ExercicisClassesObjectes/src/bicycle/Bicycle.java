/*
 * Bicycle.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a bicycle.
 * 
 * A bicycle has a model, rear and front sprockets that may be changed if the
 * bicycle is moving and can be accelerated or braked. The minimum rear and
 * front sprockets have number 1. The second rear and front sprockets have
 * number 2 and so on.
 */
public class Bicycle {

    /** The bicycle's model. */
    private String model;
    /** The engaged front sprocket. */
    private int frontSprocket;
    /** The engaged rear sprocket. */
    private int rearSprocket;
    /** The number of front sprockets the bicyle has. */
    private int nFrontSprockets;
    /** The number of rear sprockets the bicyle has. */
    private int nRearSprockets;
    /** The bicycle's speed in km/h. */
    private double v;
    /** The maximum speed of the bicycle */
    private final static int VMAX = 100;
    /** Increment of the bicycle speed */
    private final static int DV = 5;

    /**
     * Constructor by default. Creates a stopped mountain bike with 3 front
     * sprockets, 7 rear sprockets and with the first front and rear sprockets
     * engaged.
     */
    public Bicycle() {
        this.model = "Mountain bike";
        this.frontSprocket = 3;
        this.rearSprocket = 1;
        this.nFrontSprockets = 3;
        this.nRearSprockets = 7;
        this.v = 0;
    }

    /**
     * Constructor. Creates a mountain bike with the first rear sprocket engaged
     * and the last front sprocket engaged
     * 
     * @param nFrontSprockets The number of front sprockets of the bicycle.
     * @param nRearSprockets the number of rear sprockets of the bicycle..
     * @param v The bicycle's speed in km/h.
     */
    public Bicycle(int nFrontSprockets, int nRearSprockets, double v) {
        this.model = "Mountain bike";
        this.nFrontSprockets = nFrontSprockets;
        this.nRearSprockets = nRearSprockets;
        if (nRearSprockets >= 3) {
            this.nRearSprockets = nRearSprockets;
        } else {
            this.nRearSprockets = 3;
        }
        this.frontSprocket = nFrontSprockets;
        this.rearSprocket = 1;
        this.v = v;
    }

    /**
     * Constructor.
     * 
     * @param model The bicycle's model.
     * @param frontSprocket The engaged front sprocket.
     * @param rearSprocket The rear front sprocket.
     * @param nFrontSprockets The number of front sprockets the bicyle has.
     * @param nRearSprockets The number of rear sprockets the bicyle has.
     * @param v The bicycle's speed in km/h.
     */
    public Bicycle(String model, int frontSprocket, int rearSprocket, int nFrontSprockets, int nRearSprockets, double v) {
        this.model = model;
        this.frontSprocket = frontSprocket;
        this.rearSprocket = rearSprocket;
        this.nFrontSprockets = nFrontSprockets;
        if (nRearSprockets >= 3) {
            this.nRearSprockets = nRearSprockets;
        } else {
            this.nRearSprockets = 3;
        }
        this.v = v;
    }

    /**
     * Changes the engaged front sprocket. Increases or decreases the front
     * sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the front sprocket must be increased
     *        or decreased. If n is positive the front sprocket will be
     *        increased. If n is negative the front sprocket will be decreased.
     *        If n is 0, the front sprocket won't be changed.
     * @return true if the front sprocket is changed, false otherwise.
     */
    public boolean changeFrontSprocket(int n) {
        boolean isChanged = true;
        if (this.frontSprocket < this.nFrontSprockets && n > 0 && this.v > 0) {
            this.frontSprocket++;
        } else if (this.frontSprocket > 1 && n < 0 && this.v > 0) {
            this.frontSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }

    /**
     * Changes the engaged rear sprocket. Increases or decreases the rear
     * sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the rear sprocket must be increased
     *        or decreased. If n is positive the rear sprocket will be
     *        increased. If n is negative the rear sprocket will be decreased.
     *        If n is 0, the rear sprocket won't be changed.
     * @return true if the rear sprocket is changed, false otherwise.
     */
    public boolean changeRearSprocket(int num) {
        boolean isChanged = true;
        if (rearSprocket < nRearSprockets && num > 0 && v > 0) {
            rearSprocket++;
        } else if (rearSprocket > 1 && num < 0 && v > 0) {
            rearSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }

    /**
     * Accelerates the bicycle.
     */
    public void accelerate() {
        this.v = this.v + Bicycle.DV > Bicycle.VMAX ? Bicycle.VMAX : this.v + DV;
    }

    /**
     * Decreases the velocity of the bicycle.
     */
    public void brake() {
        this.v = this.v - Bicycle.DV <= 0 ? 0 : this.v - Bicycle.DV;
    }

    /**
     * Stops the bicycle.
     */
    public void stop() {
        this.v = 0;
    }

    /**
     * Slows the bicycle down.
     */
    public boolean slowDown() {
        boolean slow = false;
        // Front sprocket is not the smallest
        if (this.frontSprocket > 1) {
            // Rear sprocket is lesser than the last but one
            if (this.rearSprocket < this.nRearSprockets - 1) {
                slow = this.changeRearSprocket(1); // Move rear sprocket up
            } else { // Rear sprocket is the last but one
                // Move front sprocket down
                boolean r1 = this.changeFrontSprocket(-1);
                // Move rear sprocket down
                boolean r2 = this.changeRearSprocket(-1);
                slow = r1 || r2;
            }
        } else {
            slow = this.changeRearSprocket(1);
        }
        return slow;
    }

    /**
     * Slows the bicycle up.
     */
    public boolean speedUp() {
        boolean speed = false;
        // Front sprocket is not the greatest
        if (this.frontSprocket < this.nFrontSprockets) {
            // Rear sprocket is greater than the second
            if (this.rearSprocket > 2) {
                speed = this.changeRearSprocket(-1);
            } else { // Rear sprocket is the second
                // Move front sprocket up
                boolean s1 = this.changeFrontSprocket(1);
                // Move front sprocket up
                boolean s2 = this.changeRearSprocket(1);
                speed = s1 || s2;
            }
        } else {
            speed = this.changeRearSprocket(-1);
        }
        return speed;

    }

    // Setter and getters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.trim();
    }

    public int getRearSprocket() {
        return rearSprocket;
    }

    public void setRearSprocket(int rearSprocket) {
        this.rearSprocket = rearSprocket;
    }

    public int getFrontSprocket() {
        return frontSprocket;
    }

    public void setFrontSprocket(int frontSprocket) {
        this.frontSprocket = frontSprocket;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
