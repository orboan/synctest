/*
 * Program.java        1.0 13/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Determine if two numbers are divisible each other. Two numbers are
     * divisible each other when one of them divides the other or vice versa.
     * 
     * @param x an integer number.
     * @param y an integer number.
     * @return true if -x- and -y-
     */
    public boolean areDivisible(int x, int y) {
        boolean xDivy = y % x == 0; // x divides y
        boolean yDivx = x % y == 0; // y divides x
        return xDivy || yDivx;
    }

}
