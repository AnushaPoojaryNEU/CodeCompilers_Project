/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workqueue;

import business.individuals.Individual;
import business.useraccount.UserAccount;
import business.util.Util;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author anu61
 */
public class WorkRequest implements Comparable {
    private UserAccount sender, receiver;
    private String message, status, id;
    private Date requestDate, resolveDate;
    
      public WorkRequest() {
        id = UUID.randomUUID().toString();
        this.requestDate = new Date();
    }

    
    public WorkRequest(UserAccount sender, UserAccount receiver, 
            String message, String status){
        this();
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.status = status;
        this.requestDate = new Date();
    }

    public UserAccount getSender() {
        return sender;
    }

     public boolean setSender(UserAccount sender) {
        if (sender != null) {
            this.sender = sender;
            return true;
        }
        return false;
    }

    public UserAccount getReceiver() {
        return receiver;
    }
    
    public boolean setReceiver(UserAccount receiver) {
        if (receiver != null) {
            this.receiver = receiver;
            return true;
        }
        return false;
    }


    public String getMessage() {
        return message;
    }

    public boolean setMessage(String message) {
        if (Util.strValidate(message, null)) {
            this.message = message;
            return true;
        }
        return false;
    }

    public String getStatus() {
        return status;
    }

    public boolean setStatus(String status) {
        if (Util.strValidate(status, null)) {
            this.status = status;
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRequestDate() {
        return requestDate;
    }

   public boolean setRequestDate(Date requestDate) {
        if (requestDate != null) {
            this.requestDate = requestDate;
            return true;
        }
        return false;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public boolean setResolveDate(Date resolveDate) {
        if (resolveDate != null) {
            this.resolveDate = resolveDate;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.message;
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
        final WorkRequest other = (WorkRequest) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Object o) {
        if (this.equals(o))
            return 0;
        if (o == null) {
            return 1;
        }
        if (getClass() != o.getClass()) {
            return 1;
        }
        WorkRequest other = (WorkRequest) o;
        return this.requestDate.compareTo(other.requestDate);
    }
    
    
}
