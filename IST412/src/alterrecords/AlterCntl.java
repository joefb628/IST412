package alterrecords;

public final class AlterCntl {
    
    private final AlterUI alterUI;
    
    /**
     * This is the default constructor for the AlterCntl class.
     */
    public AlterCntl() {
        alterUI = new AlterUI(this);
        loadRecord();
    }
    
    
    /**
     * Loads the patient to be viewed.
     */
    public void loadRecord() {
        
    }
}