/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.individuals.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geetha
 */
public class OrganizationDirectory {
    private List<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public boolean setOrganizationList(List<Organization> organizationList) {
        if (organizationList != null) {
            this.organizationList = organizationList;
            return true;
        }
        return false;
    }
    
    public boolean addEmployee(Employee emp) {
        for (Organization org : organizationList) {
            if (org.getSupportedRoles().contains(emp.getRole())) {
                return org.getEdir().add(emp);
            }
        }
        return false;
    }
    
    public boolean removeEmployeeUsingUsername(String username) {
        for (Organization org : organizationList) {
            Employee emp = org.getEdir().findUsingUsername(username);
            if (emp != null) {
                org.getEdir().remove(emp);
                return true;
            }
        }
        return false;
    }
}
