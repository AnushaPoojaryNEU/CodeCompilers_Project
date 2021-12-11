/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.useraccount;

import business.role.Role;
import business.role.Role.RoleType;
import business.workqueue.WorkQueue;

/**
 *
 * @author anu61
 */
public class UserAccount {
   private String username;
   private String password;
   private Role role;
   private RoleType roleType;
   private WorkQueue workQueue;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        final UserAccount other = (UserAccount) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
   }
  

}
