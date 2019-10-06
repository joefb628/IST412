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
public class Insurance {
    private int insuranceID;
    private String treatment;
    private int priceOfTreatment;
    private String customerID;

    public Insurance(int insuranceID, String treatment, int priceOfTreatment, String customerID){
        this.insuranceID = insuranceID;
        this.treatment = treatment;
        this.priceOfTreatment = priceOfTreatment;
        this.customerID = customerID;
    }
    
    public int getPriceList(String customerID, String treatment){
        return 0;
    }
    public void addTreatment(String customerID, String treatmentName, int insuranceID, int priceOfTreatment){
        
    }
    
    /**
     * @return the insuranceID
     */
    public int getInsuranceID() {
        return insuranceID;
    }

    /**
     * @param insuranceID the insuranceID to set
     */
    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
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
     * @return the priceOfTreatment
     */
    public int getPriceOfTreatment() {
        return priceOfTreatment;
    }

    /**
     * @param priceOfTreatment the priceOfTreatment to set
     */
    public void setPriceOfTreatment(int priceOfTreatment) {
        this.priceOfTreatment = priceOfTreatment;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    
}
