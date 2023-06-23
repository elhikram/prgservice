/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centreimagerie;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author TAHAR
 */
public class Centreimagerie {

    /**
     * @param args the command line arguments
     */
    static Connection con;
    public static Connection getConnection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centredb","root","");
        
        }
        catch(Exception ex){
        System.out.println(""+ex);
        }
        
        
        
        
        
        
        return con;
    
    }
   
       
       
}
    

