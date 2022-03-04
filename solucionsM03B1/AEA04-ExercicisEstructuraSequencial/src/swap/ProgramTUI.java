/*
 * ProgramTUI.java        1.0 17/10/2011
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
     * Swap two variables.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        double a, b, aux;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Write the title of the program
        System.out.print("SWAP\n\n");        
        // Read the data
        System.out.print("Introdueix el primer nombre : ");
        a = s.nextDouble();
        System.out.print("Introdueix el segon nombre : ");
        b = s.nextDouble();
        // Check we have tha right values in a and b
        System.out.print("\nAbans de fer el swap...\n");
        System.out.printf("El valor de a és %f, el valor de b és %f\n\n", a, b);
        // Swap the values of the variables
        aux = a;
        a = b;
        b = aux;
        // Write the new values of a and b
        System.out.println("Després de fer el swap...");
        System.out.printf("El valor de a és %f, el valor de b és %f", a, b);
    }
}
