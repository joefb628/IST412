package ist412;

import CalcInsuranceCoverage.DoctorCntl;
import viewtreatments.ViewTreatmentsCntl;
import viewrecords.ViewCntl;

public class MainMenuCntl {
    
    private ViewTreatmentsCntl viewTreatmentsCntl;
    private ViewCntl viewRecordCntl;
    private DoctorCntl doctorCntl;
    private final MainMenuView mainMenuView;
    
    public MainMenuCntl(String username) {
        mainMenuView = new MainMenuView(this, username);
        mainMenuView.setVisible(true);
    }
    
    public void openViewTreatmentsCntl() {
        viewTreatmentsCntl = new ViewTreatmentsCntl();
    }
    
    public void openViewRecordCntl() {
        viewRecordCntl = new ViewCntl();
    }
    
    public void openAlterRecord() {
    viewRecordCntl = new ViewCntl();
    viewRecordCntl.openAlterRecord();
    }
    
    public void openCalcInsuranceCoverageCntl(){
        doctorCntl = new DoctorCntl();
    }
    
    public void closeApp() {
        System.exit(0);
    }
}