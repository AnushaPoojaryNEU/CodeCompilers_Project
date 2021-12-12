/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.enterprise.FoodEnterprise;
import business.enterprise.HospitalEnterprise;
import business.enterprise.ShelterMonitoringEnterprise;
import business.enterprise.TrainingCenterEnterprise;
import business.individuals.IndividualDirectory;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkRequestManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anu61
 */
public class EcoSystem  {
    
   private static EcoSystem ecoSystem; 
   private UserAccountDirectory userAccountDirectory;
   private EnterpriseDirectory enterpriseDirectory;
   private FoodEnterprise foodEnterprise;
   private HospitalEnterprise hospitalEnterprise;
   private TrainingCenterEnterprise trainingCenterEnterprise;
   private ShelterMonitoringEnterprise shelterMonitoringEnterprise;
   private WorkRequestManager workRequestManager;
   
   public EcoSystem() {
        enterpriseDirectory = new EnterpriseDirectory();
        foodEnterprise = new FoodEnterprise("Food Enterprise", "1 Huntington St Boston 02120");
        hospitalEnterprise = new HospitalEnterprise("Hospital Enterprise", "10 Huntington St Boston 02120");
        trainingCenterEnterprise = new TrainingCenterEnterprise("Training Center Enterprise", "20 Huntington St Boston 02120");
        shelterMonitoringEnterprise = new ShelterMonitoringEnterprise("Shelter Monitoring Enterprise", "111 Huntington St Boston 02120");
        enterpriseDirectory.addEnterprise(foodEnterprise);
        enterpriseDirectory.addEnterprise(hospitalEnterprise);
        enterpriseDirectory.addEnterprise(trainingCenterEnterprise);
        enterpriseDirectory.addEnterprise(shelterMonitoringEnterprise);
        
        workRequestManager = new WorkRequestManager();
        this.userAccountDirectory = new UserAccountDirectory();
   }
   
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount authenticateUser(String username, String password){
        UserAccount ua = userAccountDirectory.authenticateUser(username, password);
        if (ua != null) 
            return ua;
        ua = enterpriseDirectory.authenticateUser(username, password);
        if (ua != null) 
            return ua;
        return null;
    }
    
    public void addUserAccount(UserAccount ua, Enterprise enterprise) {
        if (ua.getRole() instanceof SystemAdminRole) {
            userAccountDirectory.getUserAccountList().add(ua);
            return;
        }
        enterpriseDirectory.addUserAccount(ua, enterprise);
    }
    
   
    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public FoodEnterprise getFoodEnterprise() {
        return foodEnterprise;
    }

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public TrainingCenterEnterprise getTrainingCenterEnterprise() {
        return trainingCenterEnterprise;
    }

    public ShelterMonitoringEnterprise getShelterMonitoringEnterprise() {
        return shelterMonitoringEnterprise;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public WorkRequestManager getWorkRequestManager() {
        return workRequestManager;
    }
    
    
}
