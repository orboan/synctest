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
     * Reads an integer x and a sequence of integers ending with a 0. Writes
     * whether one of these numbers is greater than x.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        int n = 1, x;
        boolean isGreater = false;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nENTERS MAJORS QUE UN NOMBRE.\n\n");
        System.out.print("Nombre pel qual vols saber si hi ha nombres més grans ? ");
        x = s.nextInt();
        // Initialize the sequence
        System.out.print("Nombre ? ");
        n = s.nextInt();
        while (n != 0 && !isGreater) {
            // If n is greater than x, change the flag
            if (n > x) {
                isGreater = true;
            } else {
                // Move forward in the sequence
                System.out.print("Nombre ? ");
                n = s.nextInt();
            }
        }
        if (isGreater) {
            System.out.printf("\nHi ha algun nombre més gran que %d.\n\n", x);
        } else {
            System.out.printf("\nNO hi ha cap nombre més gran que %d.\n\n", x);
        }

    }

}
