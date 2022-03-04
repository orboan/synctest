import java.util.Scanner;

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

public class ProgramTUI {

    /**
     * Read the grades of a group of students and write how many students got
     * each grade.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        double g;
        int nMD = 0, nI = 0, nS = 0, nB = 0, nN = 0, nE = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nNOTES ACADÈMIQUES.\n\n");
        System.out.print("Nombre real [0,10] (-1 per acabar) ? ");
        g = s.nextDouble();
        while (g != -1) {
            // Accumulate 1 to the corresponding grade accumulator
            if (0 <= g && g < 3) {
                nMD++;
            } else if (3 <= g && g < 5) {
                nI++;
            } else if (5 <= g && g < 6) {
                nS++;
            } else if (6 <= g && g < 7) {
                nB++;
            } else if (7 <= g && g < 9) {
                nN++;
            } else {
                nE++;
            }
            System.out.print("Nombre real [0,10] (-1 per acabar) ? ");
            g = s.nextDouble();
        }
        System.out.printf("\nMD = %d , I = %d , S = %d , B = %d , N = %d , Ex = %d\n\n", nMD, nI, nS, nB, nN, nE);
    }

}
