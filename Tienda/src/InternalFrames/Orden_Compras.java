package InternalFrames;

/**
 *
 * @author PC
 */
import Panels.Editar_OC;
import Panels.Insertar_OC;
import Panels.Delete_OC;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class Orden_Compras extends javax.swing.JInternalFrame {
    
    GridBagLayout layout = new GridBagLayout();
    Insertar_OC insert;
    Editar_OC edit;
    Delete_OC eliminar;
    
    public Orden_Compras() {
        initComponents();
        insert = new Insertar_OC();
        edit = new Editar_OC();
        eliminar = new Delete_OC();
        this.jPanelPantalla.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(insert,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(edit,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(eliminar,c);
        insert.setVisible(false);
        edit.setVisible(false);
        eliminar.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jBtEliminar = new javax.swing.JButton();
        jBtInsertar = new javax.swing.JButton();
        jBtEditar1 = new javax.swing.JButton();
        jPanelPantalla = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Orden de Compra");

        jPanelBotones.setBackground(new java.awt.Color(102, 102, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBotones.setPreferredSize(new java.awt.Dimension(123, 438));

        jBtEliminar.setText("Eliminar");
        jBtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEliminarMouseClicked(evt);
            }
        });

        jBtInsertar.setText("Insertar");
        jBtInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtInsertarMouseClicked(evt);
            }
        });

        jBtEditar1.setText("Editar");
        jBtEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEditar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jBtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtEditar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jBtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jPanelPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPantalla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEliminarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(false);
        this.edit.setVisible(false);
        this.eliminar.setVisible(true);
    }//GEN-LAST:event_jBtEliminarMouseClicked

    private void jBtInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtInsertarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(true);
        this.edit.setVisible(false);
        this.eliminar.setVisible(false);
    }//GEN-LAST:event_jBtInsertarMouseClicked

    private void jBtEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEditar1MouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(false);
        this.edit.setVisible(true);
        this.eliminar.setVisible(false);
    }//GEN-LAST:event_jBtEditar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEditar1;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JButton jBtInsertar;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelPantalla;
    // End of variables declaration//GEN-END:variables
}
