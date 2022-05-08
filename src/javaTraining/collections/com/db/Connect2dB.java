package javaTraining.collections.com.db;
import java.sql.*;
import java.util.Scanner;

public class Connect2dB {
    public static void main(String[] args) {
    Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:info.db");
            System.out.println("Connected successfully");
            //add user
            System.out.println("Select the process\n1 - add\n2 = selection");
            Scanner reader = new Scanner(System.in);
            int processIndex = reader.nextInt();
            switch (processIndex){
                case 1:
                    //add
                    Scanner username = new Scanner(System.in);
                    Scanner passcode = new Scanner(System.in);
                    System.out.print("Enter user name: ");
                    String user_name = username.nextLine();
                    System.out.print("Enter password: ");
                    String password = passcode.nextLine();
                    String SQLadd = "insert into admins (user_name, password) values ('"+user_name+"','"+password+"')";
                    Statement stmt1 = c.createStatement();
                    stmt1.executeUpdate(SQLadd);
                    c.commit(); //add //delete //update
                    stmt1.close();
                    c.close();
                    System.out.println("Record is added");
                    break;
                case 2:
                    //selection
                    Statement stmt2 = c.createStatement();
                    String SWLread = "select * from adming";
                    ResultSet rs = stmt2.executeQuery(SWLread);
                    System.out.println("id\tUserName\tPassWord");
                    while (rs.next()){
                        int id = rs.getInt("id");
                        String UserName = rs.getString("user_name");
                        String PassWord = rs.getString("password");
                        System.out.println(id+"\t"+UserName+"\t"+PassWord);
                    }
                    rs.close();
                    stmt2.close();
                    c.close();
                    break;
                default:
                    break;
            }

        }catch (Exception e){
        System.out.println("can not connect successfully");
        System.exit(0);
        }
    }
}
