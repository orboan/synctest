/*
 * Teacher.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import java.util.HashSet;

/**
 * Simulates a teacher.
 */
public class Teacher extends Person {

    private HashSet<String> subjects;

    public Teacher() {
        super();
        System.out.print("Sóc el constructor de la classe Teacher\n");
    }

    /**
     * Adds a subject to the teacher.
     * 
     * @param subject a subject.
     * @return true if the subject is added, false otherwise.
     */
    public boolean addSubject(String subject) {
        return subjects.add(subject);
    }

    /**
     * Removes a subject from the teacher.
     * @param subject a subject.
     * @return true if the subject is removed, false otherwise.
     */
    public boolean removeSubject(String subject) {
        return subjects.remove(subject);
    }

}
