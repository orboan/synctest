/*
 * Program2.java        1.0 08/01/2012
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Determines whether a character is in a string.
     * 
     * @param s a string
     * @param c a character
     * @return true if c is in s, false otherwise.
     */
    public boolean isCharInString(String s, char c) {
        return s.indexOf(c) != -1 ? true : false;
    }
}
