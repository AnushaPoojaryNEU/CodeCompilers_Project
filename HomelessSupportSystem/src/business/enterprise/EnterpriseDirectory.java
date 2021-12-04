/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author geeth
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }
    
    public boolean addEnterprise(Enterprise enterprise) {
        return enterpriseList.add(enterprise);
    }
    
    public void setEnterprise(int idx, Enterprise enterprise) {
        enterpriseList.set(idx, enterprise);
    }
    
    public boolean removeEnterprise(Enterprise enterprise) {
        // works because we have defined Enterprise.equals method
        return enterpriseList.remove(enterprise);
    }
    
    public boolean doesEnterpriseExist(String enterpriseName, EnterpriseType type) {
        // returns true if the enterprise name and type already exists
        // else returns false
        for (Enterprise e: enterpriseList) {
            if (e.getName().equals(enterpriseName) && e.getEnterpriseType().equals(type))
                return true;
        }
        return false;
    }
}
