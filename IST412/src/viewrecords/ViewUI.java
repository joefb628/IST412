package viewrecords;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewUI extends JFrame{
    
    private final ViewCntl viewCntl;
    
    private JPanel tablePanel;
    private JPanel buttonPanel;
    
    private JTable recordTable;
    
    private JButton alterButton;
    private JButton doneButton;
    
    private JScrollPane tableScroller;
    
    public ViewUI(ViewCntl viewCntl) {
        this.viewCntl = viewCntl;
        initComponents();
    }
    
    private void initComponents() {
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,12));
        recordTable = new JTable(viewCntl.getViewTableModel());
        recordTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        recordTable.getColumnModel().getColumn(1).setPreferredWidth(25);
        recordTable.getColumnModel().getColumn(2).setPreferredWidth(25);
        recordTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        recordTable.getColumnModel().getColumn(4).setPreferredWidth(25);
        recordTable.getColumnModel().getColumn(5).setPreferredWidth(25);
        recordTable.getColumnModel().getColumn(6).setPreferredWidth(50);
        recordTable.getColumnModel().getColumn(7).setPreferredWidth(25);
        
        alterButton = new JButton("Alter Record");
        alterButton.addActionListener(new AlterButtonListener());
        doneButton = new JButton("Exit");
        doneButton.addActionListener(new DoneButtonListener());
        buttonPanel.add(alterButton);
        buttonPanel.add(doneButton);
        
        tableScroller = new JScrollPane(recordTable);
        recordTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(1600,300));
        tablePanel.add(tableScroller);
        this.setSize(1700, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }
    
    public class AlterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            viewCntl.openAlterRecord();
        }
    }
    
    public class DoneButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            viewCntl.closeView();
        }
    }
    
}
