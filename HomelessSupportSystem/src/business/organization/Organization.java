/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.individuals.Employee;
import business.individuals.EmployeeDirectory;
import business.util.Util;
import java.util.List;

/**
 *
 * @author anu61
 */
public abstract class Organization {
    private String name;
    private EmployeeDirectory edir;

    public Organization(String name) {
        edir = new EmployeeDirectory();
        this.name = name;
    }

    public EmployeeDirectory getEdir() {
        return edir;
    }
    
        public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(Util.strValidate(name, null)) {
            this.name = name;
            return true;
        }
        return false;
    }
    
}
