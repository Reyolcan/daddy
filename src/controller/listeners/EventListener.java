package controller.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTable;
import model.pojo.Student;
import model.business.StudentBusiness;
import view.MainFrame;

public class EventListener implements ActionListener, MouseListener {

    private MainFrame mainFrame;

    public EventListener() {
        mainFrame = new MainFrame(this);
        mainFrame.setVisible(true);
    }

    public Student getStudentInput() {
        Student student = new Student();
        student.setRegistro(Integer.parseInt(mainFrame.getRegisterTextField().getText()));
        student.setDni(mainFrame.getDniTextField().getText());
        student.setName(mainFrame.getNameTextField().getText());
        student.setSurname1(mainFrame.getSurname1TextField().getText());
        student.setSurname2(mainFrame.getSurname2TextField().getText());
        return student;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("dismiss")) {
            dismiss(e);
        }
        if (e.getActionCommand().equals("join")) {
            join(e);
        }
        if (e.getActionCommand().equals("update")) {
            update(e);
        }
        if (e.getActionCommand().equals("exit")) {
            System.exit(EXIT_ON_CLOSE);
        }
    }
    
    public void dismiss(ActionEvent e) {
        JTable table = mainFrame.getStudentTable();
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = new Student();
        student.setRegistro(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
        try {
            mainFrame.showMessage(studentBusiness.deleteStudent(student));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainFrame.updateTable();
    }
    
    public void join(ActionEvent e) {
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = getStudentInput();
        try {
            mainFrame.showMessage(studentBusiness.addStudent(student));
        } catch (SQLException ex) {
            Logger.getLogger(EventListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainFrame.updateTable();
    }
    
    public void update(ActionEvent e) {
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = getStudentInput();
        try {
            mainFrame.showMessage(studentBusiness.updateStudent(student));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainFrame.updateTable();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JTable table = mainFrame.getStudentTable();
        int fila = table.getSelectedRow();
        mainFrame.getRegisterTextField().setText(String.valueOf(table.getValueAt(fila, 0)));
        mainFrame.getDniTextField().setText(String.valueOf(table.getValueAt(fila, 1)));
        mainFrame.getNameTextField().setText(String.valueOf(table.getValueAt(fila, 2)));
        mainFrame.getSurname1TextField().setText(String.valueOf(table.getValueAt(fila, 3)));
        mainFrame.getSurname2TextField().setText(String.valueOf(table.getValueAt(fila, 4)));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
