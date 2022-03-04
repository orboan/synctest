/*
 * Program.java        1.0 05/10/2011
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
     * Verifies if an IP address is valid. 
     * See http://en.wikipedia.org/wiki/IP_address for more information.
     * 
     * @param ip1 the first octet of an IP adress, in decimal notation.
     * @param ip2 the second octet of an IP adress, in decimal notation.
     * @param ip3 the third octet of an IP adress, in decimal notation.
     * @param ip4 the fourth octet of an IP adress, in decimal notation.
     * @return true if the IP adress is valid, false otherwise.
     */
    public boolean isIP(int ip1, int ip2, int ip3, int ip4) {
        boolean isIPadress = ip1 >= 0 && ip1 <= 255 &&
                             ip2 >= 0 && ip2 <= 255 &&
                             ip3 >= 0 && ip3 <= 255 &&
                             ip4 >= 0 && ip4 <= 255;
        return isIPadress;
    }
}
