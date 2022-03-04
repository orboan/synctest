/*
 * Program.java        1.0 25/10/2011
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
     * Determines the textual size of a screw
     * 
     * @param size the size of a screw, in cm
     * @return the textual size of the screw or "Inexistent" if the size is not
     *         valid.
     */
    public String screwSize(double size) {
        String sizeText = new String();
        if (size >= 1 && size < 3) {
            sizeText = "Petit";
        } else if (size >= 3 && size < 5) {
            sizeText = "Mitjà";
        } else if (size >= 5 && size < 6.5) {
            sizeText = "Gran";
        } else if (size >= 6.5 && size < 8.5) {
            sizeText = "Molt gran";
        } else {
            sizeText = "Inexistent";
        }
        return sizeText;
    }
}
