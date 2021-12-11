/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.individuals.Employee;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.organization.RoleType;
import business.useraccount.UserAccountDirectory;
import business.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author geeth
 */
public abstract class Enterprise {

    private String name, address;
    protected OrganizationDirectory organizationDirectory;
    protected UserAccountDirectory userAccountDirectory;

    public Enterprise(String name, String address) {
        this.userAccountDirectory = new UserAccountDirectory();
        this.name = name;
        this.address = address;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public List<Employee> getAllEmployees() {
        List<Employee> li = new ArrayList<>();
        for (Organization org: organizationDirectory.getOrganizationList()) {
            li.addAll(org.getEdir().getList());
        }
        return li;
    }
    
    public List<RoleType> getSupportedRoles() {
        List<RoleType> li = new ArrayList<>();
        for (Organization org: organizationDirectory.getOrganizationList()) {
            li.addAll(org.getSupportedRoles());
        }
        return li;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (Util.strValidate(name, null)) {
            this.name = name;
            return true;
        }
        return false;
    }
    
    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (Util.strValidate(address, null)) {
            this.address = address;
            return true;
        }
        return false;
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
        final Enterprise other = (Enterprise) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

}
