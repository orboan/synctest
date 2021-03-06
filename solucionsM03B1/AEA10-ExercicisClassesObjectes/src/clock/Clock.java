/*
 * Clock.java 1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

/**
 * Modelizes a clock.
 */

import org.joda.time.DateTime;

/**
 * Descripció de la classe concreta Rellotge. Modela un rellotge digital.
 * 
 * @author Joaquim Laplana, Mònica Ramírez Arceda
 * @version 10/02/2010
 */
public class Clock {

    /**
     * Obté i mostra la data i hora del sistema.
     * 
     * @return La data i hora del sistema en format: dd/MM/aaaa-hh:mm:ss
     */
    private String getDateTime() {
        DateTime now = new DateTime();
        String nowS = JodaDT.formatDDMMYYYYhhmmss(now);
        return nowS;
    }
}
