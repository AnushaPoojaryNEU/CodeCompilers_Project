/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import business.individuals.HomelessIndividual;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author anu61
 */
public class WorkRequestManager {
    private Map<UserAccount, ArrayList<WorkRequest>> workReqMap;
    
    public WorkRequestManager() {
        workReqMap = new HashMap<>();
    }
     public boolean addWorkRequest(WorkRequest req) {
        UserAccount sender = req.getSender();
        UserAccount receiver = req.getReceiver();
        if ((sender == null) && (receiver == null))
            return false;
        if ((sender != null) && (workReqMap.containsKey(sender) == false)) {
            workReqMap.put(sender, new ArrayList<>());
        }
        if ((receiver != null) && (workReqMap.containsKey(receiver) == false)) {
            workReqMap.put(receiver, new ArrayList<>());
        }
        if (sender != null)
            workReqMap.get(req.getSender()).add(req);
        if (receiver != null)
            workReqMap.get(req.getReceiver()).add(req);
        return true;
    }
    
    public ArrayList<WorkRequest> getWorkRequestForUser(UserAccount ua) {
        return workReqMap.getOrDefault(ua, null);
    }
    
    public void updateWorkRequest(WorkRequest req) {
        for(UserAccount ua: workReqMap.keySet()) {
            workReqMap.get(ua).remove(req);
        }
        addWorkRequest(req);
    }
    
    public ArrayList<MaintenanceRequest> getMaintenanceRequestsForUser(UserAccount ua) {
        ArrayList<MaintenanceRequest> li = new ArrayList<>();
        
        for (WorkRequest req : workReqMap.getOrDefault(ua, new ArrayList<>())) {
            if (req instanceof MaintenanceRequest) {
                li.add((MaintenanceRequest)req);
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<MaintenanceRequest> getMaintenanceRequests() {
        ArrayList<MaintenanceRequest> li = new ArrayList<>();
        for (UserAccount ua: workReqMap.keySet()) {
            if (ua.getIndividual() instanceof HomelessIndividual) {
                li.addAll(getMaintenanceRequestsForUser(ua));
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<MaintenanceRequest> getUnresolvedMaintenanceRequests() {
        ArrayList<MaintenanceRequest> li = new ArrayList<>();
        for (UserAccount ua: workReqMap.keySet()) {
            if (ua.getIndividual() instanceof HomelessIndividual) {
                for (MaintenanceRequest mr : getMaintenanceRequestsForUser(ua)) {
                    if (mr.getStatus().equals("COMPLETED") == false)
                        li.add(mr);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<FoodRequest> getFoodRequestsForUser(UserAccount ua) {
        ArrayList<FoodRequest> li = new ArrayList<>();
        
        for (WorkRequest req : workReqMap.getOrDefault(ua, new ArrayList<>())) {
            if (req instanceof FoodRequest) {
                li.add((FoodRequest)req);
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<FoodRequest> getUnresolvedFoodRequests() {
        // using Set to avoid multiple entries of the same work request
        HashSet<FoodRequest> set = new HashSet<>();
        for (UserAccount ua: workReqMap.keySet()) {
            for (FoodRequest mr : getFoodRequestsForUser(ua)) {
                if (mr.getStatus().equals("COMPLETED") == false)
                    set.add(mr);
            }
        }
        ArrayList<FoodRequest> li = new ArrayList(set);
        Collections.sort(li);
        return li;
    }
    
    
    public ArrayList<EnrollRequest> getEnrollRequestsForUser(UserAccount ua) {
        ArrayList<EnrollRequest> li = new ArrayList<>();
        
        for (WorkRequest req : workReqMap.getOrDefault(ua, new ArrayList<>())) {
            if (req instanceof EnrollRequest) {
                li.add((EnrollRequest)req);
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<EnrollRequest> getUnresolvedEnrollRequests() {
        // using Set to avoid multiple entries of the same work request
        HashSet<EnrollRequest> set = new HashSet<>();
        for (UserAccount ua: workReqMap.keySet()) {
            for (EnrollRequest mr : getEnrollRequestsForUser(ua)) {
                if (mr.getStatus().equals("Enrolled") == false)
                    set.add(mr);
            }
        }
        ArrayList<EnrollRequest> li = new ArrayList(set);
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<DoctorAppointmentWorkRequest> getDoctorAppointmentWorkRequestsForUser(UserAccount ua) {
        ArrayList<DoctorAppointmentWorkRequest> li = new ArrayList<>();
        
        for (WorkRequest req : workReqMap.getOrDefault(ua, new ArrayList<>())) {
            if (req instanceof DoctorAppointmentWorkRequest) {
                li.add((DoctorAppointmentWorkRequest)req);
            }
        }
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<DoctorAppointmentWorkRequest> getUnresolvedDoctorAppointmentWorkRequests() {
        // using Set to avoid multiple entries of the same work request
        HashSet<DoctorAppointmentWorkRequest> set = new HashSet<>();
        for (UserAccount ua: workReqMap.keySet()) {
            for (DoctorAppointmentWorkRequest mr : getDoctorAppointmentWorkRequestsForUser(ua)) {
                if (mr.getStatus().equals("Meeting completed") == false)
                    set.add(mr);
            }
        }
        ArrayList<DoctorAppointmentWorkRequest> li = new ArrayList(set);
        Collections.sort(li);
        return li;
    }
    
    public ArrayList<DoctorAppointmentWorkRequest> getDoctorAppointmentWorkReqWithStatus(UserAccount ua, String status) {
        ArrayList<DoctorAppointmentWorkRequest> li = new ArrayList<>();
        
        for (WorkRequest req : workReqMap.getOrDefault(ua, new ArrayList<>())) {
            if ((req instanceof DoctorAppointmentWorkRequest) && (req.getStatus().equals(status))) {
                li.add((DoctorAppointmentWorkRequest)req);
            }
        }
        Collections.sort(li);
        return li;
    }
   
    
}
