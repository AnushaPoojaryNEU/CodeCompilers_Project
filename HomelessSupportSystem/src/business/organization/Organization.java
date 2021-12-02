/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.List;

/**
 *
 * @author anu61
 */
public abstract class Organization {
    
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private String name;
    private WorkQueue workQueue;
    
     public Organization(String name) {
        this.name = name;
        this.workQueue = workQueue;
        this.userAccountDirectory = userAccountDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
         if(userAccountDirectory == null)
        {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }

//    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
//        this.userAccountDirectory = userAccountDirectory;
//    }

    public EmployeeDirectory getEmployeeDirectory() {
          if(employeeDirectory == null)
        {
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }

//    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
//        this.employeeDirectory = employeeDirectory;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
     
    public abstract List<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return this.getName();
    }
}
