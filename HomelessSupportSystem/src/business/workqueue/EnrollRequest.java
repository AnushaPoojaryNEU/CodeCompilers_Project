/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import business.training.Course;
import business.useraccount.UserAccount;

/**
 *
 * @author anu61
 */
public class EnrollRequest extends WorkRequest {
    
    Course course;
    
    public EnrollRequest() {
        super();
    }
    public EnrollRequest(String courseId, UserAccount sender, 
            UserAccount receiver, String message, String status) {
        super(sender, receiver, message, status);
    }

    public Course getCourse() {
        return course;
    }

    public boolean setCourse(Course course) {
        if (course == null)
            return false;
        this.course = course;
        return true;
    }
    
    
    
}
