/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.EcoSystem;
import business.organization.EducatorOrganization;
import business.organization.Organization;
import business.organization.TrainingSupportStaff;
import business.role.TrainingProgramManager;
import business.training.Course;
import business.training.CourseDirectory;
import business.useraccount.UserAccount;
import business.workqueue.EnrollRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author geeth
 */
public class TrainingCenterEnterprise extends Enterprise {
    
    private CourseDirectory courseDirectory;
    
    public TrainingCenterEnterprise(String name, String address) {
        super(name, address);
        List<Organization> orgLi = organizationDirectory.getOrganizationList();
        orgLi.add(new TrainingSupportStaff("Support Staff"));
        orgLi.add(new EducatorOrganization("Educators"));
        courseDirectory = new CourseDirectory();
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }
    
    public List<UserAccount> getAllProgramManagers() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof TrainingProgramManager) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
    public UserAccount getAProgramManager() {
        List<UserAccount> managers = getAllProgramManagers();
        if (managers.size() <= 0) 
            return null;
        return managers.get(new Random().nextInt(managers.size()));
    }

    public boolean submitEnrollmentRequest(EcoSystem system, Course course, UserAccount student) {
        EnrollRequest req = new EnrollRequest();
        req.setSender(student);
        UserAccount pgm = getAProgramManager();
        if (pgm == null)
            return false;
        req.setReceiver(pgm);
        req.setStatus("Sent for Review");
        req.setCourse(course);
        system.getWorkRequestManager().addWorkRequest(req);
        return true;
    }
    
}
