package javaTraining.pack2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeFile {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Picka Boo";
        emp.age = 26;

        try{
            FileOutputStream fo = new FileOutputStream("_employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(emp);
            out.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
