/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class IndividualDirectory {
    private List<Individual> individualList;
      
    public IndividualDirectory() {
        
        individualList = new ArrayList<Individual>();
    }

       
    public Individual addIndividual(Individual i){
        if(individualList.contains(i) == false){
            Individual individual = new Individual();
            return individual;
        }
        return null;
    }
    
    
    public boolean deleteIndividual(Individual i){
         if(individualList.contains(i) == true){
            individualList.remove(i);
            return true;
        }
        return false;
    }
    
    public List<Individual> getIndividualList() {
        return individualList;
    }

    public void setIndividualList(List<Individual> individualList) {
        this.individualList = individualList;
    }
    
   
}
