/*
 * InternationalStudent.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulats a international student.
 */
public class InternationalStudent extends Student {

    private String country;

    public InternationalStudent() {
        super();
        System.out.print("Sóc el constructor de la classe InternationalStudent\n");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
