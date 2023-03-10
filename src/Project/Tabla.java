package Project;

import java.sql.*;
import javax.swing.JOptionPane;

public class Tabla {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
                con = Conexion.getConnection();
                st = con.createStatement();
                st.executeUpdate("create table usuarios(nombre varchar(200), email varchar(200), contraseña varchar(50), preguntaSeguridad varchar(200), respuesta varchar(200), direccion varchar(200), estado varchar(20))");
                st.executeUpdate("create table habitaciones(habitacionNo varchar(10), tipoHabitacion varchar(200), cama varchar(200), precio int, estado varchar(20) )");
                JOptionPane.showMessageDialog(null, "Tabla creada satisfactoriamente");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}
