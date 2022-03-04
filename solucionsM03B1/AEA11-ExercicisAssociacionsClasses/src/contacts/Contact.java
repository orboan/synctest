/*
 * Company.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.HashSet;

/**
 * Modelizes a person's contacts.
 */
public class Contact {

    // Fields
    /** Person's DNI. */
    private int dni;
    /** Person's name. */
    private String name;
    /** Person's phone number. */
    private String phone;
    /** Person's contacts. */
    private HashSet<Contact> contacts;

    // Constructors
    /**
     * Constructor by default.
     */
    public Contact() {
        this.dni = 7721039;
        this.name = "Pau Sans";
        this.phone = "934653808";
        this.contacts = new HashSet<Contact>();
    }

    /**
     * Constructor.
     * 
     * @param dni the person's DNI.
     */
    public Contact(int dni) {
        this.dni = dni;
        this.contacts = new HashSet<Contact>();
    }

    /**
     * Constructor.
     * 
     * @param dni the person's DNI
     * @param name the person's name
     * @param phone the person's phone number
     */
    public Contact(int dni, String name, String phone) {
        this.dni = dni;
        this.name = name.trim();
        this.phone = phone.trim();
        this.contacts = new HashSet<Contact>();
    }

    public Contact search(int dni) {
        Contact cf = null;
        for (Contact c : contacts) {
            if (c.getDni() == dni) {
                cf = c;
            }
        }
        return cf;
    }

    /**
     * Add a new contact.
     * 
     * @param contact a contact
     * @return true if the contact is added, false otherwise.
     */
    public boolean add(Contact contact) {
        boolean isAdded = false;
        if (!contact.equals(this)) {
            isAdded = this.contacts.add(contact);
        }
        return isAdded;
    }

    /**
     * Remove a contact.
     * 
     * @param contact a contact
     * @return true if the contact is removed, false otherwise.
     */
    public boolean remove(Contact contact) {
        boolean cond = this.contacts.remove(contact);
        return cond;
    }

    /**
     * Remove all contacts.
     */
    public void removeAll() {
        this.contacts.clear();
    }

    /**
     * List all contacts.
     */
    public void listContacts() {
        System.out.print("Contactes de: " + this.name + "\n");
        System.out.print("==========================================\n");
        for (Contact contact : this.contacts) {
            System.out.printf("%8d  %-15s  %-12s\n",
                              contact.getDni(),
                              contact.getName(),
                              contact.getPhone());
        }
    }

    // equals & hashCode
    // Two persons are equal if both have the same dni.

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (dni != other.dni)
            return false;
        return true;
    }

    // Getter & setters

    public int getDni() {
        return this.dni;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }
}
