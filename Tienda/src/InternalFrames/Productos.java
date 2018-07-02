package InternalFrames;

/**
 *
 * @author PC
 */
import Panels.Editar_Producto;
import Panels.Insertar_Producto;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class Productos extends javax.swing.JInternalFrame {
    
    GridBagLayout layout = new GridBagLayout();
    Insertar_Producto insert;
    Editar_Producto edit;
    
    public Productos() {
        initComponents();
        insert = new Insertar_Producto();
        edit = new Editar_Producto();
        this.jPanelPantalla.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(insert,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(edit,c);
        insert.setVisible(false);
        edit.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jBtInsertar1 = new javax.swing.JButton();
        jBtEditar1 = new javax.swing.JButton();
        jPanelPantalla = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Productos");

        jPanelBotones.setBackground(new java.awt.Color(102, 102, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBotones.setPreferredSize(new java.awt.Dimension(123, 438));

        jBtInsertar1.setText("Insertar");
        jBtInsertar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtInsertar1MouseClicked(evt);
            }
        });
        jBtInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtInsertar1ActionPerformed(evt);
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
                    .addComponent(jBtEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtInsertar1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jBtInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jBtEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jPanelPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPantalla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtInsertar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtInsertar1ActionPerformed

    private void jBtInsertar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtInsertar1MouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(true);
        this.edit.setVisible(false);
    }//GEN-LAST:event_jBtInsertar1MouseClicked

    private void jBtEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEditar1MouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(false);
        this.edit.setVisible(true);
    }//GEN-LAST:event_jBtEditar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEditar1;
    private javax.swing.JButton jBtInsertar1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelPantalla;
    // End of variables declaration//GEN-END:variables
}
