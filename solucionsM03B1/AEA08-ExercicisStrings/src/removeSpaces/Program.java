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
     * Remove all blank spaces of a string.
     * 
     * @param str a string.
     * @return the string without blank spaces.
     */
    public String removeSpaces(String str) {
        String strWithoutSpaces = "";
        int i;
        char c;
        for (i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            // If the current character is a space, skip it
            if (c != ' ') {
                strWithoutSpaces = strWithoutSpaces + c;
            }
        }
        return strWithoutSpaces;
    }

}
