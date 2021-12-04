/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.appointment;

import business.util.Util;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author geeth
 */
public class Appointment {
    private Date appointmentDate;
    private String doctorName;
    private String diagnosis;
    private String comments;
    private final String appointmentId;
    
    public Appointment() {
        // UUID generates a random unique string
        // that can be used as an ID
        appointmentId = UUID.randomUUID().toString();
        // setting the current time as the appointment date
        // can be changed later using the setter if required
        appointmentDate = new Date();
    }
    
    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public boolean setAppointmentDate(Date appointmentDate) {
        if (appointmentDate != null){
            this.appointmentDate = appointmentDate;
            return true;
        }
        return false;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public boolean setDoctorName(String doctorName) {
        if (Util.strValidate(doctorName, null)){
            this.doctorName = doctorName;
            return true;
        }
        return false;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean setDiagnosis(String diagnosis) {
        if (Util.strValidate(diagnosis, null)){
            this.diagnosis = diagnosis;
            return true;
        }
        return false;
    }

    public String getComments() {
        return comments;
    }

    public boolean setComments(String comments) {
        if (Util.strValidate(comments, null)){
            this.comments = comments;
            return true;
        }
        return false;
    }
    
    
}
