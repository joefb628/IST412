package viewrecords;

public class Record {
    
    private int patientID;
    private String firstName;
    private String lastName;
    private String address;
    private String birthDate;
    private String phoneNumber;
    private String symptoms;
    private String emergency;
    
    /**
     * This is the default constructor for the Record class.
     * @param recordInfo
     */
    public Record(String[] recordInfo) {
        patientID = Integer.parseInt(recordInfo[0]);
        firstName = recordInfo[1];
        lastName = recordInfo[2];
        address = recordInfo[3];
        birthDate = recordInfo[4];
        phoneNumber = recordInfo[5];
        symptoms = recordInfo[6];
        emergency = recordInfo[7];
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
    
         /**
     * Returns the address from the record.
     * @return A string representing the address from the record.
     */
    public String getAddress() {
        return address;
    }
    
         /**
     * Returns the birth date from the record.
     * @return A string representing the birth date from the record.
     */
    public String getBirthDate() {
        return birthDate;
    }
    
         /**
     * Returns the phone number from the record.
     * @return A string representing the phone number from the record.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
         /**
     * Returns the symptoms from the record.
     * @return A string representing the symptoms from the record.
     */
    public String getSymptoms() {
        return symptoms;
    }
    
    /**
     * Returns the emergency contact from the record.
     * @return A string representing the emergency contact from the record.
     */
    public String getEmergency() {
        return emergency;
    }
    
    /**
     * Edits the patient ID record.
     * @param newPatientID Sets the patient ID for the record.
     */
    public void setPatientID(int newPatientID) {
        this.patientID = newPatientID;
    }
   
    /**
     * Edits the first name record.
     * @param newFirstName Sets the first name for the record.
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    
    /**
     * Edits the last name record.
     * @param newLastName Sets the last name for the record.
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    /**
     * Edits the address record.
     * @param newAddress Sets the address for the record.
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    
    /**
     * Edits the birth date record.
     * @param newBirthDate Sets the birth date for the record.
     */
    public void setBirthDate(String newBirthDate) {
        this.birthDate = newBirthDate;
    }
    
    /**
     * Edits the phone number record.
     * @param newPhoneNumber Sets the phone number for the record.
     */
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    
    /**
     * Edits the symptoms record.
     * @param newSymptoms Sets the symptoms for the record.
     */
    public void setSymptoms(String newSymptoms) {
        this.symptoms = newSymptoms;
    }
    
    /**
     * Edits the emergency record.
     * @param newEmergency Sets the emergency for the record.
     */
    public void setEmergency(String newEmergency) {
        this.emergency = newEmergency;
    }
}