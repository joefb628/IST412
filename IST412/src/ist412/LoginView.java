/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author golds
 */
public class LoginView extends JFrame implements ActionListener{
    
    private JPanel loginMessage;
    private JPanel usernamePanel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JPanel buttonPanel;
    private JButton loginButton;
    private JTextField errorField;
    
    private final LoginCntl loginCntl;
    
    public LoginView(LoginCntl loginCntl) {
        this.loginCntl = loginCntl;
        initComponents();
    }
    
    private void initComponents(){
        setTitle("AlphaCare Login");
        setSize(1200,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        loginMessage = new JPanel(new GridLayout(1,1));
        loginMessage.add(new JLabel("<html><font size='8'>Please Type in Your Username And Password</font></html>",JLabel.CENTER));
        
        usernamePanel = new JPanel(new GridLayout(1,1));
        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(10,10));
        usernamePanel.add(new JLabel("<html><font size='8'>Username</font></html>",JLabel.CENTER));
        usernamePanel.add(usernameField);
        
        passwordField = new JTextField();
        passwordField.setPreferredSize(new Dimension(10,10));
        usernamePanel.add(new JLabel("<html><font size='8'>Password</font></html>",JLabel.CENTER));
        usernamePanel.add(passwordField);
        
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButton = new JButton("<html><font size='8'>Login</font></html>");
        loginButton.addActionListener(this);
        errorField = new JTextField();
        errorField.setPreferredSize(new Dimension(100,30));
        buttonPanel.add(errorField);
        buttonPanel.add(loginButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(loginMessage, BorderLayout.NORTH);
        getContentPane().add(usernamePanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
    }
    public void actionPerformed(ActionEvent e){
        boolean verify = loginCntl.verifiyUser(usernameField.getText(), passwordField.getText());
        if(!verify){
            errorField.setText("Failed to Log in");
        }
    }
}
