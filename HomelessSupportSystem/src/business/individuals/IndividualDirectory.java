/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61<T>
 */
public class IndividualDirectory <T extends Individual>  {
     private List<T> individualList;
    
    public IndividualDirectory() {
        individualList = new ArrayList<>();
    }
    
    public List<T> getList() {
        return individualList;
    }
    
    public boolean add(T element) {
        if (element == null)
            return false;
        return individualList.add(element);
    }
    
    public boolean update(int idx, T element) {
        if (element == null)
            return false;
        if ((idx < 0) || (idx > individualList.size()) )
            return false;
        individualList.set(idx, element);
        return true;
    }
    
    public boolean update(T element) {
        int idx = individualList.indexOf(element);
        if (idx < 0)
            return false;
        individualList.set(idx, element);
        return true;
    }
    
    public boolean remove(T element) {
        return individualList.remove(element);
    }
    
    public boolean remove(int idx) {
        individualList.remove(idx);
        return true;
    }
    
    public T findUsingUsername(String username) {
        for (T e: individualList) {
            if(e.getUsername().equals(username))
                return e;
        }
        return null;
    }
    
    public boolean isUsernameUnique(String username) {
        if(findUsingUsername(username) == null)
            return false;
        return true;
    }
}
