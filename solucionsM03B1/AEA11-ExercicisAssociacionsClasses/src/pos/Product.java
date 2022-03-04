/*
 * Product.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a product.
 */
public class Product {

    // fields
    /** Product's EAN */
    private int ean;
    /** Product's description */
    private String description;
    /** Product's brand */
    private String brand;
    /** Product's price */
    private double price;

    // Constructors
    /**
     * Constructor by default.
     */
    public Product() {
        this.ean = 123456;
        this.description = "Formatge d'ovella";
        this.brand = "La Pastora";
        this.price = 18.7;
    }

    /**
     * Constructor.
     * 
     * @param ean the product's EAN
     */
    public Product(int ean) {
        this.ean = ean;
    }

    /**
     * Constructor.
     * 
     * @param ean the product's EAN
     * @param description the product's description
     * @param brand the product's brand
     * @param price the product's price
     */
    public Product(int ean, String description, String brand, double price) {
        this.ean = ean;
        this.description = description.trim();
        this.brand = brand.trim();
        this.price = price;
    }

    // equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ean;
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
        Product other = (Product) obj;
        if (ean != other.ean)
            return false;
        return true;
    }

    // Getters & setters
    
    public double getPrice() {
        return this.price;
    }
}
