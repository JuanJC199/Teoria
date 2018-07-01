/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Juan
 */
public class Conexion {
    Connection cx;
    String bd ="Proyecto1";
    String url= "jdbc:mysql://localhost:3306/Proyecto1";
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx= DriverManager.getConnection(url,"root","Maria123");
            System.out.println("Se conecto bien");
        }catch(Exception e){
            System.out.println("No se conecto");
        }
        return cx;
    }
}
