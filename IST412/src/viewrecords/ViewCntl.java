package viewrecords;

public final class ViewCntl {
    
    private final ViewUI viewUI;
    
    /**
     * This is the default constructor for the ViewCntl class.
     */
    public ViewCntl() {
        viewUI = new ViewUI(this);
        loadRecord();
    }
    
    
    /**
     * Loads the patient to be viewed.
     */
    public void loadRecord() {
        
    }
}
