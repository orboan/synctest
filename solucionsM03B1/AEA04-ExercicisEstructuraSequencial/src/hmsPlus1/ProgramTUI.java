/*
 * Program.java        1.0 17/10/2011
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
     * Add one second to a time.
     * 
     * @param h a number of hours.
     * @param m a number of minutes.
     * @param s a number of seconds.
     * @return a string with the format hours:minutes:seconds, after having
     *         added a second to the time
     */
    public String hmsPlus1(int h, int m, int s) {
        int t, h1, m1, s1;
        // Calculate the correpsonding number of seconds and add 1 second
        t = h * 3600 + m * 60 + s + 1;
        // Convert into hours, minutes and seconds
        h1 = t / 3600; // Entire hours
        t = t % 3600; // Rest of seconds
        m1 = t / 60; // Entire minutes
        s1 = t % 60; // Rest of seconds
        // Return a string with the hours minutes and seconds
        return h1 + ":" + m1 + ":" + s1;
    }

    /**
     * Modelizes the UI as a TUI.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);
        // Write the title of the program.
        System.out.printf("\n\nUN SEGON MÉS.\n\n");
        // Read the number of hours
        System.out.printf("Hores ? ");
        h = sc.nextInt();
        // Read the number of hours
        System.out.printf("Minuts ? ");
        m = sc.nextInt();
        // Read the number of hours
        System.out.printf("Segons ? ");
        s = sc.nextInt();
        // Calculate days, hours, minutes and seconds
        ProgramTUI p = new ProgramTUI();
        String hms1 = p.hmsPlus1(h, m, s);
        // Write the result
        System.out.println("\n" + hms1);
    }
}
