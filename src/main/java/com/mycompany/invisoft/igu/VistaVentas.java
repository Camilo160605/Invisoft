
package com.mycompany.invisoft.igu;
import com.mycompany.invisoft.logica.Controladora;
import com.mycompany.invisoft.logica.VentasInvi;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class VistaVentas extends javax.swing.JFrame {
    Controladora control = null;
    
    public VistaVentas() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        btnReportesInicio = new javax.swing.JButton();
        btnProveedoresInicio = new javax.swing.JButton();
        btnInicioInvi = new javax.swing.JButton();
        btnClientesInicio = new javax.swing.JButton();
        btnProductosInicio = new javax.swing.JButton();
        btnVentasInicio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRevisarVentas = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TablaVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextField2.setText("INVISOFT");
        jTextField2.setBorder(null);

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

        btnRevisarVentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRevisarVentas.setForeground(new java.awt.Color(0, 0, 255));
        btnRevisarVentas.setText("Registro Ventas");
        btnRevisarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarVentasActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setText("Administrador");

        jButton11.setText("Logo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRevisarVentas)
                            .addComponent(btnClientesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductosInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInicioInvi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportesInicio)
                            .addComponent(btnProveedoresInicio)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton11)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton11))
                .addGap(67, 67, 67)
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
                .addGap(18, 18, 18)
                .addComponent(btnRevisarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ventas Realizadas");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           cargarTablaVentas();
    }//GEN-LAST:event_formWindowOpened

    private void btnReportesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesInicioActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReportesInicioActionPerformed

    private void btnProveedoresInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresInicioActionPerformed
        Proveedores proveedores = new Proveedores();
        proveedores.setVisible(true);
        proveedores.setLocationRelativeTo(null);
        this.dispose();
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
       Ayuda vist = new Ayuda();
       vist.setVisible(true);
       vist.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRevisarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarVentasActionPerformed
        VistaVentas vista = new VistaVentas();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRevisarVentasActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnClientesInicio;
    private javax.swing.JButton btnInicioInvi;
    private javax.swing.JButton btnProductosInicio;
    private javax.swing.JButton btnProveedoresInicio;
    private javax.swing.JButton btnReportesInicio;
    private javax.swing.JButton btnRevisarVentas;
    private javax.swing.JButton btnVentasInicio;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaVentas() {
        //Definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //Que filas y Columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //Establezco los nombres de las columnas
        String titulos[] = {"Id Venta","Cliente","Pago"};
                modeloTabla.setColumnIdentifiers(titulos);
        //carga de los datos desde la base de datos
        List <VentasInvi> listaVentas = control.traerVentas();
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaVentas!=null){
            for(VentasInvi venta : listaVentas){
                Object[] objeto={venta.getId(),venta.getCliente(),venta.getTotal()};

                modeloTabla.addRow(objeto);
            }
        }
        TablaVentas.setModel(modeloTabla);
    }
}

    

