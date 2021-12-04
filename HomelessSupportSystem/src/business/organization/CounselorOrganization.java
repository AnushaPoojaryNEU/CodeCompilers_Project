/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.role.Role;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author anu61
 */
public class CounselorOrganization extends Organization {
  
    Map<Schedule, UserAccount> counselorSchedule;

    public CounselorOrganization() {
        super(Organization.Type.Counselor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounselorRole());
        return roles;
    }

    public Map<Schedule, UserAccount> getCounselorSchedule() {
        return counselorSchedule;
    }

    public void setCounselorSchedule(Map<Schedule, UserAccount> counselorSchedule) {
        this.counselorSchedule = counselorSchedule;
    }
    
    


}
