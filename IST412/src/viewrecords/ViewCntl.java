package viewrecords;

public final class ViewCntl {
    
    private final ViewList viewList;
    private ViewTableModel viewTableModel;
    private ViewUI viewUI;
    private final AlterUI alterUI;
    
    /**
     * This is the default constructor for the ViewCntl class.
     */
    public ViewCntl() {
        viewList = new ViewList();
        viewTableModel = new ViewTableModel(viewList.getRecordList());
        viewUI = new ViewUI(this);
        viewUI.setVisible(true);
        alterUI = new AlterUI(this);
        alterUI.setVisible(false);
    }
    
     /**
     * Returns the patient record to be viewed.
     * @return A record object containing the patients information.
     */
    public Record getRecord() {
        Record record = viewList.getRecordList().get(0);
        String[] recordString = {Integer.toString(record.getPatientID()), record.getFirstName(), record.getLastName(), record.getAddress(), record.getBirthDate(), record.getPhoneNumber(), record.getSymptoms(), record.getEmergency()};
        return new Record(recordString);
    }
    
    public void editRecord(String firstName, String lastName, String address, String birthDate, String phoneNumber, String emergency) {
        viewList.getRecordList().get(0).setFirstName(firstName);
        viewList.getRecordList().get(0).setLastName(lastName);
        viewList.getRecordList().get(0).setAddress(address);
        viewList.getRecordList().get(0).setBirthDate(birthDate);
        viewList.getRecordList().get(0).setPhoneNumber(phoneNumber);
        viewList.getRecordList().get(0).setEmergency(emergency);
        alterUI.setVisible(false);
        viewTableModel = new ViewTableModel(viewList.getRecordList());
        viewUI = new ViewUI(this);
        viewUI.setVisible(true);
    }
    
    public ViewTableModel getViewTableModel() {
        return viewTableModel;
    }
    
    public void openAlterRecord() {
        alterUI.setVisible(true);
        viewUI.setVisible(false);
    }
    
    public void closeView() {
        viewUI.setVisible(false);
        alterUI.setVisible(false);
    }
}
