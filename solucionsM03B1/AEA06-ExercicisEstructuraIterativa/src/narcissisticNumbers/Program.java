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
     * Write the 3-digits narcisistic numbers.
     */
    public void writeNarcissisticNumbers() {
        int i, a, b, c;
        for (i = 100; i <= 999; i++) {
            c = i % 10; // units
            b = i / 10 % 10; // tens
            a = i / 100; // hundreds
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.printf("%d ", i);
            }
        }
    }
}
