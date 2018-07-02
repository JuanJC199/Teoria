package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.Conexion;

/**
 *
 * @author PC
 */
public class daoProveedores {
    Conexion c;
    
    public daoProveedores(){
        c = new Conexion();
    }
    
    public boolean create(){
        try (
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PROVEEDORES_CREATE(?,?,?,?,?,?,?,?,?)}");
        ) {
            
            statement.setString(1, "hola@hola.com");
            statement.setString(2, "La Pelona");
            statement.setString(3, "El Progreso");
            statement.setString(4, "Calle Armenteros");
            statement.setString(5, "Siempre Viva");
            statement.setString(6, "Honuderaña");
            statement.setString(7, "98745814");
            statement.setString(8, "si");
            statement.setString(9, "20500");
            
            statement.execute();
            statement.close();
//            statement = null;
            c.desconectar();
 
            System.out.println("ALV almacena!!");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("No pudo acceder al procedimiento ni porra");
            return false;
        }
        
    }
}