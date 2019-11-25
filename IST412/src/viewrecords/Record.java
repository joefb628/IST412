package viewrecords;

public class Record {
    
    private Patient patient;
    
    /**
     * This is the default constructor for the Record class.
     * @param patientID
     * @param firstName
     * @param lastName
     * @param birthdate
     */
    public Record(int patientID, String firstName, String lastName, String birthdate) {
        this.patient = new Patient(patientID, firstName, lastName, birthdate);
    }
    
    /**
     * Returns the patient ID from the record.
     * @return An int representing the patient ID from the record.
     */
    public int getPatientID() {
        return patient.getPatientID();
    }
    
    /**
     * Returns the first name from the record.
     * @return A string representing the first name from the record.
     */
    public String getFirstName() {
        return patient.getFirstName();
    }
    
     /**
     * Returns the last name from the record.
     * @return A string representing the last name from the record.
     */
    public String getLastName() {
        return patient.getLastName();
    }

    public void setPatient(int patientID, String firstName, String lastName, String birthdate) {
        this.patient = new Patient(patientID, firstName, lastName, birthdate);
    }

    public void editRecord(int patientID, String firstName, String lastName, String birthdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
