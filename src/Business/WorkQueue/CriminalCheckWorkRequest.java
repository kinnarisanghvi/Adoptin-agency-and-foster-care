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
public class CriminalCheckWorkRequest extends WorkRequest {
    public static String FBICHECK="Ready for FBI Check";
    public static String FBIAPPROVED="Approved by FBI";
     public static String FBIREJECTED="Rejected by FBI";
    public static String FINALSTATUS ="Criminal Check Complete";
    public static String INPROGRESS ="Criminal Check InProgress";
    public static String INITIATE ="Initiate Criminal Check ";
    private String CheckListStatus;
    private String documentsSubmitted;
    private String fingerPrintDone;
    private String FBIStatus ;
   // private FBIWorkRequest fbiRequest;

    public String getCheckListStatus() {
        return CheckListStatus;
    }

    public void setCheckListStatus(String CheckListStatus) {
        this.CheckListStatus = CheckListStatus;
    }

    public String getDocumentsSubmitted() {
        return documentsSubmitted;
    }

    public void setDocumentsSubmitted(String documentsSubmitted) {
        this.documentsSubmitted = documentsSubmitted;
    }

    public String getFingerPrintDone() {
        return fingerPrintDone;
    }

    public void setFingerPrintDone(String fingerPrintDone) {
        this.fingerPrintDone = fingerPrintDone;
    }

   /* public FBIWorkRequest getFbiRequest() {
        return fbiRequest;
    }

    public void setFbiRequest(FBIWorkRequest fbiRequest) {
        this.fbiRequest = fbiRequest;
    }*/

    public String getFBIStatus() {
        return FBIStatus;
    }

    public void setFBIStatus(String FBIStatus) {
        this.FBIStatus = FBIStatus;
    }

    
}
