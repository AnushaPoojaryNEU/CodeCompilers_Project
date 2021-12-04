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
public class TrainingCenterEnterprise extends Enterprise {
    
    public TrainingCenterEnterprise(String name) {
        super(name, EnterpriseType.TRAINING_CENTER);
    }

    @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
