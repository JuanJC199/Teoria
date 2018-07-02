package Panels;
import Clases.daoProductos_oficina;
/**
 *
 * @author PC
 */
public class Delete_Productos_Oficina extends javax.swing.JPanel {
   
    daoProductos_oficina dao;
    String id_producto_oficina;
    
  public Delete_Productos_Oficina() {
        initComponents();
        dao = new  daoProductos_oficina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonReset = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextId_Compra = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 153, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Id de producto a eliminar:");

        jTextId_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jTextId_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextId_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
        // TODO add your handling code here:
        this.jTextId_Compra.setText("");
    }//GEN-LAST:event_jButtonResetMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        this.id_producto_oficina = this.jTextId_Compra.getText();
        dao.eliminar(this.id_producto_oficina);
    }//GEN-LAST:event_jButtonEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextId_Compra;
    // End of variables declaration//GEN-END:variables
}
