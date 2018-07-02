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
public class daoProductos_oficina {
    Conexion c;
    
    public daoProductos_oficina(){
        c = new Conexion();
    }
    
    public boolean create(String unidad_medida, String linea, String centro_costo, String destino_producto,
                          String tipo, String activo, String descripcion)
    {
        System.out.println(unidad_medida);
        System.out.println(linea);
        System.out.println(centro_costo);
        System.out.println(destino_producto);
        System.out.println(tipo);
        System.out.println(activo);
        System.out.println(descripcion);
        try (
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PRODUCTOS_OFICINA_CREATE(?, ?, ?, ?, ?, ?, ?)}");
        ) {
            statement.setString(1, unidad_medida);
            statement.setString(2, linea);
            statement.setString(3, centro_costo);
            statement.setString(4, destino_producto);
            statement.setString(5, tipo);
            statement.setString(6, activo);
            statement.setString(7, descripcion);
    
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
    
    public boolean update(String id_producto_oficina, String unidad_medida, String linea, String centro_costo,
                          String destino_producto, String tipo, String activo, String descripcion)
    {
        try(
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_PRODUCTOS_OFICINA_UPDATE(?,?,?,?,?,?,?,?)}");
            
        ) {
            statement.setString(1, id_producto_oficina);
            statement.setString(2, unidad_medida);
            statement.setString(3, linea);
            statement.setString(4, centro_costo);
            statement.setString(5, destino_producto);
            statement.setString(6, tipo);
            statement.setString(7, activo);
            statement.setString(8, descripcion);
            
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
 
            System.out.println("siuuuu elimina!!");
            return true;
        } catch (SQLException ex) {
            System.out.println("No pudo acceder al procedimiento update ni porra");
            return false;
        }
    }
}
