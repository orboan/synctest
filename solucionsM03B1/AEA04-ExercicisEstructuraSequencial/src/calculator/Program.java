/*
 * Program.java        1.0 13/10/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

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
}
