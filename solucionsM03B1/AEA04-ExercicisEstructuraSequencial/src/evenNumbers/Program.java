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
     * Verifies if an integer number is an even number. See
     * http://simple.wikipedia.org/wiki/Even_number for more information.
     * 
     * @param a an integer number
     * @return true if -a- is an even number, false otherwise (odd number)
     */
    public boolean isEven(int a) {
        boolean isAnEvenNumber = a % 2 == 0; // Even numbers are divisible by 2
        return isAnEvenNumber;
    }
}
