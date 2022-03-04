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
     * Print Extended ASCII Table
     */
    public void writeASCII() {
        int i = 0;
        while (i < 256) {
            System.out.printf("%d -> %c\n", i, i);
            i++;
        }
    }

}
