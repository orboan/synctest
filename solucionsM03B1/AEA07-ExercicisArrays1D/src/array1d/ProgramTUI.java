/*
 * ProgramTUI.java        1.0 28/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramTUI {

    /**
     * Read some values, store them in an array and write them.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nLECTURA I ESCRIPTURA D'UN ARRAY DE NÚMEROS\n\n");
        // Reade the length of the array
        System.out.print("Dimensió ? ");
        int n = s.nextInt();
        // Create the array, allocate enough memory for n elements
        double[] a = new double[n];
        // Read n numbers and store them in the array
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = s.nextDouble();
        }
        // Write all the elements of the array
        System.out.print("\nArray = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("'%f' ", a[i]);
        }
        System.out.print("\n\n");
    }

}
