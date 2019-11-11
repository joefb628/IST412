/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewtreatments;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Eric Kinner
 */
public class ViewTreatmentsView implements ActionListener
{
    int type;
    int treatment;
    PriorityQueue<String> treatments = new PriorityQueue<>();
    JButton b1;
    JButton b2;
    JButton b3;
    JButton back;
    JTextField jtf;
    JTable jt;
    int row;
    JFrame jf;
    JFrame detailView;
    DefaultTableModel tableModel;
    
    public ViewTreatmentsView(PriorityQueue<String> treatments) {
        this.treatments = treatments;
        jf = new JFrame("Patient 000001's Treatments");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel(new GridLayout(1,4));
        jt = new JTable(treatments.size(), 1){
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
            Component returnComp = super.prepareRenderer(renderer, row, column);
            Color alternateColor = Color.LIGHT_GRAY;
            Color whiteColor = Color.WHITE;
            if (!returnComp.getBackground().equals(getSelectionBackground())){
                Color bg = (row % 2 == 0 ? whiteColor : alternateColor);
                returnComp .setBackground(bg);
                bg = null;
            }
            
            return returnComp;
        }
        };        
        jtf = new JTextField(20);
        jtf.setText("Enter Treatment");
        b1 = new JButton("Add");
        b2 = new JButton("Delete");
        b3 = new JButton("Search");
        jf.setSize(700,400);
        jtf.setSize(200,50);
        b1.setSize(50,50);
        b2.setSize(50,50);
        b3.setSize(50,50);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        row = 0;
        String[] header = {"Treatments"};
        while(!treatments.isEmpty()){
            jt.setValueAt(treatments.remove(),row,0);
            row++;
        }
        for(int i = 0; i < 1; i++){
            TableColumn column1 = jt.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(header[i]);
        }
        tableModel = (DefaultTableModel) jt.getModel();
        JScrollPane sp = new JScrollPane(jt);
        jp1.add(sp);
        jp2.add(jtf);
        jp2.add(b1);
        jp2.add(b2);
        jp2.add(b3);
        jf.setContentPane(new JPanel(new BorderLayout()));
        jf.getContentPane().add(jp2, BorderLayout.SOUTH);
        jf.getContentPane().add(jp1,BorderLayout.NORTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            tableModel.addRow(new Object[]{jtf.getText()});
            tableModel.fireTableDataChanged();
        }
        if(e.getSource() == b2){
            int rowToDelete = jt.getSelectedRow();
            tableModel.removeRow(rowToDelete);
            tableModel.fireTableDataChanged();
        }
        if(e.getSource() == b3){
            for(int i = tableModel.getRowCount() - 1; i >= 0; --i){
                for(int j = tableModel.getColumnCount() - 1; j >=0; --j){
                    if(tableModel.getValueAt(i,j).equals(jtf.getText())){
                        jt.setRowSelectionInterval(i,i);
                    }
                }
            }
        }
    }

    public int getType()
    {
        return type;
    }
    
    public int selectedTreatment()
    {
        return treatment;
    }
}
