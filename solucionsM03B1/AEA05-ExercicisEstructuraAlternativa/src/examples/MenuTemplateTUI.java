/*
 * Program.java        1.0 02/11/2011
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

public class MenuTemplateTUI {

    /**
     * This is a template for a generical meun.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        int op;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Print a menu with all the options
        System.out.print("\n\nMENÚ\n\n");
        System.out.print("1. Opció 1\n");
        System.out.print("2. Opció 2\n");
        System.out.print("3. Opció 3\n");
        // Ask for an option
        System.out.print("\nOpció ? ");
        op = s.nextInt();
        // TODO: Common actions, if necessary.
        // Depending on the chosen option, we perform the desired operation.        
        switch (op) {
        case 1:
            // TODO: Perform option 1
            break;
        case 2:
            // TODO: Perform option 2
            break;
        case 3:
            // TODO: Perform option 2
            break;
        default:
            // TODO: Perform a default action, if necessary.
            break;
        }
        // TODO: Common actions, if necessary.
    }
}
