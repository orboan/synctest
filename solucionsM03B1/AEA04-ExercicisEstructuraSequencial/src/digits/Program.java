/*
 * Program.java        1.0 11/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * Get the digit in a concrete position of a number.
     * 
     * @param n an integer number.
     * @param p an integer numbre between 1 to the number of digits of n.
     * @return the digit of n in the position p.
     */
    public int digitPosition(int n, int p) {
        // Digit of n in position p
        int x;
        // Remove right digits from position p.
        x = n / (int) Math.pow(10, p - 1);        
        // Get the last digit.
        x = x % 10;        
        return x;
    }
}
