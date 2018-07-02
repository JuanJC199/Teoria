/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Conexion {
    Connection cx;
    String bd ="sistema_transaccional";
    String url= "jdbc:mysql://localhost:3306/"+bd;
    
    public static void main (String[] args){
//        Conexion c = new Conexion();
//        c.conectar();
    }
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx= DriverManager.getConnection(url,"carlosadmin","sistem123");
            System.out.println("Se conecto bien");
        }catch(Exception e){
            System.out.println("No se conecto");
        }
        return cx;
    }
    

    void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
