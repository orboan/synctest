/*
 * Plane.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a plane.
 */
public class Plane {

    // Fields
    /** Plane's code. */
    private String code;
    /** Plane's model. */
    private String model;
    /** Plane's average velocity in km/h. */
    private double v;

    // Constructors
    
    /**
     * Constructor by default.
     */
    public Plane() {
        this.code = "AK-1111";
        this.model = "AirBus 380";
        this.v = 810;
    }

    /**
     * Constructor.
     * 
     * @param code the plane's code.
     */
    public Plane(String code) {
        this.code = code.trim();
    }

    /**
     * Constructor.
     * 
     * @param code the plane's code.
     * @param model the plane's model.
     * @param v the plane's average velocity in km/h.
     */
    public Plane(String code, String model, double v) {
        this.code = code.trim();
        this.model = model.trim();
        this.v = v;
    }
    
    // equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
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
        Plane other = (Plane) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }
    
    // Getters & setters

    public String getCode() {
        return this.code;
    }

    public String getModel() {
        return this.model;
    }

    public double getV() {
        return this.v;
    }

}
