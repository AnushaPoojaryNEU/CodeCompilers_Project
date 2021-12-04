/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.appointment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author geeth
 */
public class AppointmentHistory {
    private List<Appointment> appointmentList;
    
    public AppointmentHistory() {
        appointmentList = new ArrayList<>();
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }
    
}
