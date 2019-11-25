/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewrecords;

/**
 *
 * @author Chris
 */
public class Patient {
    private int PatientID;
    private String firstName;
    private String lastName;
    private String birthdate;

    public Patient(int PatientID, String firstName, String lastName, String birthdate) {
        this.PatientID = PatientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    
    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    
    
}
