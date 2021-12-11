/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.individuals.HomelessIndividual;
import business.individuals.IndividualDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geetha
 */
public class HousingOrganization extends Organization {
    
    private IndividualDirectory<HomelessIndividual> homelessDirectory;

    public IndividualDirectory<HomelessIndividual> getHomelessDirectory() {
        return homelessDirectory;
    }
    
    public HousingOrganization(String name) {
        super(name);
        homelessDirectory = new IndividualDirectory<>();
    }

    
    
}
