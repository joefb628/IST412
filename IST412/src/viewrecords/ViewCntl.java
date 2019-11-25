package viewrecords;

public final class ViewCntl {
    
    private final ViewUI viewUI;
    private final Record record;
    private final int patientID = 001;
    private final String firstName = "John";
    private final String lastName = "Doe";
    private final String birthdate = "10/20/1998";
    
    /**
     * This is the default constructor for the ViewCntl class.
     */
    public ViewCntl() {
        viewUI = new ViewUI(this);
        record = new Record(patientID, firstName, lastName, birthdate);
        System.out.println(loadRecord(record));
    }
    
    
    /**
     * Loads the patient to be viewed.
     * @param pRecord
     * @return 
     */
    public String loadRecord(Record pRecord) {
        int ID = pRecord.getPatientID();
        String fName = pRecord.getFirstName();
        String lName = pRecord.getLastName();
        String patient = "ID: " + ID + " / First Name: " + fName + " / Last Name: " + lName;
        return patient;
    }
}
