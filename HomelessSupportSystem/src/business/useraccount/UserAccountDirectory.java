/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.useraccount;

import business.role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class UserAccountDirectory {
    private List<UserAccount> userAccountList;
    
     public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public List<UserAccount> getUserAccountList() {
        return userAccountList;
    }
     
     public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean addUserAccount(UserAccount ua) {
        if (ua == null)
            return false;
        return userAccountList.add(ua);
    }
    
    public boolean updateUserAccount(String curUsername, UserAccount ua) {
        UserAccount curUa = getUserAccountWithUsername(curUsername);
        if (curUa == null)
            return false;
        int idx = userAccountList.indexOf(curUa);
        if (idx < 0) 
            return false;
        userAccountList.set(idx, ua);
        return true;
    }
    
    public boolean deleteUserAccount(UserAccount userAccount)
    {
       if (userAccount == null)
           return false;
       userAccountList.remove(userAccount);
       return true;
    }
    
    public boolean deleteUserAccount(String username) {
        UserAccount ua = getUserAccountWithUsername(username);
        if (ua == null)
            return false;
        return deleteUserAccount(ua);
    }
    
    
   
    
}
