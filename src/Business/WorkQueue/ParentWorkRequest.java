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
public class ParentWorkRequest extends WorkRequest{
    public static String REGLEVEL_1 = "Level1";
    public static String  REGLEVEL_2= "Level2";
    public static String REGLEVEL_3 = "Level3";
    public static String FINANCIALDOCS_REQUEST = "Financial Documents Required";
    private String description;
    private String Training_level;
    private String registeredFor;
    private FinancialCheckWorkRequest fWorkRequest;
    private MedicalCheckWorkRequest mWorkRequest;

    public FinancialCheckWorkRequest getfWorkRequest() {
        return fWorkRequest;
    }

    public void setfWorkRequest(FinancialCheckWorkRequest fWorkRequest) {
        this.fWorkRequest = fWorkRequest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTraining_level() {
        return Training_level;
    }

    public void setTraining_level(String Training_level) {
        this.Training_level = Training_level;
    }

    public String getRegisteredFor() {
        return registeredFor;
    }

    public void setRegisteredFor(String registeredFor) {
        this.registeredFor = registeredFor;
    }

    public MedicalCheckWorkRequest getmWorkRequest() {
        return mWorkRequest;
    }

    public void setmWorkRequest(MedicalCheckWorkRequest mWorkRequest) {
        this.mWorkRequest = mWorkRequest;
    }
    
    
    
    
}
