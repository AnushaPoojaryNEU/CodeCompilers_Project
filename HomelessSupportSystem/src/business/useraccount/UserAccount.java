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


    
}
