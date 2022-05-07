package javaTraining.collections.com.db;
import java.sql.*;

public class Connect2dB {
    public static void main(String[] args) {
    Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:info.db");
            System.out.println("Connected successfully");
        }catch (Exception e){
        System.out.println("can not connect successfully");
        System.exit(0);
        }
    }
}
