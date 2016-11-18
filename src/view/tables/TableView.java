package view.tables;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import model.business.StudentBusiness;
import model.pojo.Student;

public class TableView extends AbstractTableModel{
    StudentBusiness business;
    int _columnNum;
    int _rowNum;
    
    public TableView(StudentBusiness business){
      this.business = business;
      _rowNum=_rs.getRow();
      _columnNum=md.getColumnCount();
    }
    
    public Student getSelectedStudent() {
        return null;
    }
    
    @Override
    public int getRowCount() {
        return _rowNum;
        
    }

    @Override
    public int getColumnCount() {
        return _columnNum;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          try {
            _rs.absolute(rowIndex+1);
            Object o=_rs.getObject(columnIndex +1);
            return o;
        }
        catch (SQLException ex){
            return ex.toString();
        }   
    }   
}
