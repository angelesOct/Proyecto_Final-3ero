/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar_almacen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Octaviano
 */
public class Database {
                
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            
            cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/fazuca","root","");
            
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }   
}
