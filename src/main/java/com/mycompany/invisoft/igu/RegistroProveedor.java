package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class RegistroProveedor extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public RegistroProveedor() {
        //control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbTipoDocProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumDocProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiarRegProveedor = new javax.swing.JButton();
        txtNomProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarRegProveedor = new javax.swing.JButton();
        btnCancelarRegProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Registro de Proveedor");

        cmbTipoDocProveedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbTipoDocProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ti", "Cc" }));
        cmbTipoDocProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocProveedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Documento");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Numero de documento");

        txtNumDocProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumDocProveedor.setText("Documento (TI-CC)");

        txtDireccionProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDireccionProveedor.setText("Direccion");
        txtDireccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionProveedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Direccion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumDocProveedor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoDocProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDireccionProveedor))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoDocProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumDocProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiarRegProveedor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLimpiarRegProveedor.setText("Limpiar");
        btnLimpiarRegProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegProveedorActionPerformed(evt);
            }
        });

        txtNomProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNomProveedor.setText("Nombre");
        txtNomProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProveedorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Nombre o Razon Social");

        txtCorreoProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreoProveedor.setText("example@gmail.com");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Correo");

        txtCelProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCelProveedor.setText("##########");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Telefono");

        btnGuardarRegProveedor.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardarRegProveedor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGuardarRegProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRegProveedor.setText("Guardar");
        btnGuardarRegProveedor.setBorderPainted(false);
        btnGuardarRegProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegProveedorActionPerformed(evt);
            }
        });

        btnCancelarRegProveedor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarRegProveedor.setText("Cancelar");
        btnCancelarRegProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiarRegProveedor)
                        .addGap(70, 70, 70)
                        .addComponent(btnGuardarRegProveedor)
                        .addGap(83, 83, 83)
                        .addComponent(btnCancelarRegProveedor)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarRegProveedor)
                    .addComponent(btnCancelarRegProveedor)
                    .addComponent(btnGuardarRegProveedor))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoDocProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocProveedorActionPerformed

    }//GEN-LAST:event_cmbTipoDocProveedorActionPerformed

    private void txtDireccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionProveedorActionPerformed

    private void btnLimpiarRegProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegProveedorActionPerformed
        txtNomProveedor.setText("");
        txtCelProveedor.setText("");
        txtCorreoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtNumDocProveedor.setText("");
        cmbTipoDocProveedor.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarRegProveedorActionPerformed

    private void txtNomProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProveedorActionPerformed

    private void btnGuardarRegProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegProveedorActionPerformed
        String nombProveedor = txtNomProveedor.getText();
        String celProveedor = txtCelProveedor.getText();
        String correoProv = txtCorreoProveedor.getText();
        String direcProveedor = txtDireccionProveedor.getText();
        String docProveedor = txtNumDocProveedor.getText();
        String tipoDocumentoProveedor = (String) cmbTipoDocProveedor.getSelectedItem();
        
        control.guardarprov(nombProveedor, celProveedor, correoProv, 
                direcProveedor, docProveedor, tipoDocumentoProveedor);
        
        JOptionPane optionPane = new JOptionPane ("Se guardó correctamente c:");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        Proveedores vistaProv = new Proveedores();
        vistaProv.setVisible(true);
        vistaProv.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGuardarRegProveedorActionPerformed

    private void btnCancelarRegProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegProveedorActionPerformed
        Proveedores prov = new Proveedores();
        prov.setVisible(true);
        prov.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarRegProveedorActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRegProveedor;
    private javax.swing.JButton btnGuardarRegProveedor;
    private javax.swing.JButton btnLimpiarRegProveedor;
    private javax.swing.JComboBox<String> cmbTipoDocProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCelProveedor;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtNomProveedor;
    private javax.swing.JTextField txtNumDocProveedor;
    // End of variables declaration//GEN-END:variables
}
