package ist412;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuView extends JFrame{
    
    private JPanel welcomePanel;
    private JPanel namePanel;
    private JPanel buttonPanel;
    
    private final MainMenuCntl mainMenuCntl;
    
    public MainMenuView(MainMenuCntl mainMenuCntl, String username) {
        this.mainMenuCntl = mainMenuCntl;
        initComponents(username);
    }
    
    private void initComponents(String username) {
        setTitle("AlphaCare");
        setSize(1200, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        welcomePanel = new JPanel(new GridLayout(1, 1));
        welcomePanel.add(new JLabel("<html><font size='4'>Welcome, "+ username + "</font></html>", JLabel.RIGHT));
        
        namePanel = new JPanel(new GridLayout(1, 1));
        namePanel.add(new JLabel("<html><font size='8'>AlphaCare</font></html>", JLabel.CENTER));
        
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton viewRecordsButton = new JButton("<html><font size='4'>View Medical Records</font></html>");
        viewRecordsButton.addActionListener(event -> mainMenuCntl.openViewRecordCntl());
        viewRecordsButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(viewRecordsButton);
        /*
        JButton alterRecordsButton = new JButton("<html><font size='4'>Alter Medical Records (WIP)</font></html>");
        //alterRecordsButton.addActionListener(event -> mainMenuCntl.openAlterRecordsCntl());
        alterRecordsButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(alterRecordsButton);
                */
        
        JButton viewTreatmentsButton = new JButton("<html><font size='4'>View Treatments</font></html>");
        viewTreatmentsButton.addActionListener(event -> mainMenuCntl.openViewTreatmentsCntl());
        viewTreatmentsButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(viewTreatmentsButton);
        /*
        JButton scheduleTreatmentsButton = new JButton("<html><font size='4'>Schedule Treatments (WIP)</font></html>");
        //scheduleTreatmentsButton.addActionListener(event -> mainMenuCntl.openScheduleTreatmentsCntl());
        scheduleTreatmentsButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(scheduleTreatmentsButton);
        */
        JButton calcInsuranceCoverageButton = new JButton("<html><font size='4'>Calculate Insurance Coverage (WIP)</font></html>");
        calcInsuranceCoverageButton.addActionListener(event -> mainMenuCntl.openCalcInsuranceCoverageCntl());
        calcInsuranceCoverageButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(calcInsuranceCoverageButton);
        
        JButton closeButton = new JButton("<html><font size='4'>Exit</font></html>");
        closeButton.addActionListener(event -> mainMenuCntl.closeApp());
        closeButton.setPreferredSize(new Dimension(150, 75));
        buttonPanel.add(closeButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(welcomePanel, BorderLayout.NORTH);
        getContentPane().add(namePanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
    }
    
}
