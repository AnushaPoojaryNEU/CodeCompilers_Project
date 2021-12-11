/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;
import business.healthcare.VitalSignsDirectory;

/**
 *
 * @author dwith
 */
public class HomelessIndividual extends Individual {
    private VitalSignsDirectory vitalSignsDirectory;
    
    public HomelessIndividual() {
        vitalSignsDirectory = new VitalSignsDirectory();
    }
    
    public VitalSignsDirectory getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }
}
