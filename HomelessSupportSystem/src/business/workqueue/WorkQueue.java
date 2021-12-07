/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class WorkQueue {
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        if(workRequestList == null){
            workRequestList = new ArrayList();
        }
        return workRequestList;
    }
}
