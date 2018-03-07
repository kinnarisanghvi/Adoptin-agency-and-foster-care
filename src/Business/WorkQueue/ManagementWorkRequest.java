
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
public class ManagementWorkRequest extends WorkRequest{
    
    public static String FINALSTATUS = "Background Check Complete";
    public static String REJECTEDSTATUS="Parent is not eligible for adoption";
    public static String INITIATE_HOMESTUDY="HomeStudy Initiated";
    public static String TRAINING = "Training Complete";
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
