package tienda;

import InternalFrames.Proveedores;
import InternalFrames.Productos;
import InternalFrames.Orden_Compras;
import InternalFrames.Productos_Almacen;

/**
 *
 * @author Juan
 */

public class MDI extends javax.swing.JFrame {
    
    public MDI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        DesktopInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btCompras = new javax.swing.JMenu();
        jMenuProveedores = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenuItem();
        jMenu_OC = new javax.swing.JMenuItem();
        jMenuItemDocumentos = new javax.swing.JMenuItem();

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        btAlmacen = new javax.swing.JMenu();
        jMenuItemProductos_almacen = new javax.swing.JMenuItem();
        jMenuItemEquivalencias = new javax.swing.JMenuItem();
        jMenuItemMovimientos = new javax.swing.JMenuItem();
        jMenuItemReportes = new javax.swing.JMenuItem();
        btPedidos = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopInicialLayout = new javax.swing.GroupLayout(DesktopInicial);
        DesktopInicial.setLayout(DesktopInicialLayout);
        DesktopInicialLayout.setHorizontalGroup(
            DesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        DesktopInicialLayout.setVerticalGroup(
            DesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopInicial, java.awt.BorderLayout.CENTER);

        btCompras.setText("Compras");
        btCompras.setName(""); // NOI18N
        btCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btComprasMouseClicked(evt);
            }
        });

        jMenuProveedores.setText("Proveedores");
        jMenuProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProveedoresMouseClicked(evt);
            }
        });
        jMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProveedoresActionPerformed(evt);
            }
        });
        btCompras.add(jMenuProveedores);

        jMenuProductos.setText("Productos");
        jMenuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProductosMouseClicked(evt);
            }
        });
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });
        btCompras.add(jMenuProductos);

        jMenu_OC.setText("Ordenes de compra");
        jMenu_OC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_OCMouseClicked(evt);
            }
        });
        jMenu_OC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_OCActionPerformed(evt);
            }
        });
        btCompras.add(jMenu_OC);

        jMenuItemDocumentos.setText("Documentos");
        jMenuItemDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocumentosActionPerformed(evt);
            }
        });
        btCompras.add(jMenuItemDocumentos);
        jMenuItem1.setText("Proveedores");
        btCompras.add(jMenuItem1);

        jMenuItem2.setText("Productos");
        btCompras.add(jMenuItem2);

        jMenuItem4.setText("Ordenes de compra");
        btCompras.add(jMenuItem4);

        jMenuBar1.add(btCompras);

        btAlmacen.setText("Almacen");
        btAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlmacenMouseClicked(evt);
            }
        });

        jMenuItemProductos_almacen.setText("Productos de almacen");
        jMenuItemProductos_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductos_almacenActionPerformed(evt);
            }
        });
        btAlmacen.add(jMenuItemProductos_almacen);

        jMenuItemEquivalencias.setText("Equivalencias");
        btAlmacen.add(jMenuItemEquivalencias);

        jMenuItemMovimientos.setText("Movimientos");
        btAlmacen.add(jMenuItemMovimientos);

        jMenuItemReportes.setText("Reportes");
        btAlmacen.add(jMenuItemReportes);

        jMenuBar1.add(btAlmacen);

        btPedidos.setText("Ventas");
        jMenuBar1.add(btPedidos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprasMouseClicked
        // TODO add your handling code here:
        
        //new Compras().setVisible(true);
    }//GEN-LAST:event_btComprasMouseClicked

    private void btAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlmacenMouseClicked
        // TODO add your handling code here:
//        new ModuloAlmacen().setVisible(true);
    }//GEN-LAST:event_btAlmacenMouseClicked

    private void jMenuProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProveedoresMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_jMenuProveedoresMouseClicked

    private void jMenuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProductosMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_jMenuProductosMouseClicked

    private void jMenu_OCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_OCMouseClicked
        // TODO add your handling code here:    
    }//GEN-LAST:event_jMenu_OCMouseClicked

    private void jMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProveedoresActionPerformed
        // TODO add your handling code here:
        Proveedores prov = new Proveedores();
        this.DesktopInicial.add(prov);
        prov.setVisible(true);
    }//GEN-LAST:event_jMenuProveedoresActionPerformed

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        // TODO add your handling code here:
        Productos prod = new Productos();
        this.DesktopInicial.add(prod);
        prod.setVisible(true);
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jMenu_OCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_OCActionPerformed
        // TODO add your handling code here:
        Orden_Compras oc = new Orden_Compras();
        this.DesktopInicial.add(oc);
        oc.setVisible(true);
    }//GEN-LAST:event_jMenu_OCActionPerformed

    private void jMenuItemDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDocumentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDocumentosActionPerformed

    private void jMenuItemProductos_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductos_almacenActionPerformed
        // TODO add your handling code here:
        Productos_Almacen prodAl = new Productos_Almacen();
        this.DesktopInicial.add(prodAl);
        prodAl.setVisible(true);
    }//GEN-LAST:event_jMenuItemProductos_almacenActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopInicial;
    private javax.swing.JMenu btAlmacen;
    private javax.swing.JMenu btCompras;
    private javax.swing.JMenu btPedidos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JMenuItem jMenuItemDocumentos;
    private javax.swing.JMenuItem jMenuItemEquivalencias;
    private javax.swing.JMenuItem jMenuItemMovimientos;
    private javax.swing.JMenuItem jMenuItemProductos_almacen;
    private javax.swing.JMenuItem jMenuItemReportes;
    private javax.swing.JMenuItem jMenuProductos;
    private javax.swing.JMenuItem jMenuProveedores;
    private javax.swing.JMenuItem jMenu_OC;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
