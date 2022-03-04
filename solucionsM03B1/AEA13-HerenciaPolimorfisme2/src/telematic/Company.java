/*
 * Company.java
 *   
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.HashSet;

public class Company {

    /** Users of the company */
    private HashSet<User> users;

    // Constructor
    public Company() {
        this.users = new HashSet<User>();
    }

    /**
     * Add a user to the company.
     * 
     * @param u a user
     * @return true if the user has been added, false otherwise
     */
    public boolean add(User u) {
        return this.users.add(u);
    }

    /**
     * List all users of the company. For each user the report details user's dni, name, number of connections, total of
     * minutes, amount to be paid by the user, and what kind of offer he/she has.
     */
    public void listUsers() {
        System.out.println("CLIENTS A FACTURAR");
        System.out.println("==================");
        System.out.printf("%-10s%-20s%-3s%8s%10s%7s\n","DNI","NOM","CON","MINS","IMPORT","OFERTA");
        for (User u : users) {
            System.out.printf("%-10s%-20s%3d%8.2f%10.2f", u.getDni(), u.getName(), u.getConnections().size(), 
                              u.totalMinutes(), u.billAmount());
            if (u instanceof UserOffer1) {
                System.out.printf("%5s","1");
            } else if (u instanceof UserOffer2) {
                System.out.printf("%5s","2");
            } else if (u instanceof UserOffer3) {
                System.out.printf("%5s","3");
            }
            System.out.println("");
        }
    }
}
