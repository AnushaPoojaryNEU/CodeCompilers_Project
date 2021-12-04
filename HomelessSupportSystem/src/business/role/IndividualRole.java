/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.network.Network;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author dwith
 */
public class IndividualRole extends Role{
    
    ArrayList<Enterprise> facilityList = new ArrayList<Enterprise>();
     @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, Enterprise enterprise, Individual individual) {
       facilityList = new ArrayList<Enterprise>();
        if (individual != null) {
            for (Network n : system.getNetworkList()) {
                if (n.getName().equalsIgnoreCase(individual.getCity())) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.enterpriseType.getValue().equalsIgnoreCase("Facility")) {
                            facilityList.add(e);
                        }
                    }
                }
            }
        }
        if (individual.getRecordInfo().getResName() == null || individual.getRecordInfo().getResName().equals("")) {
            return new IndividualsRegistrationFormJPanel1(userProcessContainer, account, individual, facilityList);//To change body of generated methods, choose Tools | Templates.

        }
        return new IndividualMyAccountJPanel(userProcessContainer, account, individual, facilityList);//To change body of generated methods, choose Tools | Templates.
    }
    
}
