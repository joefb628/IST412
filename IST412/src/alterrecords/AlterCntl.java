package alterrecords;

import viewrecords.Record;

public final class AlterCntl {
    
    private final AlterUI alterUI;
    private final Record record;
    private final int patientID = 001;
    private final String firstName = "John";
    private final String lastName = "Doe";
    private final int patientID2 = 002;
    private final String firstName2 = "Steve";
    private final String lastName2 = "Adams";
    private final String birthdate = "11/21/1999";
    private final String birthdate2 = "12/12/1996";
    
    
    /**
     * This is the default constructor for the AlterCntl class.
     */
    public AlterCntl() {
        alterUI = new AlterUI(this);
        record = new Record(patientID, firstName, lastName, birthdate);
        System.out.println(loadRecord(record));
        record.editRecord(patientID2, firstName2, lastName2, birthdate2);
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
    
    /**
     * Edits the patient record.
     */
    
    public void editRecord(int ID, String fName, String lName, String birthdate) {
        record.setPatient(ID, fName, lName, birthdate);
    }
}