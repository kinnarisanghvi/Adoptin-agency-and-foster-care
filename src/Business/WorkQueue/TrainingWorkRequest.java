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
public class TrainingWorkRequest extends WorkRequest {
    public static String LEVEL1_STATUS = "Level1 completed";
    public static String LEVEL2_STATUS = "Level2 completed";
    public static String LEVEL3_STATUS = "Level3 completed";
     public static String REGLEVEL_1 = "Level1";
    public static String  REGLEVEL_2= "Level2";
    public static String REGLEVEL_3 = "Level3";
    private  boolean level1Complete = false;
    private  boolean level2Complete = false;
    private  boolean level3Complete = false;
    private ParentWorkRequest parentReq;
      private String registeredFor;

    public boolean isLevel1Complete() {
        return level1Complete;
    }

    public void setLevel1Complete(boolean level1Complete) {
        this.level1Complete = level1Complete;
    }

    public boolean isLevel2Complete() {
        return level2Complete;
    }

    public void setLevel2Complete(boolean level2Complete) {
        this.level2Complete = level2Complete;
    }

    public boolean isLevel3Complete() {
        return level3Complete;
    }

    public void setLevel3Complete(boolean level3Complete) {
        this.level3Complete = level3Complete;
    }

    public ParentWorkRequest getParentReq() {
        return parentReq;
    }

    public void setParentReq(ParentWorkRequest parentReq) {
        this.parentReq = parentReq;
    }

    public String getRegisteredFor() {
        return registeredFor;
    }

    public void setRegisteredFor(String registeredFor) {
        this.registeredFor = registeredFor;
    }
    
    
    
    
    
}
