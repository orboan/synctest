/*
 * Underground.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Simulates an underground.
 */
public class Underground extends Transport {
    
    private double ticketPrice;

    // Constructors

    public Underground(String id, double speed) {
        super(id, speed);
    }

    public Underground(String id, double speed, double ticketPrice) {
        super(id, speed);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double cost(double distance) {
        return this.ticketPrice;
    }
    
    // Getters i setters

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


}
