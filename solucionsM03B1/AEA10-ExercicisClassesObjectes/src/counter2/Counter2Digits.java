/*
 * CompDosDigits.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a cyclic counter with two digits.
 */
public class Counter2Digits {

    // Atributs
    /** Units' counter. */
    private Counter1Digit counterUnits;
    /** Tens' counter. */
    private Counter1Digit counterTens;

    // Constructors

    /**
     * Constructor by default.
     */
    public Counter2Digits() {
        this.counterUnits = new Counter1Digit();
        this.counterTens = new Counter1Digit();
    }

    /**
     * Constructor.
     * 
     * @param counterUnits The units' counter.
     * @param counterUnits The tens' counter.
     */
    public Counter2Digits(Counter1Digit counterUnits, Counter1Digit counterTens) {
        this.counterUnits = counterUnits;
        this.counterTens = counterTens;
    }

    /**
     * Increments the value of the counter by 1. If the units' counter is 0,
     * increments the tens' counter.
     */
    public void increment() {
        this.counterUnits.increment();
        if (this.counterUnits.getDigit() == 0) {
            this.counterTens.increment();
        }
    }

    /**
     * Resets the counter.
     */
    public void reset() {
        this.counterUnits.reset();        
        this.counterTens.reset();
    }

    // Getters and setters

    public Counter1Digit getCounterUnits() {
        return counterUnits;
    }

    public Counter1Digit getCounterTens() {
        return counterTens;
    }

    public void setCounterUnits(Counter1Digit counterUnits) {
        this.counterUnits = counterUnits;
    }

    public void setCounterTens(Counter1Digit counterTens) {
        this.counterTens = counterTens;
    }
}
