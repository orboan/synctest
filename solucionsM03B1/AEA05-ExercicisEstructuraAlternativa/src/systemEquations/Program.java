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
     * Determines whether a linear system has a solution.
     * 
     * @param a the first parameter of the first equation.
     * @param b the second parameter of the first equation.
     * @param c the third parameter of the first equation.
     * @param d the first parameter of the second equation.
     * @param e the second parameter of the second equation.
     * @param f the third parameter of the second equation.
     * @return true if the system has a solution, false otherwise.
     */
    public boolean hasSolution(double a, double b, double c, double d, double e, double f) {
        double ds = a * e - d * b;        
        return ds != 0;
    }

    /**
     * Calculates the solution of a linear system.
     * 
     * @param a the first parameter of the first equation.
     * @param b the second parameter of the first equation.
     * @param c the third parameter of the first equation.
     * @param d the first parameter of the second equation.
     * @param e the second parameter of the second equation.
     * @param f the third parameter of the second equation.
     * @return "Sistema incompatible" if there is no solution,
     *         "x = solx, y = soly", where solx is the value of x and soly the
     *         value of y, if there is a solution.
     */
    public String calculateSolution(double a, double b, double c, double d, double e, double f) {
        double ds, dx, dy, x, y;
        String solucio = "";
        if (hasSolution(a, b, c, d, e, f)) {
            ds = a * e - d * b;
            dx = c * e - b * f;
            dy = a * f - c * d;
            x = dx / ds;
            y = dy / ds;
            solucio = "x = " + x + ", y = " + y;
        } else {
            solucio = "Sistema incompatible";
        }
        return solucio;
    }
}
