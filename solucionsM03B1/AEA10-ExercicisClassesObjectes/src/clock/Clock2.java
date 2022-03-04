/*
 * Clock2.java 1.1 28/11/2012 
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

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock2 {

    /**
     * Gets system datetime.
     * 
     * @return system datetime in DD/MM/YYYY-hh:mm:ss format
     */
    public String getDateTime() {
        Date now = new Date();
        SimpleDateFormat nowSDT = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
        String nowS = nowSDT.format(now);
        return nowS;
    }
}
