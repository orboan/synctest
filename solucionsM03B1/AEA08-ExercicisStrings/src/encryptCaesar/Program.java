package allVowels;

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
     * Encrypts a string with the Caesar vypher.
     * 
     * @param str a string
     * @param shift a shift parameter, an integer number between 1 and 9
     * @return the encrypted string.
     */
    public String encryptCaesar(String str, int shift) {
        String strDes = "";
        int charCode, shiftCharCode, i;
        char c;
        str = str.toUpperCase();
        // Traverse the string
        for (i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            charCode = c;
            // Check if the character is a letter we can encrypt
            if (c >= 'A' && c <= 'Z') {
                // Encrypt the letter
                shiftCharCode = charCode + shift;
                if ('Z' < shiftCharCode) {
                    shiftCharCode = shiftCharCode % 'Z' + 'A' - 1;
                }
            } else {
                shiftCharCode = charCode;
            }
            strDes += (char) shiftCharCode;
        }
        return strDes;
    }
}
