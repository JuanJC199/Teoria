/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import JFrames.MDI;

public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // new MDI().setVisible(true);
       Conexion cx = new Conexion() ;
       cx.conectar();
    }
    
}
