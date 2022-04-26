package javaTraining.pack2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MyFile {
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter\n1 - to write\n2 - to read\n");
        int op = sc1.nextInt();
        switch(op){
            case 1: //write
                System.out.println("Enter to save to file: ");
                String text = sc2.nextLine();
                FileWriterOn(text);
                break;
            case 2: //read
                FileReaderOn();
                break;
        }
    }
        static void FileWriterOn(String str){
            try{
                FileWriter fo = new FileWriter("_java_test.txt", true); //true means it supports Append
                fo.write(str);
                fo.close();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        static void FileReaderOn() {
            try {
                FileReader fin = new FileReader("_java_test.txt");
                int c;
                while ((c = fin.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

