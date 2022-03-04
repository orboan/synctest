/*
 * Office.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates an office.
 */
public class Office extends Area {
    
    /** Number of tables */
    private int nTables;
    /** Indicates whether there is a coffee machine or not */
    private boolean coffeeMachine;

    // Constructors.

    public Office() {
    }

    public Office(String code, double surfaceArea, boolean naturalLight, double consumption) {
        super(code, surfaceArea, naturalLight, consumption);
    }

    // Getters & setters.

    public int getNTables() {
        return nTables;
    }

    public void setNTables(int nTables) {
        this.nTables = nTables;
    }

    public boolean isCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(boolean coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

}
