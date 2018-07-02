package Panels;
import Clases.daoOrdenes_Compras;
/**
 *
 * @author PC
 */
public class Delete_OC extends javax.swing.JPanel {
    daoOrdenes_Compras dao;
    String id_compra;
    /**
     * Creates new form Delete_OC
     */
    public Delete_OC() {
        initComponents();
        dao = new daoOrdenes_Compras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextId_Compra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextId_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese Id de la O/C a eliminar:");

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
        });

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
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextId_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        this.id_compra = this.jTextId_Compra.getText();
        dao.eliminar(this.id_compra);
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
        // TODO add your handling code here:
        this.jTextId_Compra.setText("");
    }//GEN-LAST:event_jButtonResetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextId_Compra;
    // End of variables declaration//GEN-END:variables
}
