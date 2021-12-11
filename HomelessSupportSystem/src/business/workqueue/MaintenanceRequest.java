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
public class MaintenanceRequest extends WorkRequest {
    private String issue, comments;

    public MaintenanceRequest(String issue, String comments, UserAccount sender,
        UserAccount receiver, String message, String status) {
        super(sender, receiver, message, status);
        this.issue = issue;
        this.comments = comments;
    }

    public MaintenanceRequest() {
        super();
    }

    public String getIssue() {
        return issue;
    }

     public boolean setIssue(String issue) {
        if (Util.strValidate(issue, null)) {
            this.issue = issue;
            return true;
        }
        return false;
    }

    public String getComments() {
        return comments;
    }

    public boolean setComments(String comments) {
        if (Util.strValidate(comments, null)) {
            this.comments = comments;
            return true;
        }
        return false;
    }
    
    
}
