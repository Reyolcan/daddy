/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author jjrodmar
 */
public class BorrowWindow extends javax.swing.JDialog {

    /**
     * Creates new form DlgMovimientos
     */
  
    
    
    
    @SuppressWarnings("LeakingThisInConstructor")
    public BorrowWindow(java.awt.Frame parent) {
       
        super(parent, true);
      
        initComponents();
        this.setLocationRelativeTo(this);
                
    
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aluPanel = new javax.swing.JPanel();
        regLabel = new javax.swing.JLabel();
        registerTextField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        nomLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ap1Label = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        ap2Label = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        movPanel = new javax.swing.JPanel();
        movScrollPane = new javax.swing.JScrollPane();
        movementsTable = new javax.swing.JTable();
        newMovementButton = new javax.swing.JButton();
        btnBajasMovi = new javax.swing.JButton();
        btnEditarMovi = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        aluPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumno"));

        regLabel.setText("Registro");

        registerTextField.setEditable(false);

        dniLabel.setText("Dni");

        dniTextField.setEditable(false);

        nomLabel.setText("Nombre");

        nameTextField.setEditable(false);
        nameTextField.setToolTipText("");

        ap1Label.setText("Apellido1");

        txtApellido2.setEditable(false);

        ap2Label.setText("Apellido2");

        txtApellido1.setEditable(false);

        searchButton.setText("Buscar");

        javax.swing.GroupLayout aluPanelLayout = new javax.swing.GroupLayout(aluPanel);
        aluPanel.setLayout(aluPanelLayout);
        aluPanelLayout.setHorizontalGroup(
            aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(aluPanelLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(regLabel)
                                .addComponent(nomLabel)))
                        .addComponent(ap1Label))
                    .addComponent(ap2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, aluPanelLayout.createSequentialGroup()
                        .addComponent(registerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(searchButton)
                .addContainerGap())
        );
        aluPanelLayout.setVerticalGroup(
            aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluPanelLayout.createSequentialGroup()
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regLabel)
                        .addComponent(registerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dniLabel)
                        .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ap1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ap2Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        movPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestamos"));

        movementsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        movScrollPane.setViewportView(movementsTable);

        newMovementButton.setText("+");

        btnBajasMovi.setText("-");
        btnBajasMovi.setEnabled(false);

        btnEditarMovi.setText("Editar");
        btnEditarMovi.setEnabled(false);

        javax.swing.GroupLayout movPanelLayout = new javax.swing.GroupLayout(movPanel);
        movPanel.setLayout(movPanelLayout);
        movPanelLayout.setHorizontalGroup(
            movPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(movPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarMovi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajasMovi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newMovementButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        movPanelLayout.setVerticalGroup(
            movPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movPanelLayout.createSequentialGroup()
                .addComponent(movScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(movPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newMovementButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBajasMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarMovi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aluPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aluPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getSearchButton() {
        return searchButton;
    }

    public JTextField getDniTextField() {
        return dniTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getRegisterTextField() {
        return registerTextField;
    }

    public JButton getNewMovementButton() {
        return newMovementButton;
    }

    public JTable getMovementsTable() {
        return movementsTable;
    }

  
   
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aluPanel;
    private javax.swing.JLabel ap1Label;
    private javax.swing.JLabel ap2Label;
    private javax.swing.JButton btnBajasMovi;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditarMovi;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JPanel movPanel;
    private javax.swing.JScrollPane movScrollPane;
    private javax.swing.JTable movementsTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newMovementButton;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel regLabel;
    private javax.swing.JTextField registerTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    // End of variables declaration//GEN-END:variables
}

