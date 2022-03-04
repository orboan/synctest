/*
 * Program.java        1.0 08/11/2011
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
     * Calculates the max divisor of a number, excluding itself.
     * 
     * @param n an integer number.
     * @return the max divisor.
     */
    public int maxDivisor(int n) {
        int divm;
        boolean found = false;
        // divm is the cadidate to be the max divisor
        divm = n;
        while (!found) {
            divm--;
            // Check if div divides n
            if (n % divm == 0) {
                found = true;
            }
        }
        return divm;
    }

}
