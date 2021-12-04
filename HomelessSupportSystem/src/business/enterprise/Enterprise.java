/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.employee.Employee;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.useraccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author geeth
 */
public abstract class Enterprise extends Organization {

    public EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Map<Employee, UserAccount> employeeToUserAcc;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
        employeeToUserAcc = new HashMap<>();
    }
    
    @Override
    public String toString() {
        return getName();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        if (enterpriseType != null)
            this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        if (organizationDirectory != null)
            this.organizationDirectory = organizationDirectory;
    }

    public Map<Employee, UserAccount> getEmployeeToUserAcc() {
        return employeeToUserAcc;
    }

    public void setEmployeeToUserAcc(Map<Employee, UserAccount> employeeToUserAcc) {
        if (employeeToUserAcc != null)
            this.employeeToUserAcc = employeeToUserAcc;
    }
    
}
