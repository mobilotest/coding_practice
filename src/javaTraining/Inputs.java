package javaTraining;

import java.util.Scanner;

public class Inputs {
    static Scanner reader = new Scanner(System.in);
    static Scanner reader1 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        String name = reader.nextLine();
        System.out.print("Please enter your age: ");
        int age = reader.nextInt();
        System.out.print("Please enter your salary: ");
        double salary = reader.nextDouble();
        System.out.print("Please enter your gender: ");
        String input = reader1.nextLine();
        char gender = input.charAt(0);
        float boo = 5.4f;
        System.out.println();
        System.out.println("Name: "+name+" ("+gender+")");
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
