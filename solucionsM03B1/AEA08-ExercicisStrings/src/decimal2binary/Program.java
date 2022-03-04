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
     * Convert a number in decimal base into binary base
     * 
     * @param decimal a number in decimal base
     * @return the number in binary base
     */
    public String decimal2binary(int decimal) {
        int i;
        String binaryInv = "", binary = "";
        while (decimal > 0) {
            binaryInv = decimal % 2 == 0 ? binaryInv + '0' : binaryInv + '1';
            decimal = decimal / 2;
        }
        for (i = 0; i < binaryInv.length(); i++) {
            binary = binaryInv.charAt(i) + binary;
        }
        return binary;
    }
}
