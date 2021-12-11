/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.useraccount;

import business.individuals.Individual;
import business.organization.RoleType;
import business.role.*;
import business.util.Util;
import business.workqueue.WorkRequest;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author anu61
 */
public class UserAccount {
  
   private String username;
   private String password;
   private Role role;
   private Individual individual;
 
    public Individual getIndividual() {
        return individual;
    }

    public boolean setIndividual(Individual individual) {
        if (individual != null) {
            this.individual = individual;
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        if (Util.strValidate(username, null)) {
            this.username = username;
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (Util.strValidate(password, null)) {
            this.password = password;
            return true;
        }
        return false;
    }

    public Role getRole() {
        return role;
    }

    public boolean setRole(Role role) {
        if (role != null) {
            this.role = role;
            return true;
        }
        return false;
    }
    
    public boolean setRole(String role) {
        Role r = parseRoleFromString(role);
        if (r == null)
            return false;
        this.role = r;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserAccount other = (UserAccount) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }


    private Role parseRoleFromString(String role) {
        try {
            RoleType rt = RoleType.valueOf(role); 
            if (rt.equals(RoleType.CHEF)) 
                return new Chef();
            else if (rt.equals(RoleType.DELIVERY_MAN))
                return new DeliveryMan();
            else if (rt.equals(RoleType.DOCTOR))
                return new Doctor();
            else if (rt.equals(RoleType.ENTERPRISE_ADMIN))
                return new AdminRole();
            else if (rt.equals(RoleType.FOOD_SUPPLY_MANAGER))
                return new FoodSupplyManager();
            else if (rt.equals(RoleType.HOMELESS_INDIVIDUAL))
                return new HomelessIndividual();
            else if (rt.equals(RoleType.HOUSING_MANAGER))
                return new HousingManager();
            else if (rt.equals(RoleType.INSTRUCTOR))
                return new Instructor();
            else if (rt.equals(RoleType.MAINTENANCE_CREW_MEMBER))
                return new MaintenanceCrewMember();
            else if (rt.equals(RoleType.NURSE))
                return new Nurse();
            else if (rt.equals(RoleType.PROGRAM_MANAGER))
                return new TrainingProgramManager();
            else if (rt.equals(RoleType.RECEPTIONIST))
                return new Receptionist();
            else if (rt.equals(RoleType.SYS_ADMIN)) 
                return new SystemAdminRole();
            else
                return null;
        } catch (Exception ex) {
            return null;
        }
    }
    
}
