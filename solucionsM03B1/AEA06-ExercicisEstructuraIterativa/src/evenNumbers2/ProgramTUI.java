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

import java.util.Locale;
import java.util.Scanner;

public class ProgramTUI {

    /**
     * Reads a sequence of numbers ending with a 0 and writes how many of them
     * are even.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        int n, i = 0;
        // Set up the scanner
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Title of the program
        System.out.print("\n\nCOMPTAR NOMBRES PARELLS.\n\n");
        // Read the first number
        System.out.print("Nombre enter (0 per acabar) ? ");
        n = s.nextInt();
        // Continue reading numbers until we read a 0
        while (n != 0) {
            // Treat the number
            if (n % 2 == 0) {
                i++;
            }
            // Read another number
            System.out.print("Nombre enter (0 per acabar) ? ");
            n = s.nextInt();
        }
        // Write the result
        System.out.printf("\nNombre de nombres parells: %d\n", i);
    }

}
