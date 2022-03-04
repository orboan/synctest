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
     * Write the prime number between two numbers.
     * 
     * @param n1 an integer number.
     * @param n2 an integer number.
     */
    public void writePrimeNumbers(int n1, int n2) {
        int i, pd;
        boolean isDivisor = false;
        // Traverse the numbers between n1 and n2
        for (i = n1; i <= n2; i++) {
            pd = 2;
            isDivisor = false;
            // For each number, check if it is prime
            while (pd <= i - 1 && !isDivisor) {
                isDivisor = i % pd == 0;
                pd++;
            }
            // If it is prime, write it.
            if (!isDivisor) {
                System.out.printf("%d ", i);
            }
        }
    }

}
