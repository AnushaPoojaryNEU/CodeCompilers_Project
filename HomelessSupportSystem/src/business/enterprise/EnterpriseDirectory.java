/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.useraccount.UserAccount;
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
    
    public UserAccount authenticateUser(String username, String password){
        for (Enterprise e : enterpriseList) {
            UserAccount ua = e.getUserAccountDirectory().authenticateUser(username, password);
            if (ua != null)
                return ua;
        }
        return null;
    }
    
    public Enterprise findEnterpriseOfUserAccount(UserAccount user) {
        for (Enterprise e : enterpriseList) {
            if (e.getUserAccountDirectory().authenticateUser(
                    user.getUsername(), user.getPassword()) != null)
                return e;
        }
        return null;
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
    
    public boolean doesEnterpriseExist(String enterpriseName) {
        // returns true if the enterprise name and type already exists
        // else returns false
        for (Enterprise e: enterpriseList) {
            if (e.getName().equals(enterpriseName))
                return true;
        }
        return false;
    }
    
    public void addUserAccount(UserAccount ua, Enterprise enterprise) {
        int idx = enterpriseList.indexOf(enterprise);
        if (idx < 0) 
            return;
        enterpriseList.get(idx
            ).getUserAccountDirectory(
            ).getUserAccountList(
            ).add(ua);
    }
}
