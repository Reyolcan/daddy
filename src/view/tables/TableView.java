package view.tables;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.business.Business;
import model.business.StudentBusiness;
import model.pojo.Student;

public class TableView<Pojo> extends AbstractTableModel{
    Business business;
    ArrayList<Pojo> objects = new ArrayList<Pojo>();
    ArrayList<String> columnNames;
    int _columnNum;
    int _rowNum;
    
    public TableView(Business business){
        try {
            this.business = business;
            columnNames = business.getColumns();
            _columnNum= business.getColumns().size();
            objects = business.getAll();
            _rowNum= objects.size();
        } catch (SQLException ex) {
            Logger.getLogger(TableView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Pojo getSelectedObject(int rowIndex) {
        return objects.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return _rowNum;
        
    }

    @Override
    public String getColumnName(int column) {
        return columnNames.get(column).substring(0, 1).toUpperCase() + columnNames.get(column).substring(1, columnNames.get(column).length());
    }

    @Override
    public int getColumnCount() {
        return _columnNum;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pojo pojo = objects.get(rowIndex);
        String[] data = pojo.toString().split("#", -1);
        return data[columnIndex];
    }  
    
    public void update() {
        try {
            objects = business.getAll();
            _rowNum = objects.size();
            this.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(TableView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(String searchText) {
        try {
            objects = business.getBySearch(searchText);
            _rowNum = objects.size();
            this.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(TableView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
