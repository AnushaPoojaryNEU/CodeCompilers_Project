/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dwith
 */
public class EmployeeDirectory {
    
    public List<Employee> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new ArrayList();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee createEmployee(String Name) {
        Employee emp = new Employee(Name);
        employeeList.add(emp);
        return emp;
    }
    
    public void deleteEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    
}
