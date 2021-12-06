/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author dwith
 */
public class DoctorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise, Individual individual) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account,enterprise);
    }
    
}
