/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VentanaProductos extends javax.swing.JFrame {

    public VentanaProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductosCombos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        descriptionCombo = new javax.swing.JLabel();
        txtDescripcionCombo = new javax.swing.JTextField();
        nameCombo = new javax.swing.JLabel();
        txtNombreCombo = new javax.swing.JTextField();
        costCombo = new javax.swing.JLabel();
        txtPrecioCombo = new javax.swing.JTextField();
        btnGuardarCombo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGuardarProducto = new javax.swing.JButton();
        txtPrecioProducto = new javax.swing.JTextField();
        costProduct = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        descriptionProduct = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        nameProduct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductosCombos.setBackground(new java.awt.Color(255, 153, 153));
        ProductosCombos.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(248, 246, 203));

        descriptionCombo.setBackground(new java.awt.Color(102, 102, 102));
        descriptionCombo.setForeground(new java.awt.Color(153, 153, 0));
        descriptionCombo.setText("DESCRIPCI??N");

        txtDescripcionCombo.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcionCombo.setForeground(new java.awt.Color(204, 204, 0));

        nameCombo.setForeground(new java.awt.Color(153, 153, 0));
        nameCombo.setText("NOMBRE");

        txtNombreCombo.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCombo.setForeground(new java.awt.Color(204, 204, 0));

        costCombo.setForeground(new java.awt.Color(153, 153, 0));
        costCombo.setText("PRECIO");

        txtPrecioCombo.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioCombo.setForeground(new java.awt.Color(204, 204, 0));

        btnGuardarCombo.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardarCombo.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCombo.setText("Crear combo");
        btnGuardarCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(costCombo)
                        .addComponent(descriptionCombo)
                        .addComponent(nameCombo)
                        .addComponent(txtNombreCombo)
                        .addComponent(txtDescripcionCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addComponent(txtPrecioCombo))
                    .addComponent(btnGuardarCombo))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameCombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionCombo)
                .addGap(3, 3, 3)
                .addComponent(txtDescripcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costCombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        ProductosCombos.addTab("Agregar combo", jPanel1);

        jPanel5.setBackground(new java.awt.Color(248, 246, 203));

        btnGuardarProducto.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setText("A??adir producto");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        txtPrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioProducto.setForeground(new java.awt.Color(204, 204, 0));

        costProduct.setForeground(new java.awt.Color(153, 153, 0));
        costProduct.setText("PRECIO");

        txtDescripcionProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcionProducto.setForeground(new java.awt.Color(204, 204, 0));

        descriptionProduct.setBackground(new java.awt.Color(102, 102, 102));
        descriptionProduct.setForeground(new java.awt.Color(153, 153, 0));
        descriptionProduct.setText("DESCRIPCI??N");

        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setForeground(new java.awt.Color(204, 204, 0));

        nameProduct.setForeground(new java.awt.Color(153, 153, 0));
        nameProduct.setText("NOMBRE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(costProduct)
                        .addComponent(descriptionProduct)
                        .addComponent(nameProduct)
                        .addComponent(txtNombreProducto)
                        .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addComponent(txtPrecioProducto))
                    .addComponent(btnGuardarProducto))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionProduct)
                .addGap(3, 3, 3)
                .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        ProductosCombos.addTab("Agregar producto", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductosCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductosCombos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComboActionPerformed
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:derby://localhost:1527/FideBurger", "usuario", "usuario");

            String comando_INSERT = "INSERT INTO COMBOS VALUES (?,?,?)";

            PreparedStatement nuevoComando = nuevaConexion.prepareStatement(comando_INSERT);

            nuevoComando.setString(1, txtNombreCombo.getText());

            nuevoComando.setString(2, txtDescripcionCombo.getText());

            nuevoComando.setString(3, txtPrecioCombo.getText());

            nuevoComando.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Hubo un error en la conexi??n");
        }
    }//GEN-LAST:event_btnGuardarComboActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:derby://localhost:1527/FideBurger", "usuario", "usuario");

            String comando_INSERT = "INSERT INTO PRODUCTOS VALUES (?,?,?)";

            PreparedStatement nuevoComando = nuevaConexion.prepareStatement(comando_INSERT);

            nuevoComando.setString(1, txtNombreProducto.getText());

            nuevoComando.setString(2, txtDescripcionProducto.getText());

            nuevoComando.setString(3, txtPrecioProducto.getText());

            nuevoComando.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Hubo un error en la conexi??n");
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ProductosCombos;
    private javax.swing.JButton btnGuardarCombo;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JLabel costCombo;
    private javax.swing.JLabel costProduct;
    private javax.swing.JLabel descriptionCombo;
    private javax.swing.JLabel descriptionProduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameCombo;
    private javax.swing.JLabel nameProduct;
    private javax.swing.JTextField txtDescripcionCombo;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtNombreCombo;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioCombo;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
