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
     * Sum the positive numbers within the range [n1,n2].
     * 
     * @param n1 an integer number.
     * @param n2 an integer number. n1<=n2
     * @return the sum.
     */
    public int sumPositives(int n1, int n2) {
        int i = n1, sum = 0;
        while (i <= n2) {
            if (i > 0) {
                // sum = sum + i;
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
