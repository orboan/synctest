/*
 * Program.java        1.0 08/01/2012
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
     * Simulates an answerphone.
     * 
     * @param name the owner's name of the answerphone
     * @param sex the owner's sex of the answerphone
     * @param tel the telephone number
     * @param city the city where the owner of the answerphone is on holiday
     * @return the string that the answerphone will say to the callers
     */
    public String answerPhone(String name, char sex, String tel, String city) {
        String article = sex == 'D' ? "la" : "el";
        return "Hola! Sóc " + article + " " + name + ". Has trucat al " + tel + 
               " i ara no estic a casa perquè estic a " + city + " de vacances!!!";
    }

}
