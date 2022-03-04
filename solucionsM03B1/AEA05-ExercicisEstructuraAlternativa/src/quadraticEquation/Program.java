/*
 * Program.java        1.0 24/10/2011
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
     * Calculates how many real solutions has a quadratic equation.
     * 
     * @param a the first parameter of the equation not zero.
     * @param b the second parameter of the equation.
     * @param c the third parameter of the equation.
     * @return the number of real solutions of the equation.
     */
    public int numberOfSolutions(double x, double y, double z) {
        double discriminant;
        int numberOfSolutions;
        discriminant = y * y - 4 * x * z;
        if (discriminant < 0) {
            numberOfSolutions = 0;
        } else if (discriminant == 0) {
            numberOfSolutions = 1;
        } else {
            numberOfSolutions = 2;
        }
        return numberOfSolutions;
    }

    /**
     * Calculates the solutions of a quadratic equation.
     * 
     * @param a the first parameter of the equation not zero.
     * @param b the second parameter of the equation.
     * @param c the third parameter of the equation.
     * @return "No té solució" if there are no solutions, "x = sol1", where sol1
     *         is the solution, if there is only one solution and
     *         "x1 = sol1, x2 = sol2", where sol1 and sol2 are the solutions, if
     *         there are two solutions.
     */
    public String calculateSolutions(double a, double b, double c) {
        double x1, x2;
        double discriminant;
        int nof; // Number of solutions
        String solucions = new String();
        nof = numberOfSolutions(a, b, c); // Calls another method
        if (nof == 0) {
            solucions = "No té solució.";
        } else if (nof == 1) {
            x1 = -b / (2 * a);
            solucions = "x = " + x1;
        } else {
            discriminant = b * b - 4 * a * c;
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            solucions = "x1 = " + x1 + ", x2 = " + x2;
        }
        return solucions;
    }
}
