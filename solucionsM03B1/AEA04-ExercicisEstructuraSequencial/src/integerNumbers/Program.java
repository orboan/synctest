/*
 * Program.java        1.0 11/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Verifies if a real number is an integer number. 
     * See http://en.wikipedia.org/wiki/Real_number for more information. 
     * See http://en.wikipedia.org/wiki/Integer for more information.
     * 
     * @param a a real number
     * @return true if -a- is a integer number, false otherwise
     */
    public boolean isInteger(double a) {
        boolean isAnIntegerNumber = a == (int) a; // Number and integer part are equals
        return isAnIntegerNumber;
    }
}
