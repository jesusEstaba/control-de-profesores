/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jesús Estaba
 */
public class conxClass {
    Connection con=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sistemadecontrol","root","");
            System.out.println("conexion establecida");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion, error: "+e);
        }
    return con;
    }
    
    
}
