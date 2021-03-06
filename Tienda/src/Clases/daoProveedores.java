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
    
    public boolean create(String contacto, String razon_social, String ciudad,
                          String calle, String avenida, String nacionalidad, String telefono,
                          String activo, String estado_cuenta)
    {
        try (
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PROVEEDORES_CREATE(?,?,?,?,?,?,?,?,?)}");
        ) {
            statement.setString(1, contacto);
            statement.setString(2, razon_social);
            statement.setString(3, ciudad);
            statement.setString(4, calle);
            statement.setString(5, avenida);
            statement.setString(6, nacionalidad);
            statement.setString(7, telefono);
            statement.setString(8, activo);
            statement.setString(9, estado_cuenta);
            
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
    
    public boolean update(
            String id_proveedor, String contacto, String razon_social, String ciudad,
            String calle, String avenida, String nacionalidad, String telefono,
            String activo, String estado_cuenta)
    {
        try(
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PROVEEDORES_UPDATE(?,?,?,?,?,?,?,?,?,?)}");
            
        ) {
            statement.setString(1, id_proveedor);
            statement.setString(2, contacto);
            statement.setString(3, razon_social);
            statement.setString(4, ciudad);
            statement.setString(5, calle);
            statement.setString(6, avenida);
            statement.setString(7, nacionalidad);
            statement.setString(8, telefono);
            statement.setString(9, activo);
            statement.setString(10, estado_cuenta);
            
            statement.execute();
            statement.close();
//            statement = null;
            c.desconectar();
 
            System.out.println("siuuuu actualiza!!");
            return true;
        } catch (SQLException ex) {
            System.out.println("No pudo acceder al procedimiento update ni porra");
            return false;
        }
    }
    
    public boolean eliminar(String id){
        try(
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PROVEEDORES_DELETE(?)}");
        ) {
            statement.setString(1, id);
            
            statement.execute();
            statement.close();
//            statement = null;
            c.desconectar();
 
            System.out.println("siuuuu !!");
            return true;
        } catch (SQLException ex) {
            System.out.println("No pudo acceder al procedimiento update ni porra");
            return false;
        }
    }
}