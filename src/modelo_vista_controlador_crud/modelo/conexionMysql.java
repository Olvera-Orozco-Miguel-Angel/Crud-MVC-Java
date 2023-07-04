
package modelo_vista_controlador_crud.modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class conexionMysql {
     public static final String URL = "jdbc:mysql://localhost:3306/EstacionMeteorologico?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "mysqlMAO97"; 
 
    
    
    public Connection getConnection(){
    Connection conexion = null;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
        JOptionPane.showMessageDialog(null, "Si es hizo la conexión con mysql");
        
    }catch(Exception ex){
        
        JOptionPane.showMessageDialog(null,"Hubo un errro con MYSQL");
    
    
    }
        
    return conexion;
    }
    
}
