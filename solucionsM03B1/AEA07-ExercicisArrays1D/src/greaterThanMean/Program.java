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
     * Calculates the percentage of the elements of an array that are greater
     * than the mean of the elements of the array.
     * 
     * @param a an array
     * @return the percentage
     */
    public double percentageGreaterThanMean(double[] a) {
        double sum, mean, percent;
        int i, gt;
        // Calculate the mean
        sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += a[i];
        }
        mean = sum / a.length;
        // Count elements greater than mean
        gt = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] > mean) {
                gt++;
            }
        }
        // Calculate the percentage
        percent = (double) gt / a.length * 100;
        return percent;
    }
}
