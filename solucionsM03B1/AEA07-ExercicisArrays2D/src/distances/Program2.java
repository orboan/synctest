/*
 * Program.java        1.0 13/12/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Calculates the distance between two cities.
     * 
     * @param origin a city ("Barcelona", "Girona", "Lleida", "Tarragona",
     *        "Saragossa" or "Terol")
     * @param destination a city ("Barcelona", "Girona", "Lleida", "Tarragona",
     *        "Saragossa" or "Terol")
     * @return the distance between origin and destination
     */
    public int distance(String origin, String destination) {
        // hardcoded arrays
        int[][] d = { { 0, 100, 156,  98, 296, 409 }, 
                      { 0,   0, 256, 198, 396, 509 }, 
                      { 0,   0,   0,  91, 140, 319 },  
                      { 0,   0,   0,   0, 231, 311 },  
                      { 0,   0,   0,   0,   0, 181 }};
        int iOrigin = 0, iDestination = 0, dist = -1;
        boolean found;
        // Search the index of the origin city
        iOrigin = indexOfCity(origin);
        // Search the index of the destination city
        iDestination = indexOfCity(destination);
        if (iOrigin == iDestination) {
            // If the origin and the destination are the same, the distance is 0
            dist = 0;
        } else if (iOrigin < iDestination) {
            // If the row index is less than the column index, get the element
            // of the matrix
            dist = d[iOrigin][iDestination];
        } else {
            // If the row index is greater than the column index, get the
            // symmetric element of the matrix
            dist = d[iDestination][iOrigin];
        }
        return dist;
    }

    /**
     * Get the index of a city in the array { "Barcelona", "Girona", "Lleida",
     * "Tarragona", "Saragossa", "Terol" }
     * 
     * @param city a city
     * @return the index of the city
     */
    public int indexOfCity(String city) {
        String[] cities = { "Barcelona", "Girona", "Lleida", "Tarragona", "Saragossa", "Terol" };
        int nCities = cities.length, index = -1;
        boolean found = false;
        // Search the index of the city
        int i = 0;
        while (i < nCities && !found) {
            if (city.equals(cities[i])) {
                found = true;
                index = i;
            }
            i++;
        }
        return index;
    }
}
