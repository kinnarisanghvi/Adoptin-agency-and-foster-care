/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kinnari
 */
public class EducationalCheckWorkRequest extends WorkRequest {
    public static String FINALSTATUS ="Educational Check Complete";
    public static String INPROGRESS ="Educational Check InProgress";
    public static String INITIATE ="Initiate Educational Check";   
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
