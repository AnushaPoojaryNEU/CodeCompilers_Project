/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geetha
 */
public class MedicalOrganization extends Organization{

    public MedicalOrganization(String name) {
        super(name);
    }

    @Override
    public List<RoleType> getSupportedRoles() {
        ArrayList<RoleType> rList = new ArrayList<>();
        rList.add(RoleType.DOCTOR);
        rList.add(RoleType.NURSE);
        return rList;
    }
    
}
