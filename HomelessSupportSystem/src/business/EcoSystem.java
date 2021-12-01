/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.organization.Organization;
import business.network.Network;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class EcoSystem extends Organization {
    
   private static EcoSystem ecoSystem; 
   private UserAccountDirectory userAccountDirectory;
     
   private List<Network> networkList;
   
   public EcoSystem() {
        super(null);
        this.userAccountDirectory = userAccountDirectory;
        this.networkList = new ArrayList();
   }
   
    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
}
