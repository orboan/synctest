/*
 * ShopTest.java               
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Test for shop application.
 */
public class ShopTest {

    /**
     * Main program.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean noError;
        // Create a shop.
        Shop s = new Shop();
        // Create a hard disk.
        HardDisk hdd1 = new HardDisk("dd1", "Disc Dur 1", 40, (float) 1.5, 100);
        // Add it to the shop
        noError = s.addProduct(hdd1);
        if (!noError)
            printError();
        // Create a CPU.
        Cpu cpu1 = new Cpu("cpu1", "Processador 1", 35, (float) 0.05, 2500);
        // Add it to the shop
        noError = s.addProduct(cpu1);
        if (!noError)
            printError();
        // Create a CPU.
        Cpu cpuA = new Cpu("cpuA", "Processador A", 15, (float) 0.02, 1500);
        // Add it to the shop.
        noError = s.addProduct(cpuA);
        if (!noError)
            printError();
        // Remove it from the shop.
        noError = s.removeProduct(cpuA);
        if (!noError)
            printError();
        // Create a hard disk.
        HardDisk hdd2 = new HardDisk("dd2", "Disc Dur 2", 22, 1, 150);
        // Add it to the sjop.
        noError = s.addProduct(hdd2);
        if (!noError)
            printError();
        // Create a hrad disk
        HardDisk hdd3 = new HardDisk("dd3", "Disc Dur 3", 11, 2, 100);
        // Add it to the shop
        noError = s.addProduct(hdd3);
        if (!noError)
            printError();
        // Create a CPU.
        Cpu cpu2 = new Cpu("cpu2", "Processador 2", 10, (float) 0.07, 2800);
        // Add it to the shop
        noError = s.addProduct(cpu2);
        if (!noError)
            printError();
        // List stock
        s.listStock();
    }

    /**
     * Prints an error message.
     */
    public static void printError() {
        System.out.println("S'ha produit un error en afegir/esborrar l'article.");
    }
}
