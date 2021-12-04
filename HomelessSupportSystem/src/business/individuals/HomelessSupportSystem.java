/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

/**
 *
 * @author anu61
 */
public class HomelessSupportSystem {
    
    private String resName;
    private int period;
    private String providedServices;
    private String employmentDetails;
    
    public HomelessSupportSystem() {
        this.resName = resName;
        this.period = period;
        this.providedServices = providedServices;
        this.employmentDetails = employmentDetails;
        
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(String providedServices) {
        this.providedServices = providedServices;
    }

    public String getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(String employmentDetails) {
        this.employmentDetails = employmentDetails;
    }
}
