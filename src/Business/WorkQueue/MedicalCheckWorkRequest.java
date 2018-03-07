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
public class MedicalCheckWorkRequest extends WorkRequest {
    public static String DOCSTATUS_UPLOADED ="Medical Reports uploaded";
    public static String DOCSTATUS_WAITING = "Medical Reports requested to applicant";
    public static String FINALSTATUS ="Medical Check Complete";
    public static String INPROGRESS ="Medical Check InProgress";
    public static String INITIATE ="Initiate Medical Check";
  //  public static String DOCSTATUS_VERIFIED ="Documents Verified";
  //  public static String DOCSTATUS_FAILED ="Documents Verification failed";        
    private String message;
    private String docUploadStatus;

    public String getDocUploadStatus() {
        return docUploadStatus;
    }

    public void setDocUploadStatus(String docUploadStatus) {
        this.docUploadStatus = docUploadStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
