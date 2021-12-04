/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.individuals;

import java.util.List;

/**
 *
 * @author dwith
 */
public class Individual {
    
    private int regId;
    private String firstName;
    private String lastName;
    private String userName;
    private String address;
    private String city;
    private int zipCode;
    private String birthDate;
    private String serviceType;
    private HomelessSupportSystem recordInfo;
   
    private List<IndividualHistory> history;
    
     public Individual() {
        regId = (int) (System.currentTimeMillis() & 0xfffffff);
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public HomelessSupportSystem getRecordInfo() {
        return recordInfo;
    }

    public void setRecordInfo(HomelessSupportSystem recordInfo) {
        this.recordInfo = recordInfo;
    }

    public List<IndividualHistory> getHistory() {
        return history;
    }

    public void setHistory(List<IndividualHistory> history) {
        this.history = history;
    }
     
     
     
          
    @Override
    public String toString(){
        return this.getUserName();
    }
}
