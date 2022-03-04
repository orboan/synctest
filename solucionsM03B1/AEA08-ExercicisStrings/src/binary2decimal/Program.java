/*
 * Program.java        1.0 08/01/2012
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
     * Convert a number in binary base into decimal base
     * 
     * @param binary a number in binary base
     * @return the number in decimal base
     */
    public int binary2decimal(String binary) {
        int decimal = 0, i, digit;
        for (i = 0; i < binary.length(); i++) {
            digit = binary.charAt(i) - '0';
            decimal = (int) (decimal + digit * Math.pow(2, binary.length() - 1 - i));
        }
        return decimal;
    }

}
