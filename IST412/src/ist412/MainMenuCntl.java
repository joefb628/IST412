package ist412;

import viewtreatments.ViewTreatmentsCntl;

public class MainMenuCntl {
    
    private ViewTreatmentsCntl viewTreatmentsCntl;
    private final MainMenuView mainMenuView;
    
    public MainMenuCntl() {
        mainMenuView = new MainMenuView(this);
        mainMenuView.setVisible(true);
    }
    
    public void openViewTreatmentsCntl() {
        viewTreatmentsCntl = new ViewTreatmentsCntl();
    }
    
    public void closeApp() {
        System.exit(0);
    }
}
