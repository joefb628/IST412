package viewrecords;

import java.util.ArrayList;

public class ViewList {
    
    private final ArrayList<Record> recordList;
    
    public ViewList() {
        recordList = new ArrayList<>();
        addRanksToList();
    }
    
    private void addRanksToList() {
        String[] records = new String[8];
        records[0] = "001";
        records[1] = "John";
        records[2] = "Doe";
        records[3] = "123 Main St, State College, PA 16801";
        records[4] = "10/12/84";
        records[5] = "123-456-7890";
        records[6] = "Nausea, Heartburn, Indegestion";
        records[7] = "098-765-4321";

        getRecordList().add(new Record(records));
    }
    
    public ArrayList<Record> getRecordList() {
        return recordList;
    }
    
}

