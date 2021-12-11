/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.training;

import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anu61
 */
public class CourseDirectory {
    private Map<UserAccount, List<Course>> courseMap;
    private Map<UserAccount, List<Course>> studentToCourses;
    
    public CourseDirectory() {
        courseMap = new HashMap<>();
        studentToCourses = new HashMap<>();
    }
    
    public List<Course> getCoursesOfferedByInstructor(UserAccount ins) {
        if (courseMap.containsKey(ins) == false) 
            courseMap.put(ins, new ArrayList<>());
        return courseMap.get(ins);
    }
    
    public List<Course> getAllCourses() {
        List<Course> res = new ArrayList<>();
        for (UserAccount i : courseMap.keySet()) {
            List<Course> curLi = courseMap.get(i);
            if (curLi != null) 
                res.addAll(curLi);
        }
        return res;
    }
    
    public boolean addCourse(UserAccount instructor, Course course) {
        if (courseMap.containsKey(instructor) == false) {
            courseMap.put(instructor, new ArrayList<>());
        }
        return courseMap.get(instructor).add(course);
    }
    
    public boolean removeCourse(Course course) {
        for (UserAccount ua: studentToCourses.keySet()) {
            studentToCourses.get(ua).remove(course);
        }
        for (UserAccount i : courseMap.keySet()) {
            if (courseMap.get(i).remove(course))
                return true;
        }
        return false;
    }
    
    public boolean updateCourse(Course course) {
        for (UserAccount i : courseMap.keySet()) {
            int idx = courseMap.get(i).indexOf(course);
            if (idx >= 0) {
                courseMap.get(i).set(idx, course);
                return true;
            }
        }
        return false;
    }
    
    public void enrollStudent(UserAccount student, Course course) {
        course.getEnrolledUsers().add(student);
        if (studentToCourses.containsKey(course) == false) 
            studentToCourses.put(student, new ArrayList<>());
        
        studentToCourses.get(student).add(course);
    }
    
    public List<Course> getEnrolledCourses(UserAccount student) {
        if (studentToCourses.containsKey(student) == false) 
            studentToCourses.put(student, new ArrayList<>());
        return studentToCourses.get(student);
    }
    
}
