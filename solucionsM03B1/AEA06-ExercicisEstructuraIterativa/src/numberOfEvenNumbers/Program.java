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
     * Calculates how many even numbers there are between two numbers.
     * 
     * @param n1 an integer number.
     * @param n2 an integer number. n1 <= n2.
     * @return the number of even numbers in [n1,n2]
     */
    public int numberOfEvenNumbers(int n1, int n2) {
        int i = n1; // index to iterate [n1, n2]
        int nEvenNumbers = 0; // counter to count even numbers
        while (i <= n2) {
            if (i % 2 == 0) {
                nEvenNumbers = nEvenNumbers + 1;
                // nEvenNumbers++;
            }
            i++;
        }
        return nEvenNumbers;
    }
}
