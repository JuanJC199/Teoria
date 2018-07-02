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
public class daoOrdenes_Compras {
    Conexion c;
    
    public daoOrdenes_Compras(){
        c = new Conexion();
    }
    
    public boolean create(String condiciones_pago, String productos_comprar, 
                          String fecha_oc, String lugar_entrega, String id_proveedor, String pendiente){
        try (
             Connection cx = c.conectar();
             CallableStatement statement = cx.prepareCall("{CALL SP_OC_CREATE(?, ?, ?, ?, ?, ?)}");  
        ){
           statement.setString(1,condiciones_pago );
           statement.setString(2,productos_comprar );
           statement.setString(3,fecha_oc );
           statement.setString(4,lugar_entrega );
           statement.setString(5,id_proveedor );
           statement.setString(6,pendiente );
           
           statement.execute();
           statement.close();
           
           c.desconectar();
           
            System.out.println("Almacena ");
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
//            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean update(String id_compra,String condiciones_pago, String productos_comprar, 
                          String fecha_oc, String lugar_entrega, String id_proveedor, String pendiente)
    {
        try (
             Connection cx = c.conectar();
             CallableStatement statement = cx.prepareCall("{CALL SP_OC_UPDATE(?, ?, ?, ?, ?, ?, ?)}");  
        ){
           statement.setString(1,id_compra );
           statement.setString(2,condiciones_pago );
           statement.setString(3,productos_comprar );
           statement.setString(4,fecha_oc );
           statement.setString(5,lugar_entrega );
           statement.setString(6,id_proveedor );
           statement.setString(7,pendiente );
           
           statement.execute();
           statement.close();
           
           c.desconectar();
           
            System.out.println("Actualiza!!! ");
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
//            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(String id_compra){
        
        try(
            Connection cx = c.conectar();
            CallableStatement statement = cx.prepareCall("{CALL SP_OC_DELETE(?)}");
        ) { 
            statement.setString(1, id_compra);
            System.out.println("Se elimina!!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Se elimino el hijo de su madre");
            return false;
        }
    }
}
