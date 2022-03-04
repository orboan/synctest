/*
 * AreasTest.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.HashSet;

/**
 * Main program.
 */
public class AreasTest {

    public static void main(String args[]) {
        // Create an office
        Office d1 = new Office("Oficina 1", 40, true, 600);
        d1.setCoffeeMachine(true);
        // Create a lab
        Laboratory a1 = new Laboratory("Laboratori 1", 75, true, 1200, 20);
        a1.setnBunsen(12);
        // Create a computing classroom
        Computing a2 = new Computing("Informàtica 1", 75, true, 6000, 15);
        a2.setNPrinters(3);
        // Create a gym
        Gym a3 = new Gym("Gimnàs", 500, true, 300, 200);
        a3.setNstands(2000);
        // Consumption
        HashSet<Area> areas = new HashSet<Area>();
        areas.add(d1);
        areas.add(a1);
        areas.add(a2);
        areas.add(a3);
        System.out.println("Consum elèctric");
        System.out.println("---------------------------------");
        double consumTotal = 0;
        for (Area e : areas) {
            consumTotal += e.getConsumption();
            System.out.println("L'espai " + e.getCode() + " consumeix: "
                + e.consumptionM2() + " W/m2");
        }
        System.out.println("El consum total de l'institut és de: "
            + consumTotal + " W\n\n");
        // Calculate surface area per student
        HashSet<Classroom> classrooms = new HashSet<Classroom>();
        classrooms.add(a1);
        classrooms.add(a2);
        classrooms.add(a3);
        System.out.println("Superfície per estudiant");
        System.out.println("---------------------------------");
        for (Classroom a : classrooms) {
            System.out.println("L'Aula " + a.getCode() + " disposa de: "
                + a.surfaceAreaStudent() + " m2 per estudiant");
        }
    }

}
