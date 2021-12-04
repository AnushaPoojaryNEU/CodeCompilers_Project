/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author anu61
 */
public class ShelterProviderOrganization extends Organization{
    
     public ShelterProviderOrganization() {
        super(Type.ShelterProviderOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterProviderRole());
        return roles;
    }
    
}
