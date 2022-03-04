/*
 * Program.java        1.0 Nov 21, 2012
 *
 * Models the program.
 *
 * Copyright 2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    public void perrin(int p0, int p1, int p2, int n) {
        System.out.print(p0 + " " + p1 + " " + p2 + " ");
        for (int i = 3; i < n; i++) {
            int p3 = p0 + p1;
            System.out.print(p3 + " ");
            p0 = p1;
            p1 = p2;
            p2 = p3;
        }
    }

    public static void main(String[] argv) {
        Program p = new Program();
        p.perrin(3, 0, 2, 100);
    }

}
