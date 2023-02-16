
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class koneksi {
     private static Connection koneksi;
     public static Connection configDB() {
         try {
             String db = "jdbc:mysql://localhost:3306/db_hafiyyarreza";
             String user ="root";
             String pass ="";
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             koneksi = DriverManager.getConnection(db, user, pass);
         } catch (Exception e) {
         }
         return koneksi;
     }
}
