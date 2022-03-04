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

public class Program {

    /**
     * Prints statistics of the hours of study.
     * 
     * @param hoursStudy array 2D with the hours of study.
     */
    public void statistics(int[][] hoursStudy) {
        String[] subjects = { "SO", "PROG", "BBDD", "XML", "FOL", "EMP", "total" };
        String[] months = { "gener", "febrer", "març", "abril", "maig", "juny", "juliol", 
                "agost", "setembre", "octubre", "novembre", "desembre", "total" };
        int i, j, nMonths = months.length - 1, nSubjects = subjects.length - 1;
        // Create an array with the same content as hoursStudy plus the total
        // column and the total row
        int[][] hoursStudyWithTotals = new int[nSubjects + 1][nMonths + 1];
        for (i = 0; i < nSubjects; i++) {
            for (j = 0; j < nMonths; j++) {
                hoursStudyWithTotals[i][j] = hoursStudy[i][j];
            }
        }
        // Fill totals of subjects
        for (i = 0; i < nSubjects; i++) {
            for (j = 0; j < nMonths; j++) {
                hoursStudyWithTotals[i][nMonths] = hoursStudyWithTotals[i][nMonths] + hoursStudyWithTotals[i][j];
            }
        }
        // Fill totals of months
        for (j = 0; j < nMonths + 1; j++) {
            for (i = 0; i < nSubjects; i++) {
                hoursStudyWithTotals[nSubjects][j] = hoursStudyWithTotals[nSubjects][j] + hoursStudyWithTotals[i][j];
            }
        }
        // Print the final table
        // First row
        System.out.printf("%5s", "");
        for (i = 0; i < nMonths + 1; i++) {
            System.out.printf("%10s", months[i]);
        }
        // The rest of rows
        for (i = 0; i < nSubjects + 1; i++) {
            System.out.printf("\n%5s", subjects[i]);
            for (j = 0; j < nMonths + 1; j++) {
                System.out.printf("%10d", hoursStudyWithTotals[i][j]);
            }
        }
        System.out.printf("\n\n");
    }
}
