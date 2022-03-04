/*
 * Program.java        1.0 12/12/2011
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

    public void histogram(int[] weights) {
        int maxWeight = 100;
        int i, j;
        // Array with the number of people with a concrete wieght.
        // In each cell there is the number of people who weighs index+1 kg.
        // For instance, in the cell 57 we have the number of people that weighs
        // 58kg
        int[] hist = new int[maxWeight];
        // For each weight, add 1 to the corresponding cell
        for (i = 0; i < weights.length; i++) {
            hist[weights[i] - 1]++;
        }
        System.out.printf("\nPes\tNombre de persones\n");
        System.out.printf("---------------------------------------------------------");
        // For each weight in the histogram, if it is positive, draw the
        // asterisks bar.
        for (i = 0; i < maxWeight; i++) {
            if (hist[i] > 0) {
                System.out.printf("\n%d\t", i + 1); // Print the weight
                for (j = 0; j < hist[i]; j++) {
                    System.out.printf("*");
                }
            }
        }
        System.out.printf("\n\n");
    }
}
