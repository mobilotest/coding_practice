package javaTraining.pack2;

import java.io.FileWriter;

public class MyFile {
    public static void main(String[] args) {
        try{
            FileWriter fo = new FileWriter("_java_test.txt");
            fo.write("welcome to the java file");
            fo.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
