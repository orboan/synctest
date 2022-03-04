/*
 * Program.java        1.0 05/10/2011
 *
 * Modelizes the program.
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
     * Adds two integer numbers.
     * 
     * @param a an integer number to be added.
     * @param b an intger number to be added.
     * @return the sum of a and b.
     */
    public int add(int a, int b) {
        // Variables declaration
        int c;
        // Add the input data
        c = a + b;
        // Returns the output data
        return c;
    }

    /**
     * Modelizes the UI as a TUI.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Print the title of the program
        System.out.print("\nSUMA DE DOS NOMBRES.\n\n");
        // Read the input data
        System.out.print("Primer nombre enter? ");
        n1 = s.nextInt();
        System.out.print("Segon nombre enter? ");
        n2 = s.nextInt();
        // Process the data
        ProgramTUI p = new ProgramTUI();
        int suma = p.add(n1, n2);
        // Write the result
        System.out.printf("\n%d + %d = %d\n", n1, n2, suma);
    }
}
