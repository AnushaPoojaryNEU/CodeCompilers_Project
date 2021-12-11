/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.healthcare;

import java.util.Date;

/**
 *
 * @author dwith
 */
public class VitalSigns implements Comparable{
    private float sbp, dbp, heartRate, temperature, spo2; // temp in Farenheit
    private Date date;
    // sbp = Systolic Blood Pressure
    // dbp = Diastolic Blood Pressure

    public boolean setDate(Date date) {
        if (date == null)
            return false;
        this.date = date;
        return true;
    }
    
    public VitalSigns() {
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public float getSbp() {
        return sbp;
    }

    public float getSpo2() {
        return spo2;
    }

    public boolean setSpo2(float spo2) {
        if ((spo2 < 0) || (spo2 > 100))
            return false;
        this.spo2 = spo2;
        return true;
    }
    
    public boolean setSbp(String sbp) {
        if (sbp == null)
            return false;
        
        try {
            return this.setSbp(Float.parseFloat(sbp));
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean setDbp(String dbp) {
        if (dbp == null)
            return false;
        
        try {
            return this.setDbp(Float.parseFloat(dbp));
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean setHeartRate(String heartRate) {
        if (heartRate == null)
            return false;
        
        try {
            return this.setHeartRate(Float.parseFloat(heartRate));
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean setTemperature(String temp) {
        if (temp == null)
            return false;
        
        try {
            return this.setTemperature(Float.parseFloat(temp));
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean setSpo2(String spo2) {
        if (spo2 == null)
            return false;
        
        try {
            return this.setSpo2(Float.parseFloat(spo2));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean setSbp(float sbp) {
        if (sbp < 0 || sbp > 1000)
            return false;
        this.sbp = sbp;
        return true;
    }

    public float getDbp() {
        return dbp;
    }

    public boolean setDbp(float dbp) {
        if (dbp < 0 || dbp > 1000)
            return false;
        this.dbp = dbp;
        return true;
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
        final VitalSigns other = (VitalSigns) obj;
        if (Float.floatToIntBits(this.sbp) != Float.floatToIntBits(other.sbp)) {
            return false;
        }
        if (Float.floatToIntBits(this.dbp) != Float.floatToIntBits(other.dbp)) {
            return false;
        }
        if (Float.floatToIntBits(this.heartRate) != Float.floatToIntBits(other.heartRate)) {
            return false;
        }
        if (Float.floatToIntBits(this.temperature) != Float.floatToIntBits(other.temperature)) {
            return false;
        }
        if (Float.floatToIntBits(this.spo2) != Float.floatToIntBits(other.spo2)) {
            return false;
        }
        return true;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public boolean setHeartRate(float heartRate) {
        if (heartRate < 0 || heartRate > 1000)
            return false;
        this.heartRate = heartRate;
        return true;
    }

    public float getTemperature() {
        return temperature;
    }

    public boolean setTemperature(float temperature) {
        if (temperature < 0 || temperature > 150)
            return false;
        this.temperature = temperature;
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
        VitalSigns other = (VitalSigns) o;
        return this.date.compareTo(other.date);
    }
}
