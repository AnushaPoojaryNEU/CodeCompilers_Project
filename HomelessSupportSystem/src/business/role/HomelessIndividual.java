/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.sheltermonitoring.HomelessIndividualJPanel;

/**
 *
 * @author Geetha
 */
public class HomelessIndividual extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new HomelessIndividualJPanel(userProcessContainer, account, system);
    }
    
}
