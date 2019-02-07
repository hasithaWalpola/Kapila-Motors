/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facile;

/**
 *
 * @author pi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectionManager {
    
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://127.0.0.1:3306/facile";
    
    public static Connection connect(){
       
        Connection con = null; 
        
        try{
            
            Class.forName(driver);
           con = DriverManager.getConnection(url,"root","");
          // con = DriverManager.getConnection(url,"root"," ");
             System.out.println(con.getCatalog());
            
        }catch(SQLException | ClassNotFoundException ex ){
            
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
            
        }
        
        return con;
        
        
    }
    
}

