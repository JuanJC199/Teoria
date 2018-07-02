package Panels;
import Clases.daoProductos_oficina;
/**
 *
 * @author PC
 */
public class Editar_Producto extends javax.swing.JPanel {
    daoProductos_oficina dao;
    String id_producto_oficina;
    String unidad_medida;
    String linea;
    String centro_costo;
    String destino_producto;
    String tipo;
    String activo;
    String descripcion;
    
    
   public Editar_Producto() {
        initComponents();
        dao = new daoProductos_oficina();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboUnidad = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRbActivo = new javax.swing.JRadioButton();
        jTextId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboDestinoProducto = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextTipo = new javax.swing.JTextField();
        jTextLinea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCentroCosto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDescripcion = new javax.swing.JTextArea();
        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Unidad de medida:");

        jComboUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gramos", "Libras", "Kilogramos", "Onzas", "Litros" }));

        jButton2.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Producto");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("ID Producto a buscar:");

        jRbActivo.setText("(Por default esta inactivo)");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Activo:");

        jComboDestinoProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compra", "Venta", "Sin destino" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Línea:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Centro de costo:");

        jTAreaDescripcion.setColumns(20);
        jTAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTAreaDescripcion);

        jButtonGuardar.setText("Actualizar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de producto:");

        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Destino del producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRbActivo)
                            .addComponent(jTextLinea)
                            .addComponent(jTextTipo)
                            .addComponent(jTextCentroCosto)
                            .addComponent(jComboDestinoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(18, 18, 18)
                .addComponent(jButtonReset)
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCentroCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboDestinoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbActivo)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void obtenerDatos(){
        this.id_producto_oficina = this.jTextId.getText();
        this.unidad_medida = this.jComboUnidad.getSelectedItem().toString();
        this.linea = this.jTextLinea.getText();
        this.centro_costo = this.jTextCentroCosto.getText();
        this.destino_producto = this.jComboDestinoProducto.getSelectedItem().toString();
        this.tipo = this.jTextTipo.getText();
        this.descripcion = this.jTAreaDescripcion.getText();
        
        if(this.jRbActivo.isSelected()){
            this.activo = "si";
        }else{
            this.activo = "no";
        }
    }
    
    public void limpiar(){
        this.jTextId.setText("");
        this.jComboUnidad.setSelectedIndex(0);
        this.jTextLinea.setText("");
        this.jTextCentroCosto.setText("");
        this.jComboDestinoProducto.setSelectedIndex(0);
        this.jTAreaDescripcion.setText("");
        this.jRbActivo.setEnabled(false);
    }
    
    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        // TODO add your handling code here:
        this.obtenerDatos();
        System.out.println(this.id_producto_oficina);
        System.out.println(this.unidad_medida);
        System.out.println(this.linea);
        System.out.println(this.centro_costo);
        System.out.println(this.destino_producto);
        System.out.println(this.tipo);
        System.out.println(this.activo);
        System.out.println(this.descripcion);
        
        dao.update(this.id_producto_oficina, this.unidad_medida, this.linea,this.centro_costo,
                    this.destino_producto, this.tipo, this.activo, this.descripcion);
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jButtonResetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JComboBox jComboDestinoProducto;
    private javax.swing.JComboBox jComboUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRbActivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAreaDescripcion;
    private javax.swing.JTextField jTextCentroCosto;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextLinea;
    private javax.swing.JTextField jTextTipo;
    // End of variables declaration//GEN-END:variables
}
