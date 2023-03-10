/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pagina;

import javax.swing.JOptionPane;
import java.sql.*;
import Project.*;

/**
 *
 * @author carlo
 */
public class OlvidarContrasenha extends javax.swing.JFrame {

    /**
     * Creates new form olvidarContrasenha
     */
    public OlvidarContrasenha() {
        initComponents();
    }
    
    String email;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jTextPregunta = new javax.swing.JTextField();
        jTextRespuesta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jPasswordContrasenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olvido la contraseña?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 250, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1312, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 37, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pregunta Seguridad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Respuesta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nueva Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 105, -1));
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 270, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, -1, -1));
        getContentPane().add(jTextPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 270, -1));
        getContentPane().add(jTextRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 270, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, -1, -1));

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));
        getContentPane().add(jPasswordContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 270, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Desea salir ahora?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int check = 0;
        email = jTextEmail.getText();
        if(email.equals("")){
            check=1;
            JOptionPane.showMessageDialog(null, "Introduzca Email");
        }
        else
        {
            ResultSet rs = Seleccionar.getData("select*from usuarios where email = '"+email+"'");
            try {
                if(rs.next()){
                    check=1;
                    jTextEmail.setEditable(false);
                    jTextPregunta.setEditable(false);
                    jTextPregunta.setText(rs.getString(4)); //Obtener valor columna 4 de consulta
                    
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check==0)
            JOptionPane.showMessageDialog(null, "Correo incorrecto");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int check =0;
        String preguntaSeguridad = jTextPregunta.getText();
        String respuesta = jTextRespuesta.getText();
        String nuevaContrasenha = jPasswordContrasenha.getText();
        if(respuesta.equals("")||nuevaContrasenha.equals("")){
            check =1;
            JOptionPane.showMessageDialog(null, "Los campos deno deben estar vacios");
        }
        else{
            ResultSet rs =Seleccionar.getData("select * from usuarios where email='"+email+"' and preguntaSeguridad='"+preguntaSeguridad+"' and respuesta='"+respuesta+"' ");
            
            try {
                if(rs.next()){
                    check =1;
                    InsertarActualizarBorrar.setData("update usuarios set contraseña='"+nuevaContrasenha+"' where email = '"+email+"'", "Contraseña cambiada satisfactoriamente");
                    setVisible(false);
                    new OlvidarContrasenha().setVisible(true);
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check ==0){
        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(OlvidarContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlvidarContrasenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordContrasenha;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextPregunta;
    private javax.swing.JTextField jTextRespuesta;
    // End of variables declaration//GEN-END:variables
}
