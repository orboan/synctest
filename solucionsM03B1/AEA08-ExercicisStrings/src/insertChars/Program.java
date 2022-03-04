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
     * Creates a string inserting chars from two strings.
     * 
     * @param str1 a string
     * @param str2 a string
     * @return the creates string.
     */
    public String insertChars(String str1, String str2) {
        String str3 = "";
        int imaxstr1, imaxstr2, imaxmin, imaxmax, i;
        imaxstr1 = str1.length() - 1;
        imaxstr2 = str2.length() - 1;
        imaxmin = imaxstr1 < imaxstr2 ? imaxstr1 : imaxstr2;
        imaxmax = imaxstr1 < imaxstr2 ? imaxstr2 : imaxstr1;
        // Insert chars from two strings
        for (i = 0; i <= imaxmin; i++) {
            str3 += str1.charAt(i) + str2.charAt(i);
        }
        // if str1 is longer, add the rest of characters of str1
        // if str2 is longer, add the rest of characters of str2
        if (imaxstr1 == imaxmax) {
            str3 += str1.substring(i, imaxstr1 + 1);
        } else {
            str3 += str2.substring(i, imaxstr2 + 1);
        }
        return str3;
    }

}
