package viewrecords;

public final class ViewCntl {
    
    private final ViewUI viewUI;
    public Record record;
    private final int patientID = 001;
    private final String firstName = "John";
    private final String lastName = "Doe";
    private final String address = "123 Main St, State College, PA 16801";
    private final String birthDate = "10/12/84";
    private final String phoneNumber = "123-456-7890";
    private final String symptoms = "Nausea, Heartburn, Indegestion";
    private final String emergency = "098-765-4321";
    
    /**
     * This is the default constructor for the ViewCntl class.
     */
    public ViewCntl() {
        record = new Record(patientID, firstName, lastName, address, birthDate, phoneNumber, symptoms, emergency);
        viewUI = new ViewUI(this);
        viewUI.setVisible(true);
    }
    
    
    /**
     * Returns the patient record to be viewed.
     * @return A record object containing the patients information.
     */
    public Record getRecord() {
        return record;
    }
    
    public void closeApp() {
        System.exit(0);
    }
}
