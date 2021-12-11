/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

import business.useraccount.UserAccount;
import business.util.Util;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author dwith
 */
public class Individual {
    private String id;
    private String username;
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private int age;
    
    public Individual() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        if (Util.strValidate(username, null)) {
            this.username = username;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (Util.strValidate(name, null)) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (Util.strValidate(address, null)) {
            this.address = address;
            return true;
        }
        return false;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if (Util.strValidate(city, null)) {
            this.city = city;
            return true;
        }
        return false;
    }

    public String getZipCode() {
        return zipCode;
    }

    public boolean setZipCode(String zipCode) {
        if (Util.strValidate(zipCode, "[0-9]+")) {
            this.zipCode = zipCode;
            return true;
        }
        return false;
    }

    public int getAge() {
        return age;
    }
    
    public boolean setAge(int age) {
        if ((age > 0) && (age < 200)) {
            this.age = age;
            return true;
        }
        return false;
    }

    public boolean setAge(String age) {
        if (Util.strValidate(age, "[0-9]+")) {
            try {               
                return this.setAge(Integer.valueOf(age));
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Individual other = (Individual) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    
}
