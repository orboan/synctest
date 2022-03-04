/*
 * OutputExamples.java        1.0 11/10/2011
 *
 * Modelizes the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class OutputExamples {

    /**
     * Writes in the terminal some examples using print, println and printf.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        System.out.print("\n\nEXEMPLES D'ÚS DE print, println I printf\n\n");
        System.out.printf("Nombre enter: %d\n", 3);
        System.out.printf("Nombre amb decimals: %f\n", 3.75);
        System.out.printf("Caràcter: %c\n", 'j');
        System.out.printf("Nombre amb 15 espais: %+15f\n", 15.6987);
        System.out.printf("Nombre amb 15 espais omplint amb 0: %015f\n", 15.6987);
        System.out.printf("Nombre amb 2 decimals: %.2f\n", 15.698754);
        System.out.printf("Mombre amb 15 espais i 2 decimals: %15.2f\n", 15.6987);
        System.out.printf("Nombre amb 15 espais i 2 decimals omplint amb 0: %015.2f\n", 15.6987);
        System.out.printf("%30s Més text.\n", "Alineació a la dreta.");
        System.out.printf("%-30s Més text.\n", "Alineació a l'esquerra.");

        System.out.printf("\n\nEXEMPLE DE LLISTAT\n\n");
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-30s|%-10s|%-10s|\n", "ARTICLE", "PREU", "DESCOMPTE");
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-30s|%10.2f|%9.1f%%|\n", "Mel", 7.4, 3.);
        System.out.printf("|%-30s|%10.2f|%9.1f%%|\n", "Ous", 3., 4.12);
        System.out.printf("|%-30s|%10.2f|%9.1f%%|\n", "Poma", 2.2, 2.589);
        System.out.printf("|%-30s|%10.2f|%9.1f%%|\n", "Préssec", 2.199, 0.);
        System.out.printf("------------------------------------------------------\n\n");
    }
}
