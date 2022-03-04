package traffic;

/*
 * Car.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Modelizes a car.
 * 
 */
public class CarSolution {

    /** The car's registration number. */
    private String regNumber;
    /** Car's length, in meters. */
    private double length;

    /**
     * Constructor.
     */
    public CarSolution() {
        this.regNumber = "1234-ABC";
        this.length = 4;
    }

    /**
     * Constructor.
     * 
     * @param regNumber
     */
    public CarSolution(String regNumber) {
        this.regNumber = regNumber;
    }

    // Equals-HasCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarSolution other = (CarSolution) obj;
        if (regNumber == null) {
            if (other.regNumber != null)
                return false;
        } else if (!regNumber.equals(other.regNumber))
            return false;
        return true;
    }

    // Getters i setters
    public double getLength() {
        return length;
    }

}
