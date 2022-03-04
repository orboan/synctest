/*
 * Program.java        1.0 30/11/2011
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
     * Write the square and the cube of each element of an array.
     * 
     * @param a an array
     */
    public void writeSquareCube(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.printf("\n%d %d %d", a[i], (int) Math.pow(a[i], 2), 
                                                  (int) Math.pow(a[i], 3));
        }
    }
}
