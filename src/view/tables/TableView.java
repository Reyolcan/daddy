package view.tables;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.business.StudentBusiness;
import model.pojo.Student;

public class TableView extends AbstractTableModel{
    StudentBusiness business;
    ArrayList<Student> students = new ArrayList<Student>();
    int _columnNum;
    int _rowNum;
    
    public TableView(StudentBusiness business){
        try {
            this.business = business;
            _rowNum= business.numberOfStudents();
            _columnNum= business.getColumns().size();
            students = business.getAllStudents();
        } catch (SQLException ex) {
            Logger.getLogger(TableView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Student getSelectedStudent(int rowIndex) {
        /*Student student = new Student();
        try {
            student = business.getStudentById(getValueAt(rowIndex, 0).toString());
        } catch (SQLException ex) {
            Logger.getLogger(TableView.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return students.get(rowIndex);
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
        Student student = students.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return student.getRegistro();
            case 1:
                return student.getDni();
            case 2:
                return student.getName();
            case 3:
                return student.getSurname1();
            case 4:
                return student.getSurname2();
        }
        return null;
    }   
}
