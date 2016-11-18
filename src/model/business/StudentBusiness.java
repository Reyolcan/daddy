package model.business;

import model.pojo.Student;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnect;

public class StudentBusiness {
    DBConnect connection;
    
    public StudentBusiness() {
        connection = new DBConnect();
    }
    
    public Student createStudentFromResultSet(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        student.setRegistro(resultSet.getInt(1));
        student.setDni(resultSet.getString(2));
        student.setName(resultSet.getString(3));
        student.setSurname1(resultSet.getString(4));
        student.setSurname2(resultSet.getString(5));
        return student;
    }
    
    public Student getStudentById(String id) throws SQLException {
        String sql = "SELECT * FROM alumnos WHERE registro = " + id;
        ResultSet resultSet = connection.executeQuery(sql);
        resultSet.next();
        return createStudentFromResultSet(resultSet);
    }
    
    public ArrayList<Student> getAllStudents() throws SQLException {
        ArrayList<Student> students = new ArrayList<Student>();
        String sql = "SELECT * FROM alumnos";
        ResultSet resultSet = connection.executeQuery(sql);
        while(resultSet.next()) {
            students.add(createStudentFromResultSet(resultSet));
        }
        return students;
    }
    
    public int addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO alumnos(registro, dni, nombre, apellido1, apellido2) VALUES ('"
                + student.getRegistro() + "', '" 
                + student.getDni()+ "', '" 
                + student.getName()+ "', '" 
                + student.getSurname1()+ "', '" 
                + student.getSurname2() + "')";
        return connection.executeSQLUpdate(sql);
    }
    
    public int updateStudent(Student student) throws SQLException {
        String sql = "update alumnos set dni='" + student.getDni() + "', nombre='" + student.getName() + "', "
                    + "apellido1='" + student.getSurname1() + "', apellido2='" + student.getSurname2() + "' "
                    + "where registro=" + student.getRegistro();
        return connection.executeSQLUpdate(sql);
    }
    
    public int deleteStudent(Student student) throws SQLException {
        String sql = "delete from alumnos where registro=" + student.getRegistro();
        return connection.executeSQLUpdate(sql);
    }
    
    public int numberOfStudents() throws SQLException {
        String sql = "SELECT COUNT(*) FROM alumnos";
        ResultSet resultSet = connection.executeQuery(sql);
        resultSet.next();
        return resultSet.getInt(1);
    }
    
    public ArrayList<String> getColumns() throws SQLException {
        ArrayList<String> columns = new ArrayList<String>();
        String sql = "SELECT * FROM alumnos LIMIT 0";
        ResultSet resultSet = connection.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        for(int i = 1; i <= metaData.getColumnCount(); i++) {
            columns.add(metaData.getColumnName(i));
        }
        return columns;
    }
}
