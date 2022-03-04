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
     * Read a sequence of number ending with a 0 and writes if there are more
     * positive numbers or more negative numbers.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        int n = 1, pos = 0, neg = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nNOMBRES POSITIUS I NEGATIUS.\n\n");
        System.out.print("Nombre ? ");
        n = s.nextInt();
        while (n != 0) {
            // Add 1 to the number of positive numbers or to the number of
            // negative numbers.
            if (n >= 0) {
                pos++;
            } else {
                neg++;
            }
            System.out.print("Nombre ? ");
            n = s.nextInt();
        }
        if (pos > neg) {
            System.out.print("\nHi ha més positius que negatius.\n\n");
        } else {
            System.out.print("\nHi ha més negatius que positius.\n\n");
        }
    }

}
