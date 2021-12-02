/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;

import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author anu61
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Caregiver("Caregiver"),
        Reviewer("Reviewer"),
        Individual("Individual"),
        SystemAdmin("SystemAdmin"),
        Trainer("Trainer");
        
        
        private final String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return this.getValue();
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise,Individual individual);

}
