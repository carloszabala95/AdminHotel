
package Project;

import java.sql.*;

public class Conexion {
    public static Connection getConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/adminHotel", "root", "1234");
            return con;
        } catch (Exception e) {
            return null;
        }
    }        
}
