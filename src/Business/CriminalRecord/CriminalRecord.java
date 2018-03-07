/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CriminalRecord;

/**
 *
 * @author sneha
 */
public class CriminalRecord {
    
    private String SSN;
    private String crimeDescription;
    private boolean crimeRecordPresent;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getCrimeDescription() {
        return crimeDescription;
    }

    public void setCrimeDescription(String crimeDescription) {
        this.crimeDescription = crimeDescription;
    }

    public boolean isCrimeRecordPresent() {
        return crimeRecordPresent;
    }

    public void setCrimeRecordPresent(boolean crimeRecordPresent) {
        this.crimeRecordPresent = crimeRecordPresent;
    }

    @Override
    public String toString() {
        return this.getSSN(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
