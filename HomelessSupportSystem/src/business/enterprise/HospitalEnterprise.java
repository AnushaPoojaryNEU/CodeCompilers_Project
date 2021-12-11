/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.EcoSystem;
import business.organization.HospitalManagementOrganization;
import business.organization.MedicalOrganization;
import business.organization.Organization;
import business.role.Doctor;
import business.role.Receptionist;
import business.useraccount.UserAccount;
import business.workqueue.DoctorAppointmentWorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author geeth
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name, String address) {
        super(name, address);
        List<Organization> orgLi = organizationDirectory.getOrganizationList();
        orgLi.add(new MedicalOrganization("Medical"));
        orgLi.add(new HospitalManagementOrganization("Management"));
    }
    
    public boolean requestAppointment(EcoSystem system, UserAccount sender, 
            String problem, String patientComments) {
        DoctorAppointmentWorkRequest dwq = new DoctorAppointmentWorkRequest();
        dwq.setProblem(problem);
        dwq.setPatientComments(patientComments);
        dwq.setMessage(problem);
        dwq.setSender(sender);
        dwq.setStatus("REQUESTED");
        UserAccount rec = getAReceptionist();
        if (rec == null)
            return false;
        dwq.setReceiver(rec);
        system.getWorkRequestManager().addWorkRequest(dwq);
        return true;
    }
    
     public List<UserAccount> getAllReceptionists() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof Receptionist) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
    public UserAccount getAReceptionist() {
        List<UserAccount> all = getAllReceptionists();
        if (all.size() <= 0) 
            return null;
        return all.get(new Random().nextInt(all.size()));
    }
    
       public List<UserAccount> getAllDoctors() {
        List<UserAccount> uaList = new ArrayList<>();
        for(UserAccount ua: userAccountDirectory.getUserAccountList()) {
            if (ua.getRole() instanceof Doctor) {
                uaList.add(ua);
            }
        }
        return uaList;
    }
    
}
