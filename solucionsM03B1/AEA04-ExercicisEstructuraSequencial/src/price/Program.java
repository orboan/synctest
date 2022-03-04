/*
 * Program.java        1.0 11/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Calculates the final price of a product.
     * 
     * @param grossAmount the gross amount of a product.
     * @param vat the applied VAT, in %.
     * @param discount the applied discount, in %.
     * @return the net price.
     */
    public float price(float grossAmount, float vat, float discount) {
        float finalPrice;
        // Calculate the final price
        finalPrice = grossAmount - grossAmount * discount / 100;
        finalPrice = finalPrice + finalPrice * vat / 100;
        return finalPrice;
    }

}
