package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Cliente;
import com.mycompany.invisoft.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModificarDatosCliente extends javax.swing.JFrame {
    
    Controladora control = null;
    int id_Cliente;
    Cliente cli;
 
    public ModificarDatosCliente(int id_Cliente) {
        control = new Controladora();
        //this.id_Cliente = id_Cliente;
        initComponents(); 
        cargarDatos(id_Cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbTipoDocCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumDocCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiarRegCliente = new javax.swing.JButton();
        txtNomCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarRegCliente = new javax.swing.JButton();
        btnCancelarRegClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Modificacion de Datos");

        cmbTipoDocCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbTipoDocCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ti", "Cc" }));
        cmbTipoDocCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Documento");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Numero de documento");

        txtNumDocCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumDocCliente.setText("Documento (TI-CC)");

        txtDireccionCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDireccionCliente.setText("Direccion");
        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Direccion:");

        btnLimpiarRegCliente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLimpiarRegCliente.setText("Limpiar");
        btnLimpiarRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumDocCliente)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbTipoDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDireccionCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarRegCliente)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumDocCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnLimpiarRegCliente)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        txtNomCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNomCliente.setText("Nombre");
        txtNomCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Nombre o Razon Social");

        txtCorreoCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreoCliente.setText("example@gmail.com");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Correo");

        txtCelCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCelCliente.setText("##########");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Telefono");

        btnGuardarRegCliente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGuardarRegCliente.setText("Guardar Cambios");
        btnGuardarRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegClienteActionPerformed(evt);
            }
        });

        btnCancelarRegClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarRegClientes.setText("Cancelar");
        btnCancelarRegClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnGuardarRegCliente)
                        .addGap(103, 103, 103)
                        .addComponent(btnCancelarRegClientes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCelCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                    .addComponent(txtNomCliente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarRegClientes)
                            .addComponent(btnGuardarRegCliente))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoDocClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocClienteActionPerformed
        
    }//GEN-LAST:event_cmbTipoDocClienteActionPerformed

    private void txtNomClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomClienteActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void btnLimpiarRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegClienteActionPerformed
        txtNomCliente.setText("");
        txtCelCliente.setText("");
        txtCorreoCliente.setText("");
        txtDireccionCliente.setText("");
        txtNumDocCliente.setText("");
        cmbTipoDocCliente.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarRegClienteActionPerformed

    private void btnGuardarRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegClienteActionPerformed
        //TODOS LOS DATOS DEL CLIENTE
        String nombreCliente = txtNomCliente.getText();
        String celuCliente = txtCelCliente.getText();
        String correoCli = txtCorreoCliente.getText();
        String direcCliente = txtDireccionCliente.getText();
        String docCliente = txtNumDocCliente.getText();
        String tipoDocumentoCliente = (String) cmbTipoDocCliente.getSelectedItem();
        control.modificarDatosCliente(cli,nombreCliente,celuCliente,correoCli,direcCliente,docCliente,tipoDocumentoCliente);   
        //Mensaje de que todo salio bien
        mostrarMensaje("Edicion realizada correctamente","Info","Edicion Correcta");
        Clientes client = new Clientes();
        client.setVisible(true);
        client.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarRegClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarRegClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegClientesActionPerformed
        Clientes client = new Clientes();
        client.setVisible(true);
        client.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarRegClientesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarRegClientes;
    private javax.swing.JButton btnGuardarRegCliente;
    private javax.swing.JButton btnLimpiarRegCliente;
    private javax.swing.JComboBox<String> cmbTipoDocCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCelCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtNumDocCliente;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int id_Cliente) {
        this.cli = control.traerCliente(id_Cliente);
        txtNomCliente.setText(cli.getNom_cliente());
        txtCelCliente.setText(cli.getTel_cliente());
        txtCorreoCliente.setText(cli.getCorreo_cliente());
        txtDireccionCliente.setText(cli.getDirec_cliente());
        txtNumDocCliente.setText(cli.getDoc_cliente());
        if (cli.getTipo_Doc_Cliente().equals("Ti")){
            cmbTipoDocCliente.setSelectedIndex(1);
        }
        else {
            if (cli.getTipo_Doc_Cliente().equals("Cc")){
            cmbTipoDocCliente.setSelectedIndex(2);
        }
        }
    }
    public void mostrarMensaje (String mensaje,String tipo, String titulo){
                JOptionPane optionPane = new JOptionPane (mensaje);
                
                if(tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                }
                else if (tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
    }
}
