package com.mycompany.invisoft.igu;

import com.mycompany.invisoft.logica.Controladora;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.mycompany.invisoft.logica.Producto;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicioInvi = new javax.swing.JButton();
        btnClientesInicio = new javax.swing.JButton();
        btnProductosInicio = new javax.swing.JButton();
        btnVentasInicio = new javax.swing.JButton();
        btnReportesInicio = new javax.swing.JButton();
        btnProveedoresInicio = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btneditarProductos = new javax.swing.JButton();
        btneliminarTablaProductos = new javax.swing.JButton();
        btnRegistrarNuevoProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("INVISOFT");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

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

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setText("Administrador");

        jButton11.setBackground(new java.awt.Color(0, 0, 255));
        jButton11.setForeground(new java.awt.Color(242, 242, 242));
        jButton11.setText("Perfil");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(242, 242, 242));
        jButton12.setText("Cerrar Sesión");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
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
                            .addComponent(btnProductosInicio)
                            .addComponent(jButton12))
                        .addGap(23, 23, 23)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(760, 760, 760))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(748, 748, 748))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton11))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
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
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout jPanel00Layout = new javax.swing.GroupLayout(jPanel00);
        jPanel00.setLayout(jPanel00Layout);
        jPanel00Layout.setHorizontalGroup(
            jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel00Layout.setVerticalGroup(
            jPanel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btneditarProductos.setText("Editar");
        btneditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarProductosActionPerformed(evt);
            }
        });

        btneliminarTablaProductos.setBackground(new java.awt.Color(255, 0, 0));
        btneliminarTablaProductos.setForeground(new java.awt.Color(242, 242, 242));
        btneliminarTablaProductos.setText("Eliminar");
        btneliminarTablaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarTablaProductosActionPerformed(evt);
            }
        });

        btnRegistrarNuevoProducto.setBackground(new java.awt.Color(0, 0, 255));
        btnRegistrarNuevoProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrarNuevoProducto.setForeground(new java.awt.Color(242, 242, 242));
        btnRegistrarNuevoProducto.setText("AÑADIR PRODUCTO");
        btnRegistrarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProductoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(444, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.setBackground(new java.awt.Color(0, 0, 255));
        jButton10.setForeground(new java.awt.Color(242, 242, 242));
        jButton10.setText("Perfil");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneditarProductos)
                            .addComponent(btneliminarTablaProductos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnRegistrarNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(470, 470, 470)
                    .addComponent(jButton10)
                    .addContainerGap(470, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel00, javax.swing.GroupLayout.PREFERRED_SIZE, 591, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btneditarProductos)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminarTablaProductos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(283, 283, 283)
                    .addComponent(jButton10)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaProductos();
    }//GEN-LAST:event_formWindowOpened

    private void btneditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarProductosActionPerformed
           //controlo quela tabla no este vacia
        if (tablaProductos.getRowCount()>0 ) {
            //controlo que haya seleccionado minimo 1 registro
            if(tablaProductos.getRowCount()!= -1 ) {
               
                //id de la persona a editar
                int id_Llanta = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(),0)));
              
                ModificarDatosProductos modifDatosProd = new ModificarDatosProductos(id_Llanta);
                modifDatosProd.setVisible(true);
                modifDatosProd.setLocationRelativeTo(null);
                this.dispose();

             
            }
            else {
                mostrarMensaje("No seleccionó ningun Proveedor","Error","Error al Eliminar");
            }
        }
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla","Error","Error al eliminar");
        }
    }//GEN-LAST:event_btneditarProductosActionPerformed

    private void btnRegistrarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProductoActionPerformed
        RegistrarProducto regProd = new RegistrarProducto();
        regProd.setVisible(true);
        regProd.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarNuevoProductoActionPerformed

    private void btneliminarTablaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarTablaProductosActionPerformed
             //controlo quela tabla no este vacia
        if (tablaProductos.getRowCount()> 0 ) {
            //controlo que haya seleccionado minimo 1 registro
            if(tablaProductos.getRowCount()!= -1 ) {
                int id_Llanta= Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(),0)));
                control.borrarProducto(id_Llanta);
                
                mostrarMensaje("Producto eliminado Correctamente c:","Info","Borrado De Cliente");
                cargarTablaProductos();     
            }
            else {
                mostrarMensaje("No seleccionó ningun Proveedor","Error","Error al Eliminar");
            }
        }
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla","Error","Error al eliminar");
        }
    }//GEN-LAST:event_btneliminarTablaProductosActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnProveedoresInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresInicioActionPerformed
        Proveedores proveedores = new Proveedores();
        proveedores.setVisible(true);
        proveedores.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProveedoresInicioActionPerformed

    private void btnReportesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesInicioActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReportesInicioActionPerformed

    private void btnVentasInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasInicioActionPerformed
        Ventas ventas = new Ventas();
        ventas.setVisible(true);
        ventas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVentasInicioActionPerformed

    private void btnProductosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosInicioActionPerformed
        Productos productos = new Productos();
        productos.setVisible(true);
        productos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProductosInicioActionPerformed

    private void btnClientesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesInicioActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        clientes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnClientesInicioActionPerformed

    private void btnInicioInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioInviActionPerformed
        InicioInvisoft inicio = new InicioInvisoft();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnInicioInviActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ayuda vist = new Ayuda();
        vist.setVisible(true);
        vist.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Perfil per = new Perfil();
       per.setVisible(true);
       per.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        LoginInvisoft log = new LoginInvisoft();
       log.setVisible(true);
       log.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed
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
    private javax.swing.JButton btnClientesInicio;
    private javax.swing.JButton btnInicioInvi;
    private javax.swing.JButton btnProductosInicio;
    private javax.swing.JButton btnProveedoresInicio;
    private javax.swing.JButton btnRegistrarNuevoProducto;
    private javax.swing.JButton btnReportesInicio;
    private javax.swing.JButton btnVentasInicio;
    private javax.swing.JButton btneditarProductos;
    private javax.swing.JButton btneliminarTablaProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel00;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
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
            String titulos[]={"Id","Referencia","Rin","Fecha","Marca","Precio","NombreProveedor"};
            modeloTablaProd.setColumnIdentifiers(titulos);
            //traer la lista de productos que tenemos en la BD
            List <Producto> listaproduc = control.traerProducto();              
            //Recorremos la lista y seteamos todos los datos de la BD en la tabla
                if(listaproduc != null){
                    for(Producto prod : listaproduc){
                        Object[] objeto = {prod.getId_Llanta(),prod.getReferencia(),prod.getRin(),prod.getFecha(),prod.getMarca(),prod.getPrecio(),prod.getProveedor()};
                        
                        modeloTablaProd.addRow(objeto);
                    }
                }
            tablaProductos.setModel(modeloTablaProd);

        }        

 
}

