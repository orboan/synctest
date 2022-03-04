/*
 * Program.java        1.0 28/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Sum all the elements of an array.
     * 
     * @param nums an array
     * @return the sum
     */
    public double sumArray(double[] nums) {
        double sum = 0;
        for (double x : nums) {
            // sum = sum + x;
            sum += x;
        }
        return sum;
    }

}
