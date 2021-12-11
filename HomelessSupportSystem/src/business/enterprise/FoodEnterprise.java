/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.EcoSystem;
import business.food.Menu;
import business.food.MenuItemOrder;
import business.organization.FoodPrepOrganization;
import business.organization.FoodSupplyOrganization;
import business.organization.Organization;
import business.role.Chef;
import business.role.FoodSupplyManager;
import business.useraccount.UserAccount;
import business.workqueue.FoodRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author geeth
 */
public class FoodEnterprise extends Enterprise {
    
     private Menu menu;
     
     public FoodEnterprise(String name, String address) {
        super(name, address);
        List<Organization> orgLi = organizationDirectory.getOrganizationList();
        orgLi.add(new FoodPrepOrganization("Food Prep"));
        orgLi.add(new FoodSupplyOrganization("Management"));
        
        menu = new Menu();
    }
    
    public Menu getMenu() {
        return menu;
    }
    
    public List<UserAccount> getAllChefs() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof Chef) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
    public List<UserAccount> getAllFoodManagers() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof FoodSupplyManager) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
    public UserAccount getAFoodManager() {
        List<UserAccount> managers = getAllFoodManagers();
        if (managers.size() <= 0) 
            return null;
        return managers.get(new Random().nextInt(managers.size()));
    }
    
    public void placeOrder(EcoSystem system, UserAccount customer, 
            List<MenuItemOrder> cart) {
        if (system == null || customer == null || cart == null)
            return;
        FoodRequest req = new FoodRequest();
        req.setOrder(cart);
        req.setSender(customer);
        req.setReceiver(getAFoodManager());
        req.setMessage(req.genOrderSummary());
        req.setStatus("SUBMITTED");
        system.getWorkRequestManager().addWorkRequest(req);
    } 
    
    
}
