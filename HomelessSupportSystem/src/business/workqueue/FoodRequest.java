/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import business.food.MenuItemOrder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class FoodRequest extends WorkRequest {
    
    private List<MenuItemOrder> order;
    
    public FoodRequest() {
        order = new ArrayList<>();
    }

    public List<MenuItemOrder> getOrder() {
        return order;
    }

    public boolean setOrder(List<MenuItemOrder> order) {
        if (order == null)
            return false;
        this.order = order;
        return true;
    }
    
    public String genOrderSummary() {
        StringBuilder str = new StringBuilder();
        float total = 0.0f;
        for (MenuItemOrder mi : order) {
            str.append(mi.getMenuItem().toString() + " x" + mi.getQuantity() 
                    + " Comments : " + mi.getComments() + "\n");
            total += (mi.getMenuItem().getCost() * mi.getQuantity());
        }
        str.append("Total Bill = $" + total);
        return str.toString();
    }
    
}
