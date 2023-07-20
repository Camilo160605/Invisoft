package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Controladora;
import com.mycompany.invisoft.logica.Producto;
import com.mycompany.invisoft.logica.Proveedor;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RegistrarProducto extends javax.swing.JFrame {
    Controladora control = null;
    public RegistrarProducto() {
        control = new Controladora();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtRinLlanta = new javax.swing.JTextField();
        txtRefLlanta1 = new javax.swing.JTextField();
        txtFechaLlanta = new javax.swing.JTextField();
        txtmarcaLlanta = new javax.swing.JTextField();
        txtPrecioLlanta = new javax.swing.JTextField();
        cmbProveedores = new javax.swing.JComboBox<>();
        btnguardarLlanta = new javax.swing.JButton();
        btnvolverProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Proveedor:");

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("Registro de Productos");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Marca:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Referencia:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Precio");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Rin:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Fecha:");

        txtRinLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRinLlanta.setText("####");

        txtRefLlanta1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRefLlanta1.setText("####");

        txtFechaLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFechaLlanta.setText("####");

        txtmarcaLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtmarcaLlanta.setText("####");

        txtPrecioLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioLlanta.setText("####");
        txtPrecioLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioLlantaActionPerformed(evt);
            }
        });
        txtPrecioLlanta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioLlantaKeyTyped(evt);
            }
        });

        cmbProveedores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnguardarLlanta.setBackground(new java.awt.Color(0, 0, 255));
        btnguardarLlanta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnguardarLlanta.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarLlanta.setText("Guardar");
        btnguardarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarLlantaActionPerformed(evt);
            }
        });

        btnvolverProductos.setText("<-");
        btnvolverProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtFechaLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtRefLlanta1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtRinLlanta)
                            .addComponent(cmbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardarLlanta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvolverProductos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvolverProductos)
                .addGap(33, 33, 33)
                .addComponent(txtRefLlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFechaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarLlanta)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16)
                    .addGap(31, 31, 31)
                    .addComponent(jLabel17)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel18)
                    .addGap(28, 28, 28)
                    .addComponent(jLabel19)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel21)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRinLlanta.setText("");
        txtRinLlanta.setText("");
        txtFechaLlanta.setText("");
        txtmarcaLlanta.setText("");
        txtPrecioLlanta.setText("");
        //        cmbProveedores.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cargarProveedores();
    }//GEN-LAST:event_formWindowOpened

    private void btnguardarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarLlantaActionPerformed
        String refLlanta = txtRinLlanta.getText();
        String rinLlanta = txtRinLlanta.getText();
        String fechaLlanta = txtFechaLlanta.getText();
        String marcaLlanta = txtmarcaLlanta.getText();
        Integer precioLlanta = Integer.valueOf(txtPrecioLlanta.getText());
        String nombreProveedor = (String) cmbProveedores.getSelectedItem();

        control.crearLlanta(refLlanta,rinLlanta,fechaLlanta,marcaLlanta,precioLlanta,nombreProveedor);
        mostrarMensaje("Llanta guardada con exito", "Info", "Guardado con exito");
    }//GEN-LAST:event_btnguardarLlantaActionPerformed

    private void txtPrecioLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioLlantaActionPerformed
  
    }//GEN-LAST:event_txtPrecioLlantaActionPerformed

    private void txtPrecioLlantaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioLlantaKeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
                    evt.consume();
                    
                    JOptionPane.showMessageDialog(rootPane,"Ingresar Solo Numeros :/");
        }
    }//GEN-LAST:event_txtPrecioLlantaKeyTyped

    private void btnvolverProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverProductosActionPerformed
        Productos vista = new Productos();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnvolverProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnguardarLlanta;
    private javax.swing.JButton btnvolverProductos;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JTextField txtFechaLlanta;
    private javax.swing.JTextField txtPrecioLlanta;
    private javax.swing.JTextField txtRefLlanta1;
    private javax.swing.JTextField txtRinLlanta;
    private javax.swing.JTextField txtmarcaLlanta;
    // End of variables declaration//GEN-END:variables
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
        private void cargarProveedores() {
                List <Proveedor> listaProveedor = control.traerProveedor();
        if(listaProveedor != null){
           for (Proveedor prov : listaProveedor){
                //Proveedor prov = new Proveedor();
                String [] nombresProv = {prov.getNom_proveedor()};     
                cmbProveedores.addItem(Arrays.toString(nombresProv));
           }
        }
    }


}
