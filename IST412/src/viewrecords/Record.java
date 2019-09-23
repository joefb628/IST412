package viewrecords;

public class Record {
    
    private int patientID;
    private String firstName;
    private String lastName;
    
    /**
     * This is the default constructor for the Record class.
     */
    public Record() {
        
    }
    
    /**
     * Returns the patient ID from the record.
     * @return An int representing the patient ID from the record.
     */
    public int getPatientID() {
        return 101;
    }
    
    /**
     * Returns the first name from the record.
     * @return A string representing the first name from the record.
     */
    public String getFirstName() {
        String fName = "John";
        return fName;
    }
    
     /**
     * Returns the last name from the record.
     * @return A string representing the last name from the record.
     */
    public String getLastName() {
        String lName = "Doe";
        return lName;
    }
    
}
