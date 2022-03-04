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
     * Calculates the final capital of a capitalized bank investment with
     * compound interest.
     * 
     * @param initialCapital an initial capital.
     * @param interest an interest, in %
     * @param years a number of years
     * @return the final capital
     */
    public double calculateFinalCapital(double initialCapital, double interest, int years) {
        double capital, finalCapital;
        int i = 1;
        capital = initialCapital;
        while (i <= years) {
            // Accumulate the previous capital
            capital = capital + capital * interest / 100;
            i++;
        }
        finalCapital = capital;
        return finalCapital;
    }
}
