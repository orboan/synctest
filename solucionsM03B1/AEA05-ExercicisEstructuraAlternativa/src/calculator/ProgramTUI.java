/*
 * Program.java        1.0 25/10/2011
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
     * Add two real numbers.
     * 
     * @param a a real number.
     * @param b a real number.
     * @return the sum of -a- and -b-.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtract two real numbers.
     * 
     * @param a a real number.
     * @param b a real number.
     * @return the subtraction from -b- to -a-.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiply two real numbers.
     * 
     * @param a a real number.
     * @param b a real number.
     * @return the multiplication of -a- and -b-.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divide two real numbers.
     * 
     * @param a a real number.
     * @param b a real number.
     * @return the division of -a- by -b-.
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Modelizes the UI as a TUI.
     * 
     * @param args not used.
     */
    public static void main(String args[]) {
        int op;
        double n1 = 0, n2 = 0;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Print a menu with all the options
        System.out.print("\n\nMENÚ\n\n");
        System.out.print("1. Suma\n");
        System.out.print("2. Resta\n");
        System.out.print("3. Multiplicació\n");
        System.out.print("4. Divisió\n");
        // Ask for an option
        System.out.print("\nOpció ? ");
        op = s.nextInt();
        // Ask for 2 real numbers (only if the option is correct)
        if (op >= 1 && op <= 4) {
            System.out.print("\nEntra el primer operand : ");
            n1 = s.nextDouble();
            System.out.print("\nEntra el segon operand : ");
            n2 = s.nextDouble();
        }
        // Depending on the chosen option, we calculate the desired operation
        ProgramTUI p = new ProgramTUI();
        switch (op) {
        case 1:
            double sum = p.add(n1, n2);
            System.out.printf("\nSUMA = %f", sum);
            break;
        case 2:
            double sub = p.subtract(n1, n2);
            System.out.printf("\nRESTA = %f", sub);
            break;
        case 3:
            double prod = p.multiply(n1, n2);
            System.out.printf("\nPRODUCTE = %f", prod);
            break;
        case 4:
            if (n2 != 0) {
                double div = p.divide(n1, n2);
                System.out.printf("\nDIVISIÓ = %f", div);
            } else {
                System.out.printf("\nERROR: No es pot dividir entre 0");
            }
            break;
        default:
            System.out.print("\nEstimat usuari: llegeix bé el menú.");
            break;
        }
        System.out.print("\n\n");
    }
}
