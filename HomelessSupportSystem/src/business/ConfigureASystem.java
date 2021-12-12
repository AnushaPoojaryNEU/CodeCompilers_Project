/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.enterprise.Enterprise;
import business.enterprise.ShelterMonitoringEnterprise;
import business.individuals.Employee;
import business.individuals.HomelessIndividual;
import business.organization.RoleType;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author anu61
 */
public class ConfigureASystem {
    
    public static void createEmployee(Enterprise ent, String username, 
        String password, String name, String address, String city, 
        String zipCode, int age, RoleType role) {
        Employee emp = new Employee();
        emp.setUsername(username);
        emp.setName(name);
        emp.setAddress(address);
        emp.setCity(city);
        emp.setZipCode(zipCode);
        emp.setAge(age);
        emp.setRole(role);
        
        
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(role.name());
        ua.setIndividual(emp);
        
        ent.getUserAccountDirectory().addUserAccount(ua);
        ent.getOrganizationDirectory().addEmployee(emp);
    }
    
    public static void createHomelessIndividual(Enterprise ent, String username, 
        String password, String name, String address, String city, 
        String zipCode, int age, RoleType role) {
        HomelessIndividual homeless = new HomelessIndividual();
        homeless.setUsername(username);
        homeless.setName(name);
        homeless.setAddress(address);
        homeless.setCity(city);
        homeless.setZipCode(zipCode);
        homeless.setAge(age);
        
        
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(role.name());
        ua.setIndividual(homeless);
        
        ent.getUserAccountDirectory().addUserAccount(ua);
        if (ent instanceof ShelterMonitoringEnterprise) {
            ShelterMonitoringEnterprise sh = (ShelterMonitoringEnterprise) ent;
            sh.addHomelessIndividual(homeless);
        }
    }
    
    public static void createEnterpriseAdmin(Enterprise ent, String username, 
            String password) {
        Employee emp = new Employee();
        emp.setUsername(username);
        emp.setRole(RoleType.ENTERPRISE_ADMIN);
        
        
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(RoleType.ENTERPRISE_ADMIN.name());
        ua.setIndividual(emp);
        
        ent.getUserAccountDirectory().addUserAccount(ua);
        ent.getOrganizationDirectory().addEmployee(emp);
    }
    
    public static EcoSystem configure() {
        
        EcoSystem system = EcoSystem.getInstance();
        
        UserAccount user = new UserAccount();
        user.setUsername("sysadmin"); 
        user.setPassword("sysadmin");
        user.setRole(new SystemAdminRole());
        system.addUserAccount(user, null);
        
        // adding this to help with the development process. otherwise,
        // we would need to enter a lot of data everytime our model changes.
        createEnterpriseAdmin(system.getFoodEnterprise(), "food", "food");
        createEnterpriseAdmin(system.getHospitalEnterprise(), "hosp", "hosp");
        createEnterpriseAdmin(system.getShelterMonitoringEnterprise(), "shel", "shel");
        createEnterpriseAdmin(system.getTrainingCenterEnterprise(), "train", "train");
        
        createEmployee(system.getFoodEnterprise(), "foodman", "foodman", "foodman", 
                "addr 1", "boston", "02120", 27, RoleType.FOOD_SUPPLY_MANAGER);
        createEmployee(system.getFoodEnterprise(), "del", "del", "del", 
                "addr 1", "boston", "02120", 27, RoleType.DELIVERY_MAN);
        createEmployee(system.getFoodEnterprise(), "chef", "chef", "chef", 
                "addr 1", "boston", "02120", 27, RoleType.CHEF);
        
        createEmployee(system.getHospitalEnterprise(), "doc", "doc", "doc", 
                "addr 1", "boston", "02120", 27, RoleType.DOCTOR);
        createEmployee(system.getHospitalEnterprise(), "nurse", "nurse", "nurse", 
                "addr 1", "boston", "02120", 27, RoleType.NURSE);
        createEmployee(system.getHospitalEnterprise(), "rec", "rec", "rec", 
                "addr 1", "boston", "02120", 27, RoleType.RECEPTIONIST);
        
        createEmployee(system.getShelterMonitoringEnterprise(), "maint", "maint", "maint", 
                "addr 1", "boston", "02120", 27, RoleType.MAINTENANCE_CREW_MEMBER);
        createEmployee(system.getShelterMonitoringEnterprise(), "houseman", "houseman", 
                "houseman", "addr 1", "boston", "02120", 27, RoleType.HOUSING_MANAGER);
        createHomelessIndividual(system.getShelterMonitoringEnterprise(), "homel", "homel", "homel", 
                "addr 1", "boston", "02120", 27, RoleType.HOMELESS_INDIVIDUAL);
        
        createEmployee(system.getTrainingCenterEnterprise(), "inst", "inst", "inst", 
                "addr 1", "boston", "02120", 27, RoleType.INSTRUCTOR);
        createEmployee(system.getTrainingCenterEnterprise(), "prog", "prog", 
                "prog", "addr 1", "boston", "02120", 27, RoleType.PROGRAM_MANAGER);
        
        return system;
    }
}
