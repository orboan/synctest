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
     * Calculates how many times a string is in another string.
     * 
     * @param str1 a string
     * @param str2 a string
     * @return the number of times that str2 apperas in str     1
     */
    public int occurrencesOfString(String str1, String str2) {
        String substr;
        int i, ncstr1, ncstr2, imax, n = 0;
        ncstr1 = str1.length();
        ncstr2 = str2.length();
        imax = ncstr1 - ncstr2;
        for (i = 0; i <= imax; i++) {
            substr = str1.substring(i, i + ncstr2);
            n += substr.equals(str2) ? 1 : 0;
        }
        return n;
    }
}
