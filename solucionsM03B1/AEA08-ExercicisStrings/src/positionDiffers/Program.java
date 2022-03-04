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
     * Calculates the first position where two strings differs.
     * 
     * @param str1 a string.
     * @param str2 a string.
     * @return the position.
     */
    public int positionDiffers(String str1, String str2) {
        int i = 0, imax, imaxstr1, imaxstr2;
        boolean equals = true;
        imaxstr1 = str1.length() - 1;
        imaxstr2 = str2.length() - 1;
        imax = imaxstr1 < imaxstr2 ? imaxstr1 : imaxstr2;
        while (i <= imax && equals) {
            if (str1.charAt(i) != str2.charAt(i)) {
                equals = false;
            }
            i++;
        }
        if (equals && imaxstr1 == imaxstr2) {
            // str1 and str2 are equals
            return -1;
        } else if (equals && imaxstr1 != imaxstr2) {
            // str1 and str2 starts in the same way, but one is longer than the
            // other
            return imax + 1;
        } else {
            // srt1 and str2 differs in some position
            return i - 1;
        }
    }
}
