/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gl4_tp1_db;

/**
 *
 * @author Hanine
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Gl4_tp1_db {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        // TODO code application logic here
        User user= new User (1,"GL4" ,"GL41023");
        System.out.println(user);
       
        //Step1: Chargement du driver
        Class.forName("com.mysql.jdbc.Driver");
       
     
         //Step2: Etablissemeent de la connexion
         String url ="jdbc:mysql://localhost:3306/gl4_tp_db";
         String login ="root";
         String pwd="";
       
         Connection conn =DriverManager.getConnection(url, login, pwd);
         
         //Preparation de la requete SQL
         String req= "INSERT INTO user (login, pwd) VALUES('"+ user.getLogin() +"','"+ user.getPwd()+"')" ;
         System.out.print(req);
         Statement st = conn.createStatement();
         st.executeUpdate(req);
         
         String req2 ="SELECT * FROM user";
         ResultSet rs =st.executeQuery(req2);
         while(rs.next()){

             System.out.print(rs.getInt(1));
             System.out.print(rs.getString(2));
             System.out.println(rs.getString(3));          
             System.out.println("**************");

       
         }
         
        String req3 ="DELETE FROM user WHERE id=1";
         st.executeUpdate(req3);
         
         String req4 ="UPDATE user SET pwd='GGL42023' WHERE id=2";
         st.executeUpdate(req4);
         
        }catch (ClassNotFoundException ex){
           System.out.print(ex.getMessage());
       
        }catch (SQLException ex){
           System.out.print(ex.getMessage());
       
        }
    
    }
    
}
