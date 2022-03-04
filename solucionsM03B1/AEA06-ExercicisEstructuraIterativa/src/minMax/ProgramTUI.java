/*
 * ProgramTUI.java        1.0 08/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;
import java.util.Locale;

public class ProgramTUI {

    /**
     * Find out the minimum and the maximum of a sequence of numbers.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        int n, num, max, min, i;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nMÀXIM I MÍNIM.\n\n");
        System.out.print("Quants nombres vols entrar ? ");
        n = s.nextInt();
        // Initialize the sequence
        i = 0;
        System.out.print("\nNombre ? ");
        num = s.nextInt();
        // Initialize the maximum with the first number of the sequence
        max = num;
        // Initialize the minimum with the first number of the sequence
        min = num;
        while (i < n - 1) {
            System.out.print("\nNombre ? ");
            num = s.nextInt();
            // Change the maximum if we find a greater number
            max = num > max ? num : max;
            // Change the minimum if we find a lower number
            min = num < min ? num : min;           
            i++;
        }
        System.out.printf("\nMÀXIM = %d\n", max);
        System.out.printf("\nMÍNIM = %d\n\n", min);
    }

}
