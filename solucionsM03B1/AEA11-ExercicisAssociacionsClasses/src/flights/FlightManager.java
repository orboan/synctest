/*
 * FlightManager.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;

/**
 * TUI for managing flights.
 */
public class FlightManager {

    // Fields
    /** Scheduled flights. */
    private ArrayList<Flight> flights;

    // Constructors
    /**
     * Constructor per defecte
     */
    public FlightManager() {
        flights = new ArrayList<Flight>();
        this.planFlights();
    }

    /**
     * Plans some flights from Barcelona airpot to other airports.
     */
    private void planFlights() {
        Flight flight = new Flight(); // Barcelona - Berlin-Tegel flight
        flights.add(flight);

        flight = new Flight("AK-100-X", "12/03/2010-07:30");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("PEK", "Pekin", "40 3 N", "116 35 W", 8));
        flight.setPlane(new Plane("RY-220", "Boeing-717", 820));
        flights.add(flight);

        flight = new Flight("PP-121-U", "12/03/2010-08:22");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("JFK", "New York", "40 38 N", "73 47 W", -5));
        flight.setPlane(new Plane("TP-620", "DC-9", 710));
        flights.add(flight);

        flight = new Flight("KB-341-D", "12/03/2010-08:37");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("MEX", "Mèxic", "19 26 N", "99 4 W", -6));
        flight.setPlane(new Plane("RT-223", "Boeing-717", 820));
        flights.add(flight);

        flight = new Flight("AZ-141-B", "12/03/2010-09:22");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("SVO", "Moscou", "55 58 N", "37 24 E", 4));
        flight.setPlane(new Plane("AS-123", "MD-80", 850));
        flights.add(flight);

        flight = new Flight("ES-301-Q", "12/03/2010-10:10");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("FCO", "Roma", "41 48 N", "12 15 W", 1));
        flight.setPlane(new Plane("RT-223", "Boeing-717", 820));
        flights.add(flight);

        flight = new Flight("JX-301-V", "12/03/2010-12:15");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("IKA", "Teheran", "35 24 N", "51 9 E", 3.5));
        flight.setPlane(new Plane("HS-21", "MD-80", 850));
        flights.add(flight);

        flight = new Flight("XX-361-F", "12/03/2010-22:23");
        flight.setDepartureAirport(new Airport());
        flight.setArrivalAirport(new Airport("GIC", "Rio de Janeiro", "22 48 S", "43 14 W", -3));
        flight.setPlane(new Plane("WW-813", "DC-10", 750));
        flights.add(flight);
    }

    /**
     * Mostra un report d'uns vols des de l'aeroport de Barcelona.
     */
    public void listFlights() {
        System.out.print("\n\nAeroport El Prat de LLobregat - Barcelona (BCN)\n");
        System.out.print("\nSortides/Departures\n\n");
        System.out.printf("%-10s %-22s %-22s %-8s %-18s %-18s %-10s\n",
                       "Vol",
                       "De",
                       "A",
                       "Durada",
                       "Sortida",
                       "Arribada",
                       "Avió");
        System.out.print("====================================================================================================================\n");
        for (Flight f : flights) {
            System.out.printf("%-10s %-22s %-22s %-8s %-18s %-18s %-10s\n", f.getCode(), f
                    .getDepartureAirport().getName()
                    + " ("
                    + f.getDepartureAirport().getCode()
                    + ")", f.getArrivalAirport().getName() + " (" + f.getArrivalAirport().getCode()
                    + ")", f.duration(), f.getDepartureDT(), f.arrivalDateTime(), f.getPlane()
                    .getModel());
        }
        System.out.print("====================================================================================================================\n");
        System.out.print("Nombre de vols: ");
        System.out.printf("%4d\n\n", flights.size());
    }

    /**
     * Per executar l'aplicació des del SO.
     * 
     * @param args No emprat
     */
    public static void main(String[] args) {
        FlightManager fm = new FlightManager();
        fm.listFlights();
    }
}
