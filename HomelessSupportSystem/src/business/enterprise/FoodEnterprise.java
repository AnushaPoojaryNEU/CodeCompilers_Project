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
public class FoodEnterprise extends Enterprise {
    
    public FoodEnterprise(String name) {
        super(name, EnterpriseType.FOOD);
    }

    @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
