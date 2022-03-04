/*
 * CompUnDigit.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a cyclic counter with one digit.
 */
public class Counter1Digit {

    /** The counter's digit. */
    private int digit;

    // Constructors

    /**
     * Constructor by default.
     */
    public Counter1Digit() {
        this.digit = 0;
    }

    /**
     * Constructor.
     * 
     * @param digit The initial counter's digit.
     */
    public Counter1Digit(int digit) {
        if (digit >= 0 && digit <= 9) {
            this.digit = digit;
        } else {
            this.digit = 0;
        }
    }

    /**
     * Increments the counter's digit by 1. If the value of the counter is 10,
     * set the counter to 0.
     */
    public void increment() {
        if (this.digit < 9) {
            this.digit++;
        } else {
            this.reset();
        }
    }

    /**
     * Resets the counter.
     */
    public void reset() {
        this.digit = 0;
    }

    // Getters and setters

    public int getDigit() {
        return this.digit;
    }

    /**
     * Setter. Controls that the digit is between 0 and 9.
     * 
     * @param digit the counter's digit.
     */
    public void setDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            this.digit = digit;
        }
    }
}
