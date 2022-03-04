/*
 * Program2TUI.java        1.0 17/10/2011
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

public class Program2TUI {

    /**
     * Says hello to the user. This program has a terminal user interface.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        // The name of the user
        String name;
        // A scanner to read from the keyboard
        Scanner s = new Scanner(System.in);
        //s.useDelimiter("\n");
        // Print the question to the user
        System.out.printf("Com et dius ? ");
        // Read the name of the user with the scanner s
        name = s.next();
        // Say hello to the user
        System.out.println("Hola " + name + "!!!");        
    }

}
