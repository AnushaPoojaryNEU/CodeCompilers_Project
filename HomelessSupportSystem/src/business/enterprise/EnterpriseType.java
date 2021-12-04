/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

/**
 *
 * @author geeth
 */
public enum EnterpriseType {
    HOSPITAL("Hospital"), TRAINING_CENTER("Training Center"), 
    FOOD("Food"), SHELTER_MONITORING("Shelter Monitoring");

    private String value;

    private EnterpriseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
