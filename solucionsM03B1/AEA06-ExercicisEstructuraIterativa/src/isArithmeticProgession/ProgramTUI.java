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

public class ProgramTUI {

    /**
     * Read a sequence of numbers ending in 0 and write whether it is an
     * arithmetic progression.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        int s1, s2, d;
        boolean found = false;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nPROGRESSIÓ ARITMÈTICA\n\n");
        // Initialize the sequence with the first three numbers
        System.out.print("Nombre enter ? ");
        s1 = s.nextInt();
        System.out.print("Nombre enter ? ");
        s2 = s.nextInt();
        d = s2 - s1; // Calculate the difference of the arithmetic progression
        while (s2 != 0 && !found) {
            // Check if it is not an arithmetic progression
            if (s2 - s1 != d) {
                found = true;
            } else {
                s1 = s2; // Save the current value as the previous value
                System.out.print("Nombre enter ? ");
                s2 = s.nextInt();
            }
        }
        if (found) {
            System.out.print("\nNO és una progressió aritmètica\n\n");
        } else {
            System.out.print("\nSÍ és una progressió aritmètica\n\n");
        }
    }

}
