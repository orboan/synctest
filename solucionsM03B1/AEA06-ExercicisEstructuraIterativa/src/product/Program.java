/*
 * Program.java        1.0 08/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Multiply two numbers.
     * 
     * @param a an integer number.
     * @param b an integer number.
     * @return the product of a by b
     */
    public int multiply(int a, int b) {
        int prod = 0;
        for (int i = 0; i < a; i++) {
            prod = prod + b;
        }
        return prod;
    }

}
