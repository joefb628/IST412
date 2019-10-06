package viewrecords;

public class Record {
    
    private int patientID;
    private String firstName;
    private String lastName;
    
    /**
     * This is the default constructor for the Record class.
     * @param ID
     * @param fName
     * @param lName
     */
    public Record(int ID, String fName, String lName) {
        ID = patientID;
        fName = firstName;
        lName = lastName;
    }
    
    /**
     * Returns the patient ID from the record.
     * @return An int representing the patient ID from the record.
     */
    public int getPatientID() {
        return patientID;
    }
    
    /**
     * Returns the first name from the record.
     * @return A string representing the first name from the record.
     */
    public String getFirstName() {
        return firstName;
    }
    
     /**
     * Returns the last name from the record.
     * @return A string representing the last name from the record.
     */
    public String getLastName() {
        return lastName;
    }
    
}
