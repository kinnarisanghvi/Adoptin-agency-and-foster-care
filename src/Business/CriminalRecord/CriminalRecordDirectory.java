/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CriminalRecord;

import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class CriminalRecordDirectory {
    
    private ArrayList<CriminalRecord> criminalRecordList;

    public CriminalRecordDirectory() {
        criminalRecordList = new ArrayList<>();
    }

    public ArrayList<CriminalRecord> getCriminalRecordList() {
        return criminalRecordList;
    }
    
    public CriminalRecord createRecord(String SSN,String description){
        CriminalRecord crimeRecord = new CriminalRecord();
        crimeRecord.setSSN(SSN);
        crimeRecord.setCrimeDescription(description);
        criminalRecordList.add(crimeRecord);
        return crimeRecord;
    }
}
