/*
 * Product.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a product.
 */
public abstract class Product {

    /** Product code. */
    private String code;
    /** Product description. */
    private String description;
    /** Number of units of this product. */
    private int units;
    /** Product base price. */
    private float basePrice;

    // Constructor.

    public Product(String code, String description, int units, float basePrice) {
        this.code = code;
        this.description = description;
        this.units = units;
        this.basePrice = basePrice;
    }

    /**
     * Calculates the final price of the product.
     * 
     * @return the price.
     */
    public abstract float price();

    // Getters & setters
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public int getUnits() {
        return units;
    }

    // equals & hashCode
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (this.code == null) {
            if (other.code != null)
                return false;
        } else if (!this.code.equals(other.code))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

}
