/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProspectiveParent;

import Business.Child.Child;

/**
 *
 * @author sneha
 */
public class ProspectiveParent {
    
    public static String ADOPTED = "Child Assigned";
    public static String WAITING = "Waiting";
    public static String REGISTERED = "Registered";
    public static String AGE_1 = "0";
    public static String AGE_2 = "1-5";
    public static String AGE_3 = "6-10";
    public static String AGE_4 = ">10";
    private String parent1;
    private String parent2;
    private int parent1Age;
    private int parent2Age;
    private String parent1SSN;
    private String parent2SSN;
    private String motherQualification;
    private String fatherQualification;
    private String accomplishments;
    private String fatherOccupation;
    private String motherOccupation;
    private double totalIncome;
    private boolean father_graduated;
    private boolean mother_graduated;
    private boolean crime;
    private boolean illness;
    private boolean carrierGenetic;
    private boolean genetic;
    private String emailId;
    private Child child;
    private String adoptionStatus;
    private String childAge;

    public boolean isCrime() {
        return crime;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public boolean isIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

    public boolean isCarrierGenetic() {
        return carrierGenetic;
    }

    public void setCarrierGenetic(boolean carrierGenetic) {
        this.carrierGenetic = carrierGenetic;
    }

    public boolean isGenetic() {
        return genetic;
    }

    public void setGenetic(boolean genetic) {
        this.genetic = genetic;
    }
    

    public boolean isFather_graduated() {
        return father_graduated;
    }

    public void setFather_graduated(boolean father_graduated) {
        this.father_graduated = father_graduated;
    }

    public boolean isMother_graduated() {
        return mother_graduated;
    }

    public void setMother_graduated(boolean mother_graduated) {
        this.mother_graduated = mother_graduated;
    }


    public String getMotherQualification() {
        return motherQualification;
    }

    public void setMotherQualification(String motherQualification) {
        this.motherQualification = motherQualification;
    }

    public String getFatherQualification() {
        return fatherQualification;
    }

    public void setFatherQualification(String fatherQualification) {
        this.fatherQualification = fatherQualification;
    }

    public String getAccomplishments() {
        return accomplishments;
    }

    public void setAccomplishments(String accomplishments) {
        this.accomplishments = accomplishments;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public String getParent1() {
        return parent1;
    }

    public void setParent1(String parent1) {
        this.parent1 = parent1;
    }

    public String getParent2() {
        return parent2;
    }

    public void setParent2(String parent2) {
        this.parent2 = parent2;
    }

    public int getParent1Age() {
        return parent1Age;
    }

    public void setParent1Age(int parent1Age) {
        this.parent1Age = parent1Age;
    }

    public int getParent2Age() {
        return parent2Age;
    }

    public void setParent2Age(int parent2Age) {
        this.parent2Age = parent2Age;
    } 
	public String getEmailId() {
        return emailId;        
    }

	public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public String getParent1SSN() {
        return parent1SSN;
    }

    public void setParent1SSN(String parent1SSN) {
        this.parent1SSN = parent1SSN;
    }

    public String getParent2SSN() {
        return parent2SSN;
    }

    public void setParent2SSN(String parent2SSN) {
        this.parent2SSN = parent2SSN;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }
    
    
    @Override
    public String toString() {
        return this.parent1;//To change body of generated methods, choose Tools | Templates.
    }
    
}
