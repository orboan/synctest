/*
 * Program.java        1.0 30/11/2011
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

    public int sumFirstElements(int[] a, int x) {
        int i, sum;
        sum = 0;
        for (i = 0; i < x; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
