/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author fanny
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_nuevo_producto = new javax.swing.JButton();
        jb_pedidos = new javax.swing.JButton();
        jb_clientes = new javax.swing.JButton();
        jb_almacen = new javax.swing.JButton();
        jb_proveedores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(626, 417));
        setMinimumSize(new java.awt.Dimension(626, 417));
        setPreferredSize(new java.awt.Dimension(626, 417));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 55);

        jb_nuevo_producto.setBackground(new java.awt.Color(0, 153, 255));
        jb_nuevo_producto.setText("Ventas");
        jb_nuevo_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nuevo_productoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_nuevo_producto);
        jb_nuevo_producto.setBounds(230, 310, 140, 40);

        jb_pedidos.setBackground(new java.awt.Color(0, 153, 255));
        jb_pedidos.setText("Pedidos");
        jb_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_pedidosMouseClicked(evt);
            }
        });
        getContentPane().add(jb_pedidos);
        jb_pedidos.setBounds(160, 180, 110, 40);

        jb_clientes.setBackground(new java.awt.Color(0, 153, 255));
        jb_clientes.setText("Clientes");
        jb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_clientesMouseClicked(evt);
            }
        });
        getContentPane().add(jb_clientes);
        jb_clientes.setBounds(330, 180, 110, 40);

        jb_almacen.setBackground(new java.awt.Color(0, 153, 255));
        jb_almacen.setText("Almacen");
        jb_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_almacenMouseClicked(evt);
            }
        });
        getContentPane().add(jb_almacen);
        jb_almacen.setBounds(160, 250, 110, 40);

        jb_proveedores.setBackground(new java.awt.Color(0, 153, 255));
        jb_proveedores.setText("Proveedores");
        jb_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_proveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(jb_proveedores);
        jb_proveedores.setBounds(330, 250, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFazuca.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 60, 270, 90);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/160_F_42459916_Yt7cH133dIcZbaIVMtkEanlXnOG149ZT.png"))); // NOI18N
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(490, 310, 100, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bloc-de-notas-con-un-gran-grupo-de-papeleria-de-colores-muti-y-un-lapiz_13339-245165 (1).jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(664, 450));
        jLabel2.setMinimumSize(new java.awt.Dimension(664, 450));
        jLabel2.setPreferredSize(new java.awt.Dimension(664, 450));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 640, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_pedidosMouseClicked
       pedidos pedidos=new pedidos();
       pedidos.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jb_pedidosMouseClicked

    private void jb_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_clientesMouseClicked
       clientes clientes=new clientes();
       clientes.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jb_clientesMouseClicked

    private void jb_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_almacenMouseClicked
        almacen almacen=new almacen();
        almacen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_almacenMouseClicked

    private void jb_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_proveedoresMouseClicked
        reegistro_proveedores reegistro_proveedores=new reegistro_proveedores();
        reegistro_proveedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_proveedoresMouseClicked

    private void jb_nuevo_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nuevo_productoMouseClicked
        ventas ventas=new ventas();
        ventas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_nuevo_productoMouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jb_almacen;
    private javax.swing.JButton jb_clientes;
    private javax.swing.JButton jb_nuevo_producto;
    private javax.swing.JButton jb_pedidos;
    private javax.swing.JButton jb_proveedores;
    // End of variables declaration//GEN-END:variables
}
