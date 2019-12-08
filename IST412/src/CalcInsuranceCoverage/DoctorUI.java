/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcInsuranceCoverage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Bryan
 */
public class DoctorUI implements ActionListener{
    JFrame jf;
    JList insuranceList;
    JButton calcCostButton;
    JTextField costField;
    
    public DoctorUI(){
        jf = new JFrame("Calculate Insurance Coverage");
        jf.setLayout(new FlowLayout());
        jf.setLocationRelativeTo(null);
        jf.setSize(400,200);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        costField = new JTextField("Calculated Costs Appear Here");
        jf.add(costField);
        String[] ar = {"Cigna","United","Blue Cross"};
        insuranceList = new JList(ar);
        jf.add(insuranceList);
        calcCostButton = new JButton("Calculate Cost");
        calcCostButton.setSize(50,50);
        jf.add(calcCostButton);
        calcCostButton.addActionListener(this);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String val = (String)insuranceList.getSelectedValue();
        if(val.equals("Cigna")){
            double d = Math.random()*((1000-800)+1)+800;
            String s = Double.valueOf(Math.floor(d*100)/100).toString();
            costField.setText("$"+s);
        }else if(val.equals("United")){
            double d = Math.random()*((1200-1000)+1)+1000;
            String s = Double.valueOf(Math.floor(d*100)/100).toString();
            costField.setText("$"+s);
        }else if(val.equals("Blue Cross")){
            double d = Math.random()*((900-600)+1)+600;
            String s = Double.valueOf(Math.floor(d*100)/100).toString();
            costField.setText("$"+s);
        }else{
            System.out.println("error");
        }
    }
}
