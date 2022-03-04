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
     * Convert a number of seconds into days, hours, minutes and seconds.
     * 
     * @param s a number of seconds.
     * @return a string with the format
     *         "s segons seran d dies, h hores, m minuts i rs segons."
     */
    public String s2dhms(long s) {
        long d, h, rs, m;
        d = s / (24 * 3600); // Entire days
        rs = s % (24 * 3600); // Rest of seconds
        h = rs / 3600; // Entire hours
        rs = rs % 3600; // Rest of seconds
        m = rs / 60; // Entire minutes
        rs = rs % 60; // Rest of seconds
        return s + " segons seran " + d + " dies, " + h + " hores, " + m + " minuts i " + rs + " segons.";
    }

    /**
     * Modelizes the UI as a TUI.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        long s;
        Scanner sc = new Scanner(System.in);
        // Write the title of the program.
        System.out.printf("\n\nCONVERTIR SEGONS A DIES, HORES, MINUTS I SEGONS\n\n");
        // Read the number of seconds
        System.out.printf("Segons ? ");
        s = sc.nextLong();
        // Calculate days, hours, minutes and seconds
        ProgramTUI p = new ProgramTUI();
        String dhms = p.s2dhms(s);
        // Write the result
        System.out.println("\n" + dhms);
    }
}
