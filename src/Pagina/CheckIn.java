/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pagina;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.* ;
import Project.*;
/**
 *
 * @author carlo
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
        jTextPrecio.setEditable(false);
        jTextCheckIn.setEditable(false);
        SimpleDateFormat miFormato = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        jTextCheckIn.setText(miFormato.format(cal.getTime()));
    }

    String cama;
    String tipoHab;
    String numeroHab;
    String precio;
    
    public void detalleHab(){

        jComboNumHab.removeAllItems();
        jTextPrecio.setText("");
        cama = (String)jComboCama.getSelectedItem();
        tipoHab = (String)jComboTipoHab.getSelectedItem();
        try {
            ResultSet rs = Seleccionar.getData("select*from habitaciones where cama='"+cama+"' and tipoHabitacion = '"+tipoHab+"' and estado='No Asignada'");
            while(rs.next()){
                jComboNumHab.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextNumCel = new javax.swing.JTextField();
        jTextNacionalidad = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jComboGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextDocId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextCheckIn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboCama = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboTipoHab = new javax.swing.JComboBox<>();
        jComboNumHab = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        btnAllRoom = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 150, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1211, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, 136, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero Celular");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 215, 350, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nacionalidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 310, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 395, 109, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 473, 109, -1));
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 175, 350, -1));
        getContentPane().add(jTextNumCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 270, 350, -1));
        getContentPane().add(jTextNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 355, 350, -1));
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 350, -1));

        jComboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        getContentPane().add(jComboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 433, 350, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Documento de identidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 137, 183, -1));
        getContentPane().add(jTextDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 175, 350, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 215, 80, -1));
        getContentPane().add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 270, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Check In (Hoy)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 310, 160, -1));
        getContentPane().add(jTextCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 355, 350, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cama");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 137, 43, -1));

        jComboCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sencilla", "Doble", "Matrimonial" }));
        jComboCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCamaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 175, 350, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de Habitacion");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 215, 150, -1));

        jComboTipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sencilla", "Doble" }));
        jComboTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoHabActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTipoHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 270, 350, -1));

        jComboNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNumHabActionPerformed(evt);
            }
        });
        getContentPane().add(jComboNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 355, 350, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero Habitacion");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 310, 153, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 395, 43, -1));

        jTextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 433, 350, -1));

        btnAllRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllRoom.setText("Allote Room");
        getContentPane().add(btnAllRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 499, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/luxury_hotel-t2.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        setVisible(false);
        new CheckIn().setVisible(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jComboCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCamaActionPerformed
        detalleHab();
    }//GEN-LAST:event_jComboCamaActionPerformed

    private void jComboTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoHabActionPerformed
        detalleHab();
    }//GEN-LAST:event_jComboTipoHabActionPerformed

    private void jComboNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNumHabActionPerformed
                
        numeroHab = (String)jComboNumHab.getSelectedItem();
        try {
            ResultSet rs = Seleccionar.getData("select*from habitaciones where habitacionNo='"+numeroHab+"'");
            while(rs.next()){            
                jTextPrecio.setText(rs.getString(4));
            }
        } catch (Exception e) {
        };
    }//GEN-LAST:event_jComboNumHabActionPerformed

    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioActionPerformed
        detalleHab();
    }//GEN-LAST:event_jTextPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllRoom;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboCama;
    private javax.swing.JComboBox<String> jComboGenero;
    private javax.swing.JComboBox<String> jComboNumHab;
    private javax.swing.JComboBox<String> jComboTipoHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextCheckIn;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDocId;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNacionalidad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumCel;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
