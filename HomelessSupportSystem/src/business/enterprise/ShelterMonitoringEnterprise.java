/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.EcoSystem;
import business.individuals.HomelessIndividual;
import business.organization.HouseMaintenanceOrganization;
import business.organization.HousingOrganization;
import business.organization.Organization;
import business.role.HousingManager;
import business.role.MaintenanceCrewMember;
import business.useraccount.UserAccount;
import business.workqueue.MaintenanceRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author geeth
 */
public class ShelterMonitoringEnterprise extends Enterprise {
     private HousingOrganization housingOrganization;
    
    public ShelterMonitoringEnterprise(String name, String address) {
        super(name, address);
        List<Organization> orgLi = organizationDirectory.getOrganizationList();
        housingOrganization = new HousingOrganization("Housing");
        orgLi.add(housingOrganization);
        orgLi.add(new HouseMaintenanceOrganization("House Maintenance"));
    }

    public HousingOrganization getHousingOrganization() {
        return housingOrganization;
    }
    
    public boolean addHomelessIndividual(HomelessIndividual homeless) {
        return housingOrganization.getHomelessDirectory().add(homeless);
    }
    
    public List<UserAccount> getMaintenanceCrew() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof MaintenanceCrewMember) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
    public UserAccount getAMaintenanceCrewMember() {
        List<UserAccount> li = getMaintenanceCrew();
        if (li.size() <= 0) 
            return null;
        return li.get(new Random().nextInt(li.size()));
    }
    
    public List<UserAccount> getAllHomelessIndividuals() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof business.role.HomelessIndividual) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
}
