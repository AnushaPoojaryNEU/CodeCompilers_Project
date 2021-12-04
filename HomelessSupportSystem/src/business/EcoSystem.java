/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.employee.Employee;
import business.individuals.IndividualDirectory;
import business.organization.Organization;
import business.network.Network;
import business.role.Role;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anu61
 */
public class EcoSystem extends Organization {
    
   private static EcoSystem ecoSystem; 
   private UserAccountDirectory userAccountDirectory;
   private IndividualDirectory individualDirectory;
   private Map<Employee, UserAccount> employeeMap; 
   private List<Network> networkList;
   
   public EcoSystem() {
        super(null);
        this.userAccountDirectory = userAccountDirectory;
        this.networkList = new ArrayList();
        this.individualDirectory = individualDirectory;
   }
   
    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        if (userAccountDirectory == null) {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }

//    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
//        this.userAccountDirectory = userAccountDirectory;
//    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network createNetwork() {
       
      Network network = new Network();
      networkList.add(network);
      return network;
    }

    public IndividualDirectory getIndividualDirectory() {
        return individualDirectory;
    }

    public void setIndividualDirectory(IndividualDirectory individualDirectory) {
        this.individualDirectory = individualDirectory;
    }

    public Map<Employee, UserAccount> getEmployeeMap() {
        if(employeeMap == null)
        {
            employeeMap = new HashMap<>();
        }
        return employeeMap;
    }

    public void setEmployeeMap(Map<Employee, UserAccount> employeeMap) {
        this.employeeMap = employeeMap;
    }
    
    
    
     @Override
    public List<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public boolean checkIfNetworkIsUnique(String name){
        for (Network net : networkList){
            if(net.getName().equalsIgnoreCase(name))
            return false;
        }
        return true;
    }
    
    
}
