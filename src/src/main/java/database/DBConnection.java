package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {



    public static Connection getConnection(){
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://147.102.19.135/exams";
            String username = "exams";
            String password = "exams";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        } catch(Exception e){
            int f = 3;
            System.out.println(e);
        }


        return null;
    }
}
