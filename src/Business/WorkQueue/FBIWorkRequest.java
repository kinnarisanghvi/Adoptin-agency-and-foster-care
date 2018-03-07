/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sneha
 */
public class FBIWorkRequest extends WorkRequest {
   
    private String message;
    private CriminalCheckWorkRequest criminalWorkRequest;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CriminalCheckWorkRequest getCriminalWorkRequest() {
        return criminalWorkRequest;
    }

    public void setCriminalWorkRequest(CriminalCheckWorkRequest criminalWorkRequest) {
        this.criminalWorkRequest = criminalWorkRequest;
    }
    
    
}
