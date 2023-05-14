/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author AKASH
 */
public class db {
    Connection conn = null;
    public static Connection java_db(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            System.out.println("Before Connection");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
//             = DriverManager.getConnection("jdbc:mysql://localhost:3306/smobile", "root", "root");
            System.out.println("Connected");
            return conn;           
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
   
    }
    
    
    
}
