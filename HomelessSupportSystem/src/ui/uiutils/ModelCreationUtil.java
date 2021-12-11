/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.uiutils;

import business.individuals.Employee;
import business.individuals.HomelessIndividual;
import business.individuals.Individual;
import business.organization.RoleType;
import business.training.Course;
import business.useraccount.UserAccount;
import business.workqueue.MaintenanceRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.sheltermonitoring.RequestMaintenanceJPanel;
/**
 *
 * @author dwith
 */
public class ModelCreationUtil {
    public static UserAccount parseUserAccount(JPanel panel, String username, String password,
            String role) {
        UserAccount ua = new UserAccount();
        if (ua.setUsername(username) == false) {
            JOptionPane.showMessageDialog(panel, "Username is not in the expected format.");
            return null;
        }
        if (ua.setPassword(password) == false) {
            JOptionPane.showMessageDialog(panel, "Password is not in the expected format.");
            return null;
        }
        role = role.toUpperCase().replace(" ", "_"); 
        if (ua.setRole(role) == false) {
            JOptionPane.showMessageDialog(panel, "Role is not supported.");
            return null;
        }
        return ua;
    }
    
    public static UserAccount parseEnterpriseAdmin(JPanel panel, String username, String password,
            String role) {
        UserAccount ua = parseUserAccount(panel, username, password, role);
        if (ua == null)
            return null;
        Employee emp = new Employee();
        emp.setRole(RoleType.ENTERPRISE_ADMIN);
        emp.setUsername(username);
        ua.setIndividual(emp);
        return ua;
    }
    
    public static Individual parseIndividual(JPanel panel, String username, 
            String name, String address, String city, String zipcode, 
            String age) {
        
        Individual ind = new Individual();
        
        if (ind.setUsername(username) == false){
            JOptionPane.showMessageDialog(panel, "Username is not in the expected format.");
            return null;
        }
        
        if (ind.setName(name) == false) {
            JOptionPane.showMessageDialog(panel, "Name is not in the expected format.");
            return null;
        }
        
        if (ind.setAddress(address) == false) {
            JOptionPane.showMessageDialog(panel, "Address is not in the expected format.");
            return null;
        }
        
        if (ind.setCity(city) == false) {
            JOptionPane.showMessageDialog(panel, "City is not in the expected format.");
            return null;
        }
        
        if (ind.setZipCode(zipcode) == false) {
            JOptionPane.showMessageDialog(panel, "Zipcode is not in the expected format.");
            return null;
        }
        
        if (ind.setAge(age) == false) {
            JOptionPane.showMessageDialog(panel, "Age is not in the expected format.");
            return null;
        }
        return ind;
    }

    public static UserAccount parseEmployee(JPanel panel, String username, String password, 
            String name, String address, String city, String zipcode, 
            String age, String role) {
        UserAccount ua = parseUserAccount(panel, username, password, role);
        if (ua == null)
            return null;
        
        Individual ind = parseIndividual(panel, username,
            name, address, city, zipcode, age);
        
        if (ind == null)
            return null;
        
        Employee emp = new Employee();
        emp.setUsername(ua.getUsername()); 
        emp.setName(name);
        emp.setAddress(address);
        emp.setCity(city);
        emp.setZipCode(zipcode);
        emp.setAge(age);
        
        if (emp.setRole(role) == false) {
            JOptionPane.showMessageDialog(panel, "Role is not in the expected format.");
            return null;
        }
        
        ua.setIndividual(emp);
        return ua;
    }
    
    public static UserAccount parseHomelessIndividualAccount(JPanel panel, String username, String password, 
            String name, String address, String city, String zipcode, 
            String age, String role) {
        UserAccount ua = parseUserAccount(panel, username, password, role);
        if (ua == null)
            return null;
        
        Individual ind = parseIndividual(panel, username,
            name, address, city, zipcode, age);
        
        if (ind == null)
            return null;
        
        HomelessIndividual hmInd = new HomelessIndividual();
        hmInd.setUsername(ua.getUsername()); 
        hmInd.setName(name);
        hmInd.setAddress(address);
        hmInd.setCity(city);
        hmInd.setZipCode(zipcode);
        hmInd.setAge(age);
        
        ua.setIndividual(hmInd);
        return ua;
    }

    public static MaintenanceRequest parseMaintenanceRequest(JPanel panel, 
            UserAccount sender, String issue, String comments, UserAccount to) {
        MaintenanceRequest req = new MaintenanceRequest();
        if (req.setIssue(issue) == false) {
            JOptionPane.showMessageDialog(panel, "Issue is not in the expected format.");
            return null;
        }
        if (req.setComments(comments) == false) {
            JOptionPane.showMessageDialog(panel, "Comments is not in the expected format.");
            return null;
        }
        req.setSender(sender);
        req.setReceiver(to);
        req.setMessage(issue);
        req.setStatus("SUBMITTED");
        return req;
    }

    public static Course parseCourse(JPanel panel, String name, String description, String prerequisites) {
        Course c = new Course();
        
        if (c.setCourseName(name) == false) {
            JOptionPane.showMessageDialog(panel, "Course name is not in the expected format.");
            return null;
        }
        
        if (c.setDescription(description) == false) {
            JOptionPane.showMessageDialog(panel, "Description is not in the expected format.");
            return null;
        }
        
        if (c.setPrerequisites(prerequisites) == false) {
            JOptionPane.showMessageDialog(panel, "Prerequisites is not in the expected format.");
            return null;
        }
        
        return c;
    }
}
