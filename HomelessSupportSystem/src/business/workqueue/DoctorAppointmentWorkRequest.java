/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import business.useraccount.UserAccount;
import business.util.Util;

/**
 *
 * @author anu61
 */
public class DoctorAppointmentWorkRequest extends WorkRequest{
    private String problem, patientComments;
    private String doctorName;
    private String diagnosis;
    private String prescription;
    
    public DoctorAppointmentWorkRequest() {
        super();
        problem = ""; 
        patientComments = "";
//        appointmentDate = null;
        doctorName = "";
        diagnosis = "";
        prescription = "";
    }
    
      public DoctorAppointmentWorkRequest(String problem, String patientComments, 
           UserAccount sender, UserAccount receiver, String message, 
           String status) {
        super(sender, receiver, message, status);
        this.problem = problem;
        this.patientComments = patientComments;
    }

    public String getProblem() {
        return problem;
    }

   public boolean setProblem(String problem) {
        if (Util.strValidate(problem, null)) {
            this.problem = problem;
            return true;
        }
        return false;
    }

    public String getPatientComments() {
        return patientComments;
    }

    public boolean setPatientComments(String patientComments) {
        if (Util.strValidate(patientComments, null)) {
            this.patientComments = patientComments;
            return true;
        }
        return false;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public boolean setDoctorName(String doctorName) {
        if (Util.strValidate(doctorName, null)) {
            this.doctorName = doctorName;
            return true;
        }
        return false;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean setDiagnosis(String diagnosis) {
        if (Util.strValidate(diagnosis, null)) {
            this.diagnosis = diagnosis;
            return true;
        }
        return false;
    }

    public String getPrescription() {
        return prescription;
    }

    public boolean setPrescription(String prescription) {
        if (Util.strValidate(prescription, null)) {
            this.prescription = prescription;
            return true;
        }
        return false;
    }
      
      
    
}
