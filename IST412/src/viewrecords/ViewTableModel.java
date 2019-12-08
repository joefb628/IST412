package viewrecords;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ViewTableModel extends AbstractTableModel {
    
    private final String[] columnNames = {"Patient ID", "First Name", "Last Name", "Address", "Birth Date", "Phone Number", "Symptoms", "Emergency Contact"};
    private final ArrayList<Record> recordList;
    
    public ViewTableModel(ArrayList<Record> newRecordList) {
        recordList = newRecordList;
        
    }
    
    @Override
    public int getRowCount() {
        return recordList.size();
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        switch(col) {
            case 0: return (Object) recordList.get(row).getPatientID();
            case 1: return (Object) recordList.get(row).getFirstName();
            case 2: return (Object) recordList.get(row).getLastName();
            case 3: return (Object) recordList.get(row).getAddress();
            case 4: return (Object) recordList.get(row).getBirthDate();
            case 5: return (Object) recordList.get(row).getPhoneNumber();
            case 6: return (Object) recordList.get(row).getSymptoms();
            case 7: return (Object) recordList.get(row).getEmergency();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public int getColumnCount() {
        return 8;
    }
}