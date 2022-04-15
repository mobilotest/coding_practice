package javaTraining;

import java.util.Scanner;

public class SimpleIF {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your grade: ");
        int grade = scan.nextInt();
        if((grade>=90)&&(grade<=100)){
            System.out.println("Grade is A");
        }else if((grade>=70)&&(grade<=89)){
            System.out.println("Your grade is B");
        }else if((grade>=50)&&(grade<=69)){
            System.out.println("Your grade is C");
        }else if((grade>=30)&&(grade<=49)){
            System.out.println("Your grade is D");
        }else if((grade>=1)&&(grade<=29)) {
            System.out.println("Your grade is E");
        }else{
            System.out.println("Fail");
        }
        System.out.println("End the grading");
    }
}
