/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author anu61
 */
public class ConfigureASystem {
     public static EcoSystem configure() {
        
        EcoSystem system = EcoSystem.getInstance();
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole(), Role.RoleType.SystemAdmin);
        
        return system;
    }
}
