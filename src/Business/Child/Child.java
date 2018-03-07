/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

/**
 *
 * @author CHITRA PARYANI
 */
public class Child {
    
    public static String CHILD_ADOPTED = "Adopted";
    public static String CHILD_WAITING= "Waiting";
    public static String CHILD_MEDICALCHECKPENDING= "Medical check pending";
    public static String MEDICAL_REPORT_STATUS_YES = "Yes";
    public static String MEDICAL_REPORT_STATUS_NO = "No";
    private String childName;
    private int age;
    private double weight;
    private double height;
    private String medicalReportStatus;
    private String registeredFrom;
    private String adoptionStatus;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }   

    public String getMedicalReportStatus() {
        return medicalReportStatus;
    }

    public void setMedicalReportStatus(String medicalReportStatus) {
        this.medicalReportStatus = medicalReportStatus;
    }

    public String getRegisteredFrom() {
        return registeredFrom;
    }

    public void setRegisteredFrom(String registeredFrom) {
        this.registeredFrom = registeredFrom;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }
    
    
    @Override
    public String toString()
    {
        return this.childName;
    }
    
}
