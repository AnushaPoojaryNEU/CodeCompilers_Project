/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.training;

import business.useraccount.UserAccount;
import business.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author anu61
 */
public class Course {
   private String id, courseName, description, prerequisites;
   private List<UserAccount> enrolledUsers;
   
   public Course() {
        id = UUID.randomUUID().toString();
        enrolledUsers = new ArrayList<>();
    }
    public void copyCourseListing(Course c) {
        this.courseName = c.courseName;
        this.description = c.description;
        this.prerequisites = c.prerequisites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

     public boolean setCourseName(String courseName) {
        if (Util.strValidate(courseName, null)) {
            this.courseName = courseName;
            return true;
        }
        return false;
    }

    public String getDescription() {
        return description;
    }

    public boolean setDescription(String description) {
        if (Util.strValidate(description, null)) {
            this.description = description;
            return true;
        }
        return false;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

     public boolean setPrerequisites(String prerequisites) {
        if (Util.strValidate(prerequisites, null)) {
            this.prerequisites = prerequisites;
            return true;
        }
        return false;
    }
     
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    public List<UserAccount> getEnrolledUsers() {
        return enrolledUsers;
    }

    public void setEnrolledUsers(List<UserAccount> enrolledUsers) {
        this.enrolledUsers = enrolledUsers;
    }
    
    
     
}
