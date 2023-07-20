/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.mycompany.invisoft.logica.Producto;
import com.mycompany.invisoft.logica.Proveedor;
import java.util.Arrays;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author CAMILO
 */
public class Productos extends javax.swing.JFrame {
    Controladora control = null;

    public Productos() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel00 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRefLlanta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtRinLlanta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFechaLlanta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbProveedores = new javax.swing.JComboBox<>();
        btnguardarLlanta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtmarcaLlanta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioLlanta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnInicioInvi = new javax.swing.JButton();
        btnClientesInicio = new javax.swing.JButton();
        btnProductosInicio = new javax.swing.JButton();
        btnVentasInicio = new javax.swing.JButton();
        btnReportesInicio = new javax.swing.JButton();
        btnProveedoresInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("Registro de Productos");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Referencia:");

        txtRefLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRefLlanta.setText("####");
        txtRefLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Rin:");

        txtRinLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRinLlanta.setText("####");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Fecha:");

        txtFechaLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFechaLlanta.setText("####");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Proveedor:");

        cmbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedoresActionPerformed(evt);
            }
        });

        btnguardarLlanta.setBackground(new java.awt.Color(0, 0, 255));
        btnguardarLlanta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnguardarLlanta.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarLlanta.setText("Guardar");
        btnguardarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarLlantaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Marca:");

        txtmarcaLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtmarcaLlanta.setText("####");
        txtmarcaLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaLlantaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Precio");

        txtPrecioLlanta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioLlanta.setText("####");
        txtPrecioLlanta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioLlantaKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("INVISOFT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de usuario");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Ayuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnInicioInvi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicioInvi.setText("Inicio");
        btnInicioInvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioInviActionPerformed(evt);
            }
        });

        btnClientesInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClientesInicio.setText("Clientes");
        btnClientesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesInicioActionPerformed(evt);
            }
        });

        btnProductosInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProductosInicio.setForeground(new java.awt.Color(0, 0, 255));
        btnProductosInicio.setText("Productos");
        btnProductosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosInicioActionPerformed(evt);
            }
        });

        btnVentasInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVentasInicio.setText("Ventas");
        btnVentasInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasInicioActionPerformed(evt);
            }
        });

        btnReportesInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReportesInicio.setText("Reportes");
        btnReportesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesInicioActionPerformed(evt);
            }
        });

        btnProveedoresInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProveedoresInicio.setText("Proveedores");
        btnProveedoresInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClientesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInicioInvi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportesInicio)
                            .addComponent(btnProveedoresInicio)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductosInicio))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(16, 16, 16)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnInicioInvi)
                        .addGap(18, 18, 18)
                        .addComponent(btnClientesInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnProductosInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVentasInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportesInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnProveedoresInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel5)
                    .addContainerGap(572, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel00Layout = new javax.swing.GroupLayout(jPanel00);
        jPanel00.setLayout(jPanel00Layout);
        jPanel00Layout.setHorizontalGroup(
            jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel00Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel00Layout.createSequentialGroup()
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRefLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel00Layout.createSequentialGroup()
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel00Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnguardarLlanta)
                                .addGap(53, 53, 53)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(46, 46, 46))

        );
        jPanel00Layout.setVerticalGroup(
            jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtRefLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtRinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtFechaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPrecioLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarLlanta)
                    .addComponent(jButton2))

                .addGap(31, 31, 31)
                .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRefLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel00Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtRinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtFechaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtmarcaLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnguardarLlanta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnguardarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarLlantaActionPerformed
        String refLlanta = txtRefLlanta.getText();
        String rinLlanta = txtRinLlanta.getText(); 
        String fechaLlanta = txtFechaLlanta.getText(); 
        String marcaLlanta = txtmarcaLlanta.getText();
        Integer precioLlanta = Integer.parseInt(txtPrecioLlanta.getText());
        String nombreProveedor = (String) cmbProveedores.getSelectedItem();
        
        control.crearLlanta(refLlanta,rinLlanta,fechaLlanta,marcaLlanta,precioLlanta,nombreProveedor);
        mostrarMensaje("Llanta guardada con exito", "Info", "Guardado con exito");
    
    }//GEN-LAST:event_btnguardarLlantaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtRefLlanta.setText("");
        txtRinLlanta.setText("");
        txtFechaLlanta.setText("");
        txtmarcaLlanta.setText("");
        txtPrecioLlanta.setText("");
//        cmbProveedores.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaProductos();
        cargarProveedores();
    }//GEN-LAST:event_formWindowOpened

    private void cmbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedoresActionPerformed
        
    }//GEN-LAST:event_cmbProveedoresActionPerformed


    private void txtmarcaLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaLlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaLlantaActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioInviActionPerformed
        InicioInvisoft inicio = new InicioInvisoft();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInicioInviActionPerformed

    private void btnClientesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesInicioActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        clientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnClientesInicioActionPerformed

    private void btnProductosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosInicioActionPerformed
        Productos productos = new Productos();
        productos.setVisible(true);
        productos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProductosInicioActionPerformed

    private void btnVentasInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasInicioActionPerformed
        Ventas ventas = new Ventas();
        ventas.setVisible(true);
        ventas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVentasInicioActionPerformed

    private void btnReportesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesInicioActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesInicioActionPerformed

    private void btnProveedoresInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresInicioActionPerformed
        Proveedores proveedores = new Proveedores();
        proveedores.setVisible(true);
        proveedores.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProveedoresInicioActionPerformed


    private void txtPrecioLlantaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioLlantaKeyTyped
    }//GEN-LAST:event_txtPrecioLlantaKeyTyped

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientesInicio;
    private javax.swing.JButton btnInicioInvi;
    private javax.swing.JButton btnProductosInicio;
    private javax.swing.JButton btnProveedoresInicio;
    private javax.swing.JButton btnReportesInicio;
    private javax.swing.JButton btnVentasInicio;
    private javax.swing.JButton btnguardarLlanta;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel00;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtFechaLlanta;
    private javax.swing.JTextField txtPrecioLlanta;
    private javax.swing.JTextField txtRefLlanta;
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

        private void cargarTablaProductos() {
            //Definir modelo para la tabla
            DefaultTableModel modeloTablaProd = new DefaultTableModel(){
            //Definir que la tabla no sea editable
                @Override
                public boolean isCellEditable(int row, int column){
                return false;
                }
            };
            //Establecemos nombre de la columna
            String titulos[]={"Referencia","Rin","Fecha","Marca","Precio","NombreProveedor"};
            modeloTablaProd.setColumnIdentifiers(titulos);
            //traer la lista de productos que tenemos en la BD
            List <Producto> listaproduc = control.traerProducto();              
            //Recorremos la lista y seteamos todos los datos de la BD en la tabla
                if(listaproduc != null){
                    for(Producto prod : listaproduc){
                        Object[] objeto = {prod.getReferencia(),prod.getRin(),prod.getFecha(),prod.getMarca(),prod.getPrecio(),prod.getProveedor()};
                        
                        modeloTablaProd.addRow(objeto);
                    }
                }
            tablaProductos.setModel(modeloTablaProd);

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

