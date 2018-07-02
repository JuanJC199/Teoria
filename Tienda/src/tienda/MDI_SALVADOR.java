package tienda;
import InternalFrames.Proveedores;
import InternalFrames.Productos;
import InternalFrames.Orden_Compras;
import InternalFrames.Productos_Almacen;
/**
 *
 * @author PC
 */
public class MDI_SALVADOR extends javax.swing.JFrame {

    /**
     * Creates new form MDI_SALVADOR
     */
    public MDI_SALVADOR() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProveedores = new javax.swing.JMenuItem();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItem_OC = new javax.swing.JMenuItem();
        jMenuItemDocumentos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopInicialLayout = new javax.swing.GroupLayout(DesktopInicial);
        DesktopInicial.setLayout(DesktopInicialLayout);
        DesktopInicialLayout.setHorizontalGroup(
            DesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        DesktopInicialLayout.setVerticalGroup(
            DesktopInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopInicial, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Compras");

        jMenuItemProveedores.setText("Proveedores");
        jMenuItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProveedores);

        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProductos);

        jMenuItem_OC.setText("Orden de Compra");
        jMenuItem_OC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OCActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_OC);

        jMenuItemDocumentos.setText("Documentos");
        jMenu1.add(jMenuItemDocumentos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Almacen");

        jMenuItem1.setText("Producto Almacen");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Movimientos");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Equivalencias");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Reportes");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ventas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        // TODO add your handling code here:
        Productos prod = new Productos();
        this.DesktopInicial.add(prod);
        prod.setVisible(true); 
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProveedoresActionPerformed
        // TODO add your handling code here:
        Proveedores prov = new Proveedores();
        this.DesktopInicial.add(prov);
        prov.setVisible(true);
    }//GEN-LAST:event_jMenuItemProveedoresActionPerformed

    private void jMenuItem_OCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OCActionPerformed
        // TODO add your handling code here:
        Orden_Compras oc = new Orden_Compras();
        this.DesktopInicial.add(oc);
        oc.setVisible(true);
    }//GEN-LAST:event_jMenuItem_OCActionPerformed

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
            java.util.logging.Logger.getLogger(MDI_SALVADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_SALVADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_SALVADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_SALVADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_SALVADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopInicial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemDocumentos;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemProveedores;
    private javax.swing.JMenuItem jMenuItem_OC;
    // End of variables declaration//GEN-END:variables
}
