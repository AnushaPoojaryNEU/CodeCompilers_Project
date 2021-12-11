/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.food;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dwith
 */
public class Menu {
    private List<MenuItem> menu;
    
    public Menu() {
        menu = new ArrayList<>();
    }
    
    public List<MenuItem> getMenu() {
        return menu;
    }
}
