/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

import business.util.Util;
import business.organization.RoleType;

/**
 *
 * @author dwith
 */
public class Employee extends Individual{
    private RoleType role;

    public RoleType getRole() {
        return role;
    }

    public boolean setRole(RoleType role) {
        if (role != null) {
            this.role = role;
            return true;
        }
        return false;
    }
    
    public boolean setRole(String role) {
        if (Util.strValidate(role, null) == false)
            return false;
        try {
            return setRole(RoleType.valueOf(role.toUpperCase().replace(" ", "_")));
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
