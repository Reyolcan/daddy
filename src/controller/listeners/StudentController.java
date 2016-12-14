package controller.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import model.pojo.Student;
import model.business.StudentBusiness;
import view.StudentDialog;
import view.tables.TableView;

public class StudentController implements ActionListener, MouseListener, DocumentListener {

    private StudentDialog mainDialog;
    private Timer searchTimer;

    public StudentController(JFrame parent, boolean selectMode) {
        mainDialog = new StudentDialog(parent);
        setListeners();
        setSearchTimer();
        if(selectMode) {
            mainDialog.getSelectButton().setEnabled(true);
        }
        else {
            mainDialog.getJoinButton().setEnabled(true);
            mainDialog.getDismissButton().setEnabled(true);
            mainDialog.getUpdateButton().setEnabled(true);
        }
        mainDialog.setVisible(true);
    }
    private void setListeners() {
        mainDialog.getJoinButton().addActionListener(this);
        mainDialog.getDismissButton().addActionListener(this);
        mainDialog.getUpdateButton().addActionListener(this);
        mainDialog.getExitButton().addActionListener(this);
        mainDialog.getStudentTable().addMouseListener(this);
        mainDialog.getSearchText().getDocument().addDocumentListener(this);
    }
    
    public void setSearchTimer() {
        searchTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableView model = (TableView) mainDialog.getStudentTable().getModel();
                if(mainDialog.getSearchText().getText().length() > 0) {
                    model.search(mainDialog.getSearchText().getText());
                }
                else {
                    model.update();
                }
                searchTimer.stop();
            }
        });
    }
    
    public Student getStudentInput() {
        Student student = new Student();
        student.setRegistro(Integer.parseInt(mainDialog.getRegisterTextField().getText()));
        student.setDni(mainDialog.getDniTextField().getText());
        student.setName(mainDialog.getNameTextField().getText());
        student.setSurname1(mainDialog.getSurname1TextField().getText());
        student.setSurname2(mainDialog.getSurname2TextField().getText());
        return student;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainDialog.getDismissButton()) {
            dismiss(e);
        }
        if (e.getSource() == mainDialog.getJoinButton()) {
            join(e);
        }
        if (e.getSource() == mainDialog.getUpdateButton()) {
            update(e);
        }
        if (e.getSource() == mainDialog.getExitButton()) {
            mainDialog.dispose();
        }
    }
    
    public void dismiss(ActionEvent e) {
        JTable table = mainDialog.getStudentTable();
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = new Student();
        student.setRegistro(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
        try {
            mainDialog.showMessage(studentBusiness.delete(student));
        } catch (SQLException ex) {
            Logger.getLogger(StudentDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainDialog.updateTable();
    }
    
    public void join(ActionEvent e) {
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = getStudentInput();
        try {
            mainDialog.showMessage(studentBusiness.add(student));
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainDialog.updateTable();
    }
    
    public void update(ActionEvent e) {
        StudentBusiness studentBusiness = new StudentBusiness();
        Student student = getStudentInput();
        try {
            mainDialog.showMessage(studentBusiness.update(student));
        } catch (SQLException ex) {
            Logger.getLogger(StudentDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainDialog.updateTable();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JTable table = mainDialog.getStudentTable();
        int fila = table.getSelectedRow();
        mainDialog.getRegisterTextField().setText(String.valueOf(table.getValueAt(fila, 0)));
        mainDialog.getDniTextField().setText(String.valueOf(table.getValueAt(fila, 1)));
        mainDialog.getNameTextField().setText(String.valueOf(table.getValueAt(fila, 2)));
        mainDialog.getSurname1TextField().setText(String.valueOf(table.getValueAt(fila, 3)));
        mainDialog.getSurname2TextField().setText(String.valueOf(table.getValueAt(fila, 4)));
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

    @Override
    public void insertUpdate(DocumentEvent e) {
        searchTimer.restart();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        searchTimer.restart();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        searchTimer.restart();
    }
}
