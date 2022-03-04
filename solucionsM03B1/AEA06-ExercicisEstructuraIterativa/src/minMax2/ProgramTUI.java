/*
 * ProgramTUI.java        1.0 17/11/2011
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
     * Find out the minimum and the maximum of a sequence of numbers.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num, max, min;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nMÀXIM I MÍNIM.\n\n");
        // Initialize the sequence
        System.out.print("\nNombre ? ");
        num = s.nextInt();
        // Initialize the maximum with the first number of the sequence
        max = num;
        // Initialize the minimum with the first number of the sequence
        min = num;
        while (num != 0) {
            // Change the maximum if we find a greater number
            max = num > max ? num : max;
            // Change the minimum if we find a lower number
            min = num < min ? num : min;
            System.out.print("\nNombre ? ");
            num = s.nextInt();
        }
        System.out.printf("\nMÀXIM = %d\n", max);
        System.out.printf("\nMÍNIM = %d\n\n", min);
    }

}
