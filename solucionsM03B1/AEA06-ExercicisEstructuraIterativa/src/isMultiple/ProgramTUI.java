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
     * Read a sequence of numbers and determines if one of them is a multiple of
     * another number.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int x, n, num, i;
        boolean found;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nMÚLTIPLES D'UN NOMBRE\n\n");
        System.out.print("Entra el nombre pel qual vols saber si hi ha algun múltiple : ");
        x = s.nextInt();
        System.out.print("Entra quants nombres té la seqüència : ");
        n = s.nextInt();
        // Initialize the sequence
        found = false;
        i = 0;       
        // Stop when we have read n numbers or when we read a multiple of x
        while (i < n && !found) {
            System.out.print("Nombre enter ? ");
            num = s.nextInt();
            if (num % x == 0) {
                found = true;
            }   
            i++;
        }
        // Check if we found a multiple
        if (found) {
            System.out.printf("\nHi ha un múltiple de %d\n\n", x);
        } else {
            System.out.printf("\nNO hi ha un múltiple de %d\n\n", x);
        }
    }
}
