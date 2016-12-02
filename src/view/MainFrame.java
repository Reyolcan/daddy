package view;

import controller.listeners.MainController;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {                     
    private javax.swing.JButton studentButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton movementButton;
    public javax.swing.JButton exitButton;

    public MainFrame(MainController controller) {
        initComponents();
    }
                    
    private void initComponents() {

        studentButton = new javax.swing.JButton();
        movementButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Biblioteca");
        setIconImages(null);
        setResizable(false);

        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios.icon.png"))); // NOI18N
        studentButton.setText("Alumnos");
        studentButton.setName("btnAlumno"); // NOI18N

        movementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamos.icon.png"))); // NOI18N
        movementButton.setText("Movimientos");

        bookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libros.icon.png"))); // NOI18N
        bookButton.setText("Libros");

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informes.icon.png"))); // NOI18N
        reportButton.setText("Informes");

        exitButton.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(bookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }                       

    public JButton getStudentButton() {
        return studentButton;
    }

    public JButton getReportButton() {
        return reportButton;
    }

    public JButton getBookButton() {
        return bookButton;
    }

    public JButton getMovementButton() {
        return movementButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }                 
}
