/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util;

/**
 *
 * @author geeth
 */
public class Util {
    public static boolean strValidate(String str, String regex) {
        // does basic string validation
        // returns true if validation passes. Else returns false
        if (str == null || str.trim().equals(""))
            return false;
        if (regex != null)
            return str.matches(regex);
        
        return true;
    }
}