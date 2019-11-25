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
     * @param ID
     * @param fName
     * @param lName
     */
    public Record(int ID, String fName, String lName, String add, String birth, String phone, String sym, String emer) {
        ID = patientID;
        fName = firstName;
        lName = lastName;
        add = address;
        birth = birthDate;
        phone = phoneNumber;
        sym = symptoms;
        emer = emergency;
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
    
}
