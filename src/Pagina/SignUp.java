
package Pagina;

import javax.swing.JOptionPane;
import Project.InsertarActualizarBorrar;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jPasswordContrasenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jComboPreguntaSeguridad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextRespuesta = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnInicioSesion = new javax.swing.JButton();
        btnOlvidoContrasenha = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 58, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 47, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 68, -1));

        jTextNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 300, -1));

        jTextEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 300, -1));

        jPasswordContrasenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jPasswordContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pregunta de seguridad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, 20));

        jComboPreguntaSeguridad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboPreguntaSeguridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cual es el nombre de tu primera mascota?", "Cual fue tu primer auto?", "A que colegio asistió?", "Cual es el nombre de la ciudad donde nació? " }));
        jComboPreguntaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPreguntaSeguridadActionPerformed(evt);
            }
        });
        getContentPane().add(jComboPreguntaSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 302, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Respuesta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 97, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Direccion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 97, 20));

        jTextRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 302, -1));

        jTextDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 302, -1));

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, -1));

        btnInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicioSesion.setText("Iniciar Sesion");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        btnOlvidoContrasenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOlvidoContrasenha.setText("Olvidó Contraseña?");
        btnOlvidoContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoContrasenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvidoContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPreguntaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPreguntaSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPreguntaSeguridadActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombre = jTextNombre.getText();
        String email = jTextEmail.getText();
        String contrasenha = jPasswordContrasenha.getText();
        String preguntaSeguridad = (String)jComboPreguntaSeguridad.getSelectedItem();
        String respuesta = jTextRespuesta.getText();
        String direccion = jTextDireccion.getText();
        if(nombre.equals("")||email.equals("")||contrasenha.equals("")||respuesta.equals("")||direccion.equals(""))
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        else{
            String Query;
            Query = "insert into usuarios values('"+nombre+"','"+email+"','"+contrasenha+"','"+preguntaSeguridad+"','"+respuesta+"','"+direccion+"','false')";
            InsertarActualizarBorrar.setData(Query, "Registro completo");
            setVisible(false);
            new SignUp().setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Desea salir ahora?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnOlvidoContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoContrasenhaActionPerformed
        setVisible(false);
        new OlvidarContrasenha().setVisible(true);
    }//GEN-LAST:event_btnOlvidoContrasenhaActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnOlvidoContrasenha;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JComboBox<String> jComboPreguntaSeguridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordContrasenha;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextRespuesta;
    // End of variables declaration//GEN-END:variables
}
