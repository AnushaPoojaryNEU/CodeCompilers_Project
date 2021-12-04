/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.List;

/**
 *
 * @author geeth
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HOSPITAL);
    }

    @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
