/*
 * Ferry.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Jiaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;

/**
 * Modelizes a lorry.
 */
public class Ferry {

    // Fields
    /** Ferry's registration number. */
    private String regNumber;
    /** Ferry's name. */
    private String name;
    /** Harbour's name of the ferry's destination . */
    private String harbourName;
    /** Price that must pay a lorry per axle. */
    private double pricePerAxle;
    /** Price that must pay a lorry per ton. */
    private double pricePerTon;
    /** Maximum weight the ferry can support. */
    private double maxWeight;
    /** Lorries boarded on the ferry. */
    private ArrayList<Lorry> boardedLorries;

    // Constructors
    /**
     * Constructor by default.
     */
    public Ferry() {
        this.regNumber = "SA-123";
        this.name = "Estel del Sud";
        this.harbourName = "Maó";
        this.pricePerAxle = 3.0;
        this.pricePerTon = 6.0;
        this.maxWeight = 200;
        this.boardedLorries = new ArrayList<Lorry>();
    }

    /**
     * Constructor.
     * 
     * @param regNumber the ferry's registration number.
     */
    public Ferry(String regNumber) {
        this.regNumber = regNumber.trim();
        this.boardedLorries = new ArrayList<Lorry>();
    }

    /**
     * Constructor.
     * 
     * @param regNumber the ferry's registration number.
     * @param name the ferry's name.
     * @param harbourName the harbour's name of the ferry's destination.
     * @param pricePerAxle the price per axle.
     * @param pricePerTon the price pèr ton.
     * @param maxWeight the maximum weight the ferry can support.
     */
    public Ferry(String regNumber, String name, String harbourName, double pricePerAxle,
            double pricePerTon, double maxWeight) {
        this.regNumber = regNumber.trim();
        this.name = name.trim();
        this.harbourName = harbourName.trim();
        this.pricePerAxle = pricePerAxle;
        this.pricePerTon = pricePerTon;
        this.maxWeight = maxWeight;
        this.boardedLorries = new ArrayList<Lorry>();
    }

    /**
     * Calculates the total weight of boarded lorries.
     * 
     * @return the total weight in tons.
     */
    public double totalWeight() {
        double tw = 0.0;
        for (Lorry lorry : boardedLorries) {
            tw += lorry.getWeight();
        }
        return tw;
    }

    /**
     * Finds out if a lorry is boarded.
     * 
     * @param lorry a lorry
     * @return true if the lorry is boarded, false otherwise
     */
    public boolean isBoarded(Lorry lorry) {
        boolean isOnFerry = this.boardedLorries.contains(lorry);
        return isOnFerry;
    }

    /**
     * Finds out whether a lorry can board.
     * 
     * @param lorry a lorry
     * @return true if the lorry can board, false otherwise.
     */
    public boolean canBoard(Lorry lorry) {
        boolean board = !this.isBoarded(lorry)
                && this.totalWeight() + lorry.getWeight() <= this.maxWeight;
        return board;
    }

    /**
     * Boards a lorry.
     * 
     * @return true if the lorry is boarded, false otherwise.
     */
    public boolean board(Lorry lorry) {
        boolean boarded = false;
        boolean canBeBoarded = this.canBoard(lorry);
        if (canBeBoarded) {
            boarded = this.boardedLorries.add(lorry);
        }
        return boarded;
    }

    /**
     * Finds the n-th lorry that boarded on the ferry.
     * 
     * @param n an integer number
     * @return the lorry in the n-th position, null if n is not correct.
     */
    public Lorry lorryInPosition(int n) {
        if (n > 0 && n <= boardedLorries.size())
            return boardedLorries.get(n - 1);
        return null;
    }

    /**
     * Calculates the toll a lorry must pay when it boards.
     * 
     * @param lorry a lorry
     * @return the toll's price in €.
     */
    public double tollPrice(Lorry lorry) {
        double weight = lorry.getWeight();
        int nAxles = lorry.getNAxles();
        double toll = nAxles * this.pricePerAxle + weight * this.pricePerTon;
        return toll;
    }

    /**
     * Calculates the total amount of collected tolls.
     * 
     * @return the total amount in €.
     */
    public double collectedTolls() {
        double totalTolls = 0.0;
        for (Lorry lorry : boardedLorries) {
            totalTolls += this.tollPrice(lorry);
        }
        return totalTolls;
    }

    /**
     * Compares two ferries to decide if they're equals. Two ferries are equals
     * if both have the same registration number.
     * 
     * @param object an object
     * @return true if both have the same registration number, false otherwise
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Ferry other = (Ferry) obj;
        if ((this.regNumber == null) ? (other.regNumber != null) : !this.regNumber
                .equals(other.regNumber)) {
            return false;
        }
        return true;
    }

    /**
     * Calculates a hash code for this ferry.
     * 
     * @return a hash code for the ferry.
     */
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.regNumber != null ? this.regNumber.hashCode() : 0);
        return hash;
    }

}
