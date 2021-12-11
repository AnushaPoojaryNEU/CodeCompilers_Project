/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

/**
 *
 * @author Geetha
 */
public enum RoleType {
    CHEF("Chef"), 
    DELIVERY_MAN("Delivery Man"), 
    DOCTOR("Doctor"), 
    FOOD_SUPPLY_MANAGER("Food Supply Manager"),
    HOUSING_MANAGER("Housing Manager"),
    INSTRUCTOR("Instructor"),
    MAINTENANCE_CREW_MEMBER("Maintenance Crew Member"),
    NURSE("Nurse"),
    PROGRAM_MANAGER("Program Manager"),
    RECEPTIONIST("Receptionist"),
    SYS_ADMIN("System Administrator"),
    ENTERPRISE_ADMIN("Enterprise Administrator"),
    HOMELESS_INDIVIDUAL("Homeless Individual");
    
    private String value;
    
    private RoleType(String val){
        this.value = val;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
