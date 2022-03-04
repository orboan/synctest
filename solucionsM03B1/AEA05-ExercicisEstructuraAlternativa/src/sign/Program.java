/*
 * Program.java        1.0 24/10/2011
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
     * Finds out the sign of a real number.
     * 
     * @param n a real number.
     * @return "negatiu" if the number is negative, "positiu" if the number is
     *         positive or "zero" if the number is 0.
     */
    public String sign(double n) {
        String s = new String(); // The sign of the number
        if (n < 0) {
            // If -n- is negative...
            s = "negatiu";
        } else if (n > 0) {
            // If -n- is positive...
            s = "positiu";
        } else {
            // If -n- is zero...
            s = "zero";
        }
        return s;
    }
}
