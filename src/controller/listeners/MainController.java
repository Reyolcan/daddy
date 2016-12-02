package controller.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainFrame;

public class MainController implements ActionListener {
    private MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame(this);
        setListeners();
        mainFrame.setVisible(true);
    }
    
    public void setListeners() {
        mainFrame.getStudentButton().addActionListener(this);
        mainFrame.getBookButton().addActionListener(this);
        mainFrame.getReportButton().addActionListener(this);
        mainFrame.getMovementButton().addActionListener(this);
        mainFrame.getExitButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mainFrame.getStudentButton()) {
            new StudentController(mainFrame, false);
        }
        if(e.getSource() == mainFrame.getBookButton()) {
            
        }
        if(e.getSource() == mainFrame.getReportButton()) {
            
        }
        if(e.getSource() == mainFrame.getMovementButton()) {
            
        }
        if(e.getSource() == mainFrame.getExitButton()) {
            System.exit(0);
        }
    }
}
