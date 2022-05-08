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
            System.out.println("Select the process\n1 - add\n2 = select\n3 - delete\n4 - update password");
            Statement stmt = c.createStatement();
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
                    String SQLadd = "Insert into admins (user_name, password) values ('"+user_name+"','"+password+"')";
                    stmt.executeUpdate(SQLadd);
                    stmt.close();
                    c.commit(); //add //delete //update
                    c.close();
                    System.out.println("Record is added");
                    break;
                case 2:
                    //selection
                    String SWLread = "Select * from adming";
                    ResultSet rs = stmt.executeQuery(SWLread);
                    System.out.println("id\tUserName\tPassWord");
                    while (rs.next()){
                        int id = rs.getInt("id");
                        String UserName = rs.getString("user_name");
                        String PassWord = rs.getString("password");
                        System.out.println(id+"\t"+UserName+"\t"+PassWord);
                    }
                    rs.close();
                    stmt.close();
                    c.close();
                    break;
                case 3:
                    //delete
                    Scanner IDdelete = new Scanner(System.in);
                    System.out.print("Enter ID: ");
                    int id_del = IDdelete.nextInt();
                    String SQLdelete = "Delete from admins where (id) value: "+id_del;
                    stmt.executeUpdate(SQLdelete);
                    stmt.close();
                    c.commit(); //add //delete //update
                    c.close();
                    System.out.println("Record is deleted");
                    break;
                case 4:
                    //update password
                    Scanner IDupdate = new Scanner(System.in);
                    Scanner PasscodeUpdate = new Scanner(System.in);
                    System.out.print("Enter ID: ");
                    int id_upd = IDupdate.nextInt();
                    System.out.print("Enter new password: ");
                    String password_new = PasscodeUpdate.nextLine();
                    String SQLupdate = "Update admins set password = '"+password_new+"'"+"where id= "+ id_upd;
                    stmt.executeUpdate(SQLupdate);
                    stmt.close();
                    c.commit(); //add //delete //update
                    c.close();
                    System.out.println("Record is updated");
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
