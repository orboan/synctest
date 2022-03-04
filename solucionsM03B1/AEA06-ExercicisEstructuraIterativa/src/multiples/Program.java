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
     * Write the multiples of n1 lesser or equal26 than n2.
     * 
     * @param n1 an integer number.
     * @param n2 an integer number.
     */
    public void writeMultiples(int n1, int n2) {
        int i = n1;
        while (i <= n2) {
            System.out.printf("%d ", i);
            i = i + Math.abs(n1);
        }
        System.out.println();
    }    
}
