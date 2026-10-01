package webcrudfutbol.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aidan
 */
public class ConexionBD {
     public static final String username = "root";
    public static final String password = "KXQQJF";
    public static final String database = "bdfutbol";
    public static final String url = "jdbc:mysql://localhost:3307/" + database;
    
    public static Connection getConnection(){
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, username, password);
            
            System.out.println("Conexion con la BBDD " + database + " establecida correctamente.");
        } catch (Exception e) {
            System.out.println("Conexion con la BBDD " + database + " no pudo establecerse.");
        }
        return cn;
    }
}
