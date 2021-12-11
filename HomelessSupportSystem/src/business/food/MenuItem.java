/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.food;
import business.util.Util;
/**
 *
 * @author dwith
 */
public class MenuItem {
   private String name;
    private float cost;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (Util.strValidate(name, null) == false)
            return false;
        this.name = name;
        return true;
    }

    public float getCost() {
        return cost;
    }
    
    public boolean setCost(String cost) {
        if (Util.strValidate(cost, "^[0-9]+\\.?[0-9]*$") == false)
            return false;
            
        try {
            return setCost(Float.valueOf(cost));
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean setCost(float cost) {
        if (cost < 0) 
            return false;
        this.cost = cost;
        return true;
    }
    
    @Override
    public String toString() {
        return name + " (" + cost + ")";
    }
     
}
