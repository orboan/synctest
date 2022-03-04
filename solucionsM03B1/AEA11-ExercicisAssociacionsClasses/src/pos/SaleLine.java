/*
 * SaleLine.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a sale line.
 */
public class SaleLine {

    // Fields
    /** Number of units of product. */
    private int nup;
    /** Product */
    private Product product;

    // Constructors

    /**
     * Constructor by default.
     */
    public SaleLine() {
        this.nup = 10;
        this.product = new Product();
    }

    /**
     * Constructor.
     * 
     * @param nupthe number of units of product
     * @param product the product
     */
    public SaleLine(int nup, Product product) {
        this.nup = nup;
        this.product = product;
    }

    // equals & hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
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
        SaleLine other = (SaleLine) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }

    // Getters & setters
    public void setProducte(Product producte) {
        this.product = producte;
    }

    public void setNup(int nup) {
        this.nup = nup;
    }

    public int getNup() {
        return this.nup;
    }

    public Product getProduct() {
        return this.product;
    }
}
