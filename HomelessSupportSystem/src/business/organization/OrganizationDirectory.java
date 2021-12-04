/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class OrganizationDirectory {
     List<Organization> organizationList;
     
    public OrganizationDirectory() {
        this.organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

   
     public Organization createOrganization(Type type) {
        Organization organization = null;
        if(type == Organization.Type.Admin) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Counselor) {
            organization = new CounselorOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.EmploymentTrainingOrganization) {
            organization = new EmploymentTrainingOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.FoodProviderOrganization) {
            organization = new FoodProviderOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.ShelterProviderOrganization) {
            organization = new ShelterProviderOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Doctor) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        if(type == Organization.Type.Nurse) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
   

}
