

package Project;

import java.sql.*;
import javax.swing.JOptionPane;

public class Seleccionar {
    public static ResultSet getData(String Query){
        Connection con = null;
        Statement st =null;
        ResultSet rs = null;
        try {
            con = Conexion.getConnection();
            st = con.createStatement();
            rs=st.executeQuery(Query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
