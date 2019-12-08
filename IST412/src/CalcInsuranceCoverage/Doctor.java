/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcInsuranceCoverage;

/**
 *
 * @author Bryan
 */
public class Doctor {
    private int doctorID;
    private String patientID;
    private String insuranceID;
    private String treatment;
    
    //constructor for doctor model class
    public Doctor(){
        
    }
    public Doctor(int doctorID, String patientID, String insuranceID, String treatment){
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.insuranceID = insuranceID;
        this.treatment = treatment;
        
    }

    public int calculatePriceOfTreatment(String patientID, String treatment, String insuranceID){
        return 0;
    }
    
    /**
     * @return the doctorID
     */
    public int getDoctorID() {
        return doctorID;
    }

    /**
     * @param doctorID the doctorID to set
     */
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * @return the treatment
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * @param treatment the treatment to set
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * @return the insuranceID
     */
    public String getInsuranceID() {
        return insuranceID;
    }

    /**
     * @param insuranceID the insuranceID to set
     */
    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }
    
}
