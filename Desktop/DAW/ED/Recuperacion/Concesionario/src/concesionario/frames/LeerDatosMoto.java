package concesionario.frames;
    
import static java.lang.Double.parseDouble;
import Concesionario.models.Moto;
    
import Concesionario.models.Moto;

/**
 *
 * @author Ripoll
 */
public class LeerDatosMoto extends javax.swing.JFrame {
    public Moto moto;
    /**
     * Creates new form LeerMotos
     */
    public LeerDatosMoto(Moto moto) {
        this.moto = moto;
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

        modelo = new javax.swing.JLabel();
        tf_kms = new javax.swing.JTextField();
        fecha_fabricacion = new javax.swing.JLabel();
        guardarmoto = new javax.swing.JButton();
        cv = new javax.swing.JLabel();
        cilindrada = new javax.swing.JLabel();
        kms = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        tf_fecha_fabricacion = new javax.swing.JTextField();
        tf_cv = new javax.swing.JTextField();
        tittle = new javax.swing.JLabel();
        tf_cilindrada = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modelo.setText("Modelo:");

        fecha_fabricacion.setText("Fecha de Fabricación:");

        guardarmoto.setText("Gurdar Moto");
        guardarmoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarmotoActionPerformed(evt);
            }
        });

        cv.setText("Potencia en C.V.:");

        cilindrada.setText("Cilindrada:");

        kms.setText("KMS:");

        tf_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_marcaActionPerformed(evt);
            }
        });

        tittle.setText("Introducir Datos de la Moto");

        marca.setText("Marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marca)
                                    .addComponent(modelo))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_marca, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tf_modelo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_fabricacion)
                                    .addComponent(cv)
                                    .addComponent(cilindrada)
                                    .addComponent(kms))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_fecha_fabricacion)
                                    .addComponent(tf_cv)
                                    .addComponent(tf_cilindrada)
                                    .addComponent(tf_kms)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(guardarmoto)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_fabricacion)
                    .addComponent(tf_fecha_fabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cv)
                    .addComponent(tf_cv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cilindrada)
                    .addComponent(tf_cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kms)
                    .addComponent(tf_kms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(guardarmoto)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarmotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarmotoActionPerformed
        // TODO add your handling code here:
        moto.setMarca(marca.getText());
        moto.setModelo(modelo.getText());
        moto.setFechaDeFabricacion(fecha_fabricacion.getText());
        moto.setCv(parseDouble(cv.getText()));
        moto.setCilindrada(parseDouble(cilindrada.getText()));
        moto.setKm(parseDouble(kms.getText()));

        this.setVisible(false);
    }//GEN-LAST:event_guardarmotoActionPerformed

    private void tf_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(LeerDatosMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeerDatosMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeerDatosMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeerDatosMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new LeerDatosMoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cilindrada;
    private javax.swing.JLabel cv;
    private javax.swing.JLabel fecha_fabricacion;
    private javax.swing.JButton guardarmoto;
    private javax.swing.JLabel kms;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    private javax.swing.JTextField tf_cilindrada;
    private javax.swing.JTextField tf_cv;
    private javax.swing.JTextField tf_fecha_fabricacion;
    private javax.swing.JTextField tf_kms;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
