/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.training.ProgramManagerJPanel;

/**
 *
 * @author Geetha
 */
public class TrainingProgramManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new ProgramManagerJPanel(userProcessContainer, business, account);
    }
    
}
