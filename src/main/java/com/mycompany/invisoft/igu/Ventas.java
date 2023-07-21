package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Cliente;
import com.mycompany.invisoft.logica.Controladora;
import com.mycompany.invisoft.logica.Producto;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventas extends javax.swing.JFrame {
    Controladora control = null;
    Producto prod;
    DefaultTableModel modelo;
   
   public Ventas() {
       control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        btnReportesInicio = new javax.swing.JButton();
        btnProveedoresInicio = new javax.swing.JButton();
        btnInicioInvi = new javax.swing.JButton();
        btnClientesInicio = new javax.swing.JButton();
        btnProductosInicio = new javax.swing.JButton();
        btnVentasInicio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarNombreCliente = new javax.swing.JButton();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblReferencia = new javax.swing.JLabel();
        txtrefLlanta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtrinLlanta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprecioLlanta = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ventas");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextField2.setText("INVISOFT");
        jTextField2.setBorder(null);

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField11.setText("Nombre de Usuario");
        jTextField11.setBorder(null);

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
        btnProductosInicio.setText("Productos");
        btnProductosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosInicioActionPerformed(evt);
            }
        });

        btnVentasInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVentasInicio.setForeground(new java.awt.Color(0, 0, 255));
        btnVentasInicio.setText("Ventas");
        btnVentasInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasInicioActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductosInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioInvi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportesInicio)
                    .addComponent(btnProveedoresInicio)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
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
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Referencia", "Rin", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setHeaderValue("Id");
            tablaVentas.getColumnModel().getColumn(1).setHeaderValue("Referencia");
            tablaVentas.getColumnModel().getColumn(2).setHeaderValue("Rin");
            tablaVentas.getColumnModel().getColumn(3).setHeaderValue("Precio");
        }

        jLabel3.setText("Total:");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNombreCliente.setEditable(false);

        jLabel2.setText("Nombre");

        btnBuscarNombreCliente.setText("Buscar Cliente");
        btnBuscarNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreClienteActionPerformed(evt);
            }
        });

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });

        jLabel1.setText("Identificacion:");

        jLabel4.setText("Id Producto:");

        lblReferencia.setText("Referencia:");

        jLabel5.setText("Rin:");

        jLabel6.setText("Precio:");

        btnAñadirProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(242, 242, 242));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnBuscarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblReferencia)
                        .addGap(18, 18, 18)
                        .addComponent(txtrefLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtrinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprecioLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnBuscarProducto)
                .addGap(124, 124, 124)
                .addComponent(btnAñadirProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferencia)
                    .addComponent(txtrefLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtrinLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtprecioLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAñadirProducto)
                        .addComponent(btnEliminar))
                    .addComponent(btnBuscarProducto))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnBuscarNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesInicioActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReportesInicioActionPerformed

    private void btnProveedoresInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresInicioActionPerformed

    }//GEN-LAST:event_btnProveedoresInicioActionPerformed

    private void btnInicioInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioInviActionPerformed
        InicioInvisoft inicio = new InicioInvisoft();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnInicioInviActionPerformed

    private void btnClientesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesInicioActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        clientes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnClientesInicioActionPerformed

    private void btnProductosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosInicioActionPerformed
        Productos productos = new Productos();
        productos.setVisible(true);
        productos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProductosInicioActionPerformed

    private void btnVentasInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasInicioActionPerformed
        Ventas ventas = new Ventas();
        ventas.setVisible(true);
        ventas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVentasInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnBuscarNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreClienteActionPerformed
                   
         String identificacion = txtIdentificacion.getText();
         
        String mensaje = control.revisarCliente(identificacion);
        if (mensaje != null){
            txtNombreCliente.setText(mensaje);
        }
         
             
    }//GEN-LAST:event_btnBuscarNombreClienteActionPerformed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
//        char validar = evt.getKeyChar();
//        
//        if (Character.isLetter(validar)){
//            getToolkit().beep();
//                    evt.consume();
//                    
//                    JOptionPane.showMessageDialog(rootPane,"Ingresar Solo Numeros :/");
//    }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
            
        int id_llanta = Integer.valueOf(txtIdProducto.getText());
        this.prod = control.traerProd(id_llanta);
        txtrefLlanta.setText(prod.getReferencia());
        txtrinLlanta.setText(prod.getRin());
        txtprecioLlanta.setText(String.valueOf(prod.getPrecio()));             
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        int id_llanta = Integer.valueOf(txtIdProducto.getText());
        String referencia = txtrefLlanta.getText();
        String rin = txtrinLlanta.getText();
        Integer precio = Integer.parseInt(txtprecioLlanta.getText());        
        modelo = (DefaultTableModel) this.tablaVentas.getModel();
        Object datos [] = new Object[]{id_llanta,referencia,rin,precio};
        modelo.addRow(datos);
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  
        int fila = tablaVentas.getSelectedRow();
        if (fila > 0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccionar fila");
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnBuscarNombreCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnClientesInicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicioInvi;
    private javax.swing.JButton btnProductosInicio;
    private javax.swing.JButton btnProveedoresInicio;
    private javax.swing.JButton btnReportesInicio;
    private javax.swing.JButton btnVentasInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtprecioLlanta;
    private javax.swing.JTextField txtrefLlanta;
    private javax.swing.JTextField txtrinLlanta;
    // End of variables declaration//GEN-END:variables
    private void cargarTabla(){
//        DefaultTableModel modelo = new DefaultTableModel(){
//            
//        //Que filas y Columnas no sean editables
//        @Override
//            public boolean isCellEditable(int row, int column){
//                return false;
//            }
//        };
//        String titulos[] = {"Id Producto","Ref Llanta","Rin Llanta","Precio Llanta"};
//        modelo.setColumnIdentifiers(titulos);
    }


}
