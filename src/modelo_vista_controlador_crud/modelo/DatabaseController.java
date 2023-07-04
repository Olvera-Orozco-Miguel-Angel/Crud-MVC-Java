
package modelo_vista_controlador_crud.modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseController extends conexionMysql{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(clima clima) throws SQLException{
        int resultado = 0;
        Connection conexion = getConnection();
    try {
        ps = (PreparedStatement) conexion.prepareStatement("call sp_StoreMeteorologicalData(?,?,?,?)");
        ps.setDouble(1, clima.getTemperature());
        ps.setDouble(2,clima.getPressure() );
        ps.setDouble(3, clima.getAltitude());
        ps.setDouble(4, clima.getAir_quality());
        resultado = ps.executeUpdate();
        
         return true;
        
     
    }catch(Exception error){
        System.err.println("Error"+error);
        return false;
    
    }finally{
    conexion.close();
    }
 
        
   
    }
       
    
}
