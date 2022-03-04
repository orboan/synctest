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
     * Read a number n and n numbers and write its product. This algorithm
     * doesn't use the operator *.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        int n = 1, x, i = 0, j = 0, res = 0, total = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nPRODUCTE.\n\n");
        // Read the first number and initialize the total
        System.out.print("Quants nombre vols multiplicar ? ");
        n = s.nextInt();
        total = 1;
        for (i = 0; i < n; i++) {
            // Continue reading
            System.out.print("Número ? ");
            x = s.nextInt();
//            total = total * x;
            // Multiply without the operator *
            res = 0;
            for (j = 0; j < x; j++) {
                res = res + total;
            }
            // Update the total
            total = res;
        }
        System.out.printf("\nPRODUCTE = %d\n\n", total);
    }

}
