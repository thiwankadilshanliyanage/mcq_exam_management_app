
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thiwanka
 */
public class dbclass {
    private static final String URL="jdbc:mysql://localhost:3306/mcq_manage_app";
    private static final String USERNAME="root";
    private static final String PASSWORD="thiwanka123";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    
    private static Connection c;
    
    private dbclass(){}
    
    public static synchronized Connection getConnect(){
        try {
            if(c==null){
                Class.forName(DRIVER);
                c=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return c;
    }
    public static void iud(String query){
        try {
            getConnect().createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static ResultSet search(String query){
        ResultSet rs= null;
        try {
            rs=getConnect().createStatement().executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
    }
    public static void main(String[] args) {
        System.out.println(c);
    }
}
