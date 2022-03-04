/*
 * Shop.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;

/**
 * Modelizes a computing shop. 
 */
public class Shop {
    /** Current shop stock */
    private ArrayList<Product> stock;

    /**
     * Constructor.
     */
    public Shop() {
        this.stock = new ArrayList<Product>();
    }

    /**
     * Add product to the stock.
     * 
     * @param p the product
     * @return true if it has been added, false otherwise
     */
    public boolean addProduct(Product p) {
        return this.stock.add(p);
    }

    /**
     * Remove a product from the stock.
     * 
     * @param p a product
     * @return true it has been removed, false otherwise
     */
    public boolean removeProduct(Product p) {
        return this.stock.remove(p);
    }

    /**
     * List shop stock
     */
    public void listStock() {
        int hd = 0, cpu = 0;
        System.out.println("\nCODI\tDESCRIPCIÓ\tUNI\tCAP/VEL\t\tPREU UNITAT\tPREU");
        System.out.println("----\t-----------\t---\t-------\t\t-----------\t----");
        for (Product a : this.stock) {
            System.out.println(a);
            if (a instanceof HardDisk) {
                hd += a.getUnits();
            }    
            else if (a instanceof Cpu) {
                cpu += a.getUnits();
            }    
        }
        System.out.println("\nNombre total de discs durs en estoc: " + hd);
        System.out.println("Nombre total de CPUs en estoc: " + cpu);
        System.out.println("\nValor total de l'estoc: " + stockValue());

    }

    /**
     * Calculates total stock value.
     * 
     * @return the value
     */
    public float stockValue() {
        float total = 0;
        for (Product c : stock) {
            total = total + c.getUnits() * c.price();
        }
        return total;
    }

}
