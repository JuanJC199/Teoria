package InternalFrames;

/**
 *
 * @author PC
 */
import Panels.Editar_Producto_Almacen;
import Panels.Insertar_Producto_Almacen;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class Productos_Almacen extends javax.swing.JInternalFrame {
    
    GridBagLayout layout = new GridBagLayout();
    Insertar_Producto_Almacen insert;
    Editar_Producto_Almacen edit;
     
    public Productos_Almacen() {
        initComponents();
        insert = new Insertar_Producto_Almacen();
        edit = new Editar_Producto_Almacen();
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
        jButtonInsertar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jPanelPantalla = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos Almacen");
        setPreferredSize(new java.awt.Dimension(679, 472));

        jPanelBotones.setBackground(new java.awt.Color(102, 102, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBotones.setPreferredSize(new java.awt.Dimension(123, 438));

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInsertarMouseClicked(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jPanelPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPantalla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInsertarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(true);
        this.edit.setVisible(false);
    }//GEN-LAST:event_jButtonInsertarMouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(false);
        this.edit.setVisible(true);
    }//GEN-LAST:event_jButtonEditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelPantalla;
    // End of variables declaration//GEN-END:variables
}
