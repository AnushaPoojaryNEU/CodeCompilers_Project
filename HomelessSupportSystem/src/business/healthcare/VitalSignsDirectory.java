/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.healthcare;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dwith
 */
public class VitalSignsDirectory {
     private List<VitalSigns> vitalSignsList;
    
    public VitalSignsDirectory() {
        vitalSignsList = new ArrayList<>();
    }
    
    public List<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }
    
}
