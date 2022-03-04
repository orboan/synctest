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
     * Reverses a string.
     * 
     * @param str a string
     * @return str reversed.
     */
    public String reverse(String str) {
        String strRev = "";
        int i;
        /*
         * for(i=Str.size(str)-1;i>=0;i--){ 
         *    strInv = strInv +Str.getChar(str,i); 
         * }
         */
        for (i = 0; i < str.length(); i++) {
            // Put the character before the new reversed string
            strRev = str.charAt(i) + strRev;
        }
        return strRev;
    }

}
