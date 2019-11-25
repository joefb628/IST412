package viewrecords;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewUI extends JFrame{
    
    private JPanel headerPanel;
    private JPanel recordPanel;
    private JPanel exitPanel;
    
    private Record record;
    
    private final ViewCntl viewCntl;
    
    public ViewUI(ViewCntl viewCntl) {
        this.viewCntl = viewCntl;
        record = viewCntl.getRecord();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Here is Your Medical Record");
        setSize(1500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton idHeaderButton = new JButton("<html><font size='3'>Patient ID</font></html>");
        idHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(idHeaderButton);
        
        JButton firstHeaderButton = new JButton("<html><font size='3'>First Name</font></html>");
        firstHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(firstHeaderButton);
        
        JButton lastHeaderButton = new JButton("<html><font size='3'>Last Name</font></html>");
        lastHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(lastHeaderButton);
        
        JButton addressHeaderButton = new JButton("<html><font size='3'>Address</font></html>");
        addressHeaderButton.setPreferredSize(new Dimension(250, 50));
        headerPanel.add(addressHeaderButton);
        
        JButton birthHeaderButton = new JButton("<html><font size='3'>Birth Date</font></html>");
        birthHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(birthHeaderButton);
        
        JButton phoneHeaderButton = new JButton("<html><font size='3'>Phone Number</font></html>");
        phoneHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(phoneHeaderButton);
        
        JButton symptomsHeaderButton = new JButton("<html><font size='3'>Known Symptoms</font></html>");
        symptomsHeaderButton.setPreferredSize(new Dimension(250, 50));
        headerPanel.add(symptomsHeaderButton);
        
        JButton emergencyHeaderButton = new JButton("<html><font size='3'>Emergency Contact</font></html>");
        emergencyHeaderButton.setPreferredSize(new Dimension(150, 50));
        headerPanel.add(emergencyHeaderButton);
        
        recordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        String id = Integer.toString(record.getPatientID());
        JButton idButton = new JButton("001");
        idButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(idButton);
        
        String firstName = record.getFirstName();
        JButton firstButton = new JButton("John");
        firstButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(firstButton);
        
        String lastName = viewCntl.getRecord().getLastName();
        JButton lastButton = new JButton("Doe");
        lastButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(lastButton);

        String address = viewCntl.getRecord().getAddress();        
        JButton addressButton = new JButton("123 Main St, State College, PA 16801");
        addressButton.setPreferredSize(new Dimension(250, 50));
        recordPanel.add(addressButton);

        String birthDate = viewCntl.getRecord().getBirthDate();        
        JButton birthButton = new JButton("10/12/84");
        birthButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(birthButton);

        String phoneNumber = viewCntl.getRecord().getPhoneNumber();
        JButton phoneButton = new JButton("123-456-7890");
        phoneButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(phoneButton);
        
        String symptoms = viewCntl.getRecord().getSymptoms();
        JButton symptomsButton = new JButton("Nausea, Heartburn, Indegestion");
        symptomsButton.setPreferredSize(new Dimension(250, 50));
        recordPanel.add(symptomsButton);
        
        String emergency = viewCntl.getRecord().getEmergency();
        JButton emergencyButton = new JButton("098-765-4321");
        emergencyButton.setPreferredSize(new Dimension(150, 50));
        recordPanel.add(emergencyButton);        
        
        exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton closeButton = new JButton("<html><font size='4'>Exit</font></html>");
        closeButton.addActionListener(event -> viewCntl.closeApp());
        closeButton.setPreferredSize(new Dimension(100, 25));
        exitPanel.add(closeButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(headerPanel, BorderLayout.NORTH);
        getContentPane().add(recordPanel, BorderLayout.CENTER);
        getContentPane().add(exitPanel, BorderLayout.SOUTH);
        
    }
    
}

