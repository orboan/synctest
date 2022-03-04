/*
 * ProgramTUI.java        1.0 12/12/2011
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
     * Read and write an array 2D.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nr, nc, i, j;
        int[][] m;
        System.out.printf("\n\nMATRIU\n\n");
        System.out.printf("Nombre de files ? ");
        nr = s.nextInt();
        System.out.printf("Nombre de columnes ? ");
        nc = s.nextInt();
        m = new int[nr][nc];
        // Read the array 2D
        for (i = 0; i < nr; i++) {
            for (j = 0; j < nc; j++) {
                System.out.printf("t[%d][%d] = ", i, j);
                m[i][j] = s.nextInt();
            }
        }
        // Write the array 2D
        System.out.printf("\nMatriu\n");
        for (i = 0; i < nr; i++) {
            for (j = 0; j < nc; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.printf("\n");
        }

    }

}
