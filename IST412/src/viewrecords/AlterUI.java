package viewrecords;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlterUI extends JFrame{
    
    private int currentSelectedRow;
    
    private final JTextField firstNameDisplayValue = new JTextField(15);
    private final JTextField lastNameDisplayValue = new JTextField(15);
    private final JTextField addressDisplayValue = new JTextField(30);
    private final JTextField birthDateDisplayValue = new JTextField(15);
    private final JTextField phoneNumberDisplayValue = new JTextField(15);
    private final JTextField emergencyDisplayValue = new JTextField(15);
    private JPanel recordPanel;
    private JPanel buttonPanel;
    
    private final ViewCntl viewCntl;
    
    public AlterUI(ViewCntl newViewCntl) {
        viewCntl = newViewCntl;
        initComponents();
        setFieldView();
    }
    
    private void initComponents() {
        setTitle("Alter Records");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        recordPanel = new JPanel(new GridLayout(8, 1));
        recordPanel.add(new JLabel("First Name"));
        recordPanel.add(firstNameDisplayValue);
        recordPanel.add(new JLabel("Last Name"));
        recordPanel.add(lastNameDisplayValue);
        recordPanel.add(new JLabel("Address"));
        recordPanel.add(addressDisplayValue);
        recordPanel.add(new JLabel("Birth Date"));
        recordPanel.add(birthDateDisplayValue);
        recordPanel.add(new JLabel("Phone Number"));
        recordPanel.add(phoneNumberDisplayValue);
        recordPanel.add(new JLabel("Emergency Contact"));
        recordPanel.add(emergencyDisplayValue);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton editButton = new JButton("Edit Record");
        editButton.addActionListener(event -> editRecord());
        buttonPanel.add(editButton);

        JButton exitButton = new JButton("Close");
        exitButton.addActionListener(event -> closeWindow());
        buttonPanel.add(exitButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(recordPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void setFieldView() {
        firstNameDisplayValue.setText(viewCntl.getRecord().getFirstName());
        lastNameDisplayValue.setText(viewCntl.getRecord().getLastName());
        addressDisplayValue.setText(viewCntl.getRecord().getAddress());
        birthDateDisplayValue.setText(viewCntl.getRecord().getBirthDate());
        phoneNumberDisplayValue.setText(viewCntl.getRecord().getPhoneNumber());
        emergencyDisplayValue.setText(viewCntl.getRecord().getEmergency());
    }
    
    
    private void editRecord() {
        String firstName = firstNameDisplayValue.getText();
        String lastName = lastNameDisplayValue.getText();
        String address = addressDisplayValue.getText();
        String birthDate = birthDateDisplayValue.getText();
        String phoneNumber = phoneNumberDisplayValue.getText();
        String emergency = emergencyDisplayValue.getText();

        viewCntl.editRecord(firstName, lastName, address, birthDate, phoneNumber, emergency);
    }
    
    private void closeWindow() {
        viewCntl.closeView();
    }
    
    void refreshDisplayWithNewValues(int index) {
        firstNameDisplayValue.setText(viewCntl.getRecord().getFirstName());
        lastNameDisplayValue.setText(viewCntl.getRecord().getLastName());
        addressDisplayValue.setText(viewCntl.getRecord().getAddress());
        birthDateDisplayValue.setText(viewCntl.getRecord().getBirthDate());
        phoneNumberDisplayValue.setText(viewCntl.getRecord().getPhoneNumber());
        emergencyDisplayValue.setText(viewCntl.getRecord().getEmergency());
    }
    
    public JTextField getFirstNameDisplayValue() {
        return firstNameDisplayValue;
    }
    
    public JTextField getLastNameDisplayValue() {
        return lastNameDisplayValue;
    }
    
    public JTextField getAddressDisplayValue() {
    return addressDisplayValue;
    }
        
    public JTextField getBirthDateDisplayValue() {
        return birthDateDisplayValue;
    }

    public JTextField getPhoneNumberDisplayValue() {
        return phoneNumberDisplayValue;
    }
    
    public JTextField getEmergencyDisplayValue() {
        return emergencyDisplayValue;
    }
}
