/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.*;
/**
 *
 * @author Nico
 */
public class mydb {
    
       private Connection conector;
       
       
       public Connection getConexion() throws SQLException{
           try{
               this.conector = DriverManager.getConnection("jdbc:mysql://localhost/py", "root", "");
  
           }catch(Exception e){
               System.out.println("Error en mydb: " + e);
           }
           return this.conector;
       }
}
