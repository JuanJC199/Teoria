package InternalFrames;

/**
 *
 * @author PC
 */
import Panels.Editar_Proveedor;
import Panels.Insertar_Proveedor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class Proveedores extends javax.swing.JInternalFrame {
    
    GridBagLayout layout = new GridBagLayout();
    Insertar_Proveedor insert;
    Editar_Proveedor edit;
    
    public Proveedores() {
        initComponents();
        insert = new Insertar_Proveedor();
        edit = new Editar_Proveedor();
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
        jBtInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtEditar = new javax.swing.JButton();
        jPanelPantalla = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Proveedors");

        jPanelBotones.setBackground(new java.awt.Color(102, 102, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtInsertar.setText("Insertar");
        jBtInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtInsertarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Opciones:");

        jBtEditar.setText("Editar");
        jBtEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jBtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jPanelPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPantalla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtInsertarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(true);
        this.edit.setVisible(false);
    }//GEN-LAST:event_jBtInsertarMouseClicked

    private void jBtEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEditarMouseClicked
        // TODO add your handling code here:
        this.insert.setVisible(false);
        this.edit.setVisible(true);
    }//GEN-LAST:event_jBtEditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEditar;
    private javax.swing.JButton jBtInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelPantalla;
    // End of variables declaration//GEN-END:variables
}
