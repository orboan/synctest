/*
 * Catalog.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.HashSet;

/**
 * Modelizes a catalog.
 */
public class Catalog {

    // Fields

    /** Catalog's name. */
    private String name;
    /** Catalog's products. */
    private HashSet<Product> products;

    // Constructors

    /**
     * Constructor by default.
     */
    public Catalog() {
        this.name = "Catàleg 2";
    }

    /**
     * Constructor.
     * 
     * @param name the catalog's name
     */
    public Catalog(String name) {
        this.name = name.trim();
    }

    // Methods

    /**
     * Adds a product into the catalog.
     * 
     * @param product the product to add
     * @return true if it is added, false otherwise
     */
    public boolean add(Product product) {
        boolean isAdded = this.products.add(product);
        return isAdded;
    }

    /**
     * Removes a product from the catalog.
     * 
     * @param product the product to remove
     * @return true if it is removed, false otherwise
     */
    public boolean remove(Product product) {
        boolean isRemoved = this.products.remove(product);
        return isRemoved;
    }

    /**
     * Searchs a product.
     * 
     * @param ean the product's EAN
     * @return the product or null if it is not found
     */
    public Product search(int ean) {
        Product searchedProduct = new Product(ean);
        for (Product p : this.products) {
            if (p.equals(searchedProduct)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Calculates how many products there are in the catalog.
     * 
     * @return the number of products
     */
    public int productsNumber() {
        return this.products.size();
    }

    // equals & hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Catalog other = (Catalog) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
