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
     * Calculates the discount applied to a product.
     * 
     * @param grossAmount The gross amount of the product.
     * @param netAmount The net amount of the product (what has been paid).
     * @return The applied discount, in %
     */
    public float discount(float grossAmount, float netAmount) {
        return (grossAmount - netAmount) * 100 / grossAmount;
    }
}
