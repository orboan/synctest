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
    public int occurrences(int n, int d) {
        int c, s;
        n = Math.abs(n); // Remove the sign
        s = n % 10; // Get the last digit
        c = 0;
        while (n != 0) {
            if (s == d) {
                c++; // Accumulate one occurrence
            }
            n /= 10; // Remove the last digit
            s = n % 10; // Get the last digit
        }
        return c;
    }
}
