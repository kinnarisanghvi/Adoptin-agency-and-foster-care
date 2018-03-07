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
public class FinancialCheckWorkRequest extends WorkRequest {
    public static String DOCSTATUS_UPLOADED ="Documents uploaded";
    public static String DOCSTATUS_WAITING = "Documents requested to applicant";
    public static String FINALSTATUS ="Financial Check Complete";
    public static String INPROGRESS ="Financial Check InProgress";
    public static String DOCSTATUS_VERIFIED ="Documents Verified";
    public static String DOCSTATUS_FAILED ="Documents Verification failed";
     public static String INITIATE ="Initiate Financial Check ";
    private String docUploadStatus;

    public String getDocUploadStatus() {
        return docUploadStatus;
    }

    public void setDocUploadStatus(String docUploadStatus) {
        this.docUploadStatus = docUploadStatus;
    }

    
    
}
