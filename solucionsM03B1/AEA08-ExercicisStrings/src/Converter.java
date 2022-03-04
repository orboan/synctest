/*
 * Converter.java        1.0 16/01/2012
 *
 * Examples of conversion of strings.
 *
 * Copyright 2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Converter {

    /**
     * Converts an integer into a string.
     * 
     * @param n an integer
     * @return the representation of n as a string.
     */
    public String int2String(int n) {
        String s = String.valueOf(n);
        return s;
    }

    /**
     * Converts an float into a string.
     * 
     * @param n a float
     * @return the representation of n as a string.
     */
    public String float2String(float n) {
        String s = String.valueOf(n);
        return s;
    }

    /**
     * Converts a double into a string.
     * 
     * @param n a double
     * @return the representation of n as a string.
     */
    public String double2String(double n) {
        String s = String.valueOf(n);
        return s;
    }

    /**
     * Converts a string into an integer.
     * 
     * @param s a string
     * @return the representation of s as an integer.
     */
    public int string2int(String s) {
        int n = Integer.parseInt(s);        
        return n;
    }

    /**
     * Converts a string into a float.
     * 
     * @param s a string
     * @return the representation of s as a float.
     */
    public float string2float(String s) {
        float n = Float.parseFloat(s);        
        return n;
    }

    /**
     * Converts a string into a double.
     * 
     * @param s a string
     * @return the representation of s as a double.
     */
    public double string2double(String s) {
        double n = Double.parseDouble(s);        
        return n;        
    }

}
