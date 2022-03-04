/*
 * AquariumTest.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.HashSet;

/**
 * Main program
 */
public class AquariumTest {

    public static void main(String[] args) {
        // Create two plants
        Plant pl1 = new Plant("Alternanthera cardinalis", "Alternanthera",
            'M', 20, 10, 7, 6);
        pl1.setType('S');
        Plant pl2 = new Plant("Micranthemum umbrosum", "Micranthemum", 'L',
            25, 15, 7.5, 6);
        pl2.setType('S');
        // Create two fishes
        Fish pe1 = new Fish("Aphyosemion gardineri", "Cyprinodontidae", 'M',
            24, 22, 7, 5.5);
        pe1.setOrigin("Nigèria");
        pe1.setDiet('O');
        pe1.setLength(6);
        Fish pe2 = new Fish("Nothobranchius rachovii", "Notobranchius", 'H',
            24, 20, 6.5, 5);
        pe2.setOrigin("Moçambic");
        pe2.setDiet('O');
        pe2.setLength(5);
        // Create an aquarium
        HashSet<Organism> aquari = new HashSet<Organism>();
        aquari.add(pl1);
        aquari.add(pl2);
        aquari.add(pe1);
        aquari.add(pe2);
        // Print aquarium information
        System.out.print("AQUARI\n");
        System.out.print("======");
        for (Organism o : aquari) {
            organismData(o);
            if (o instanceof Plant) {
                Plant p = (Plant) o;
                System.out.print("\nTIPUS: " + p.plantType());
            } else if (o instanceof Fish) {
                Fish p = (Fish) o;
                System.out.print("\nPROCEDÈNCIA: " + p.getOrigin());
                System.out.print("\nDIETA: " + p.tipusDieta());
                System.out.print("\nLONGITUD: " + p.getLength());
            }
        }
    }

    /**
     * Prints name, family, PH, temperature and light type of an organism
     * Escriu per pantalla el nom, la família, el ph, la temperatura i la llum
     * d'un organisme.
     * 
     * @param o L'organisme
     */
    public static void organismData(Organism o) {
        System.out.print("\n\nNOM: " + o.getName());
        System.out.print("\nFAMÍLIA: " + o.getFamily());
        System.out.print("\nPH: " + o.acidity());
        System.out.print("\nTEMPERATURA: " + o.temperature());
        System.out.print("\nLLUM: " + o.lightType());
    }
}
