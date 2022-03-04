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
     * Write random numbers in a range [n1,n2].
     * 
     * @param n1 an integer number.
     * @param n2 an integer number. n1<=n2
     * @param x the number of random numbers we want to write.
     */
    public void writeRandomNumbers(int n1, int n2, int x) {
        int i = 0;
        double r;
        while (i < x) {
            // x = Math.random();
            // x = (b - a + 1) * x;
            // x = x + a;
            r = (n2 - n1 + 1) * Math.random() + n1;
            System.out.printf("%d ", (int) r);
            i++;
        }
    }

}
