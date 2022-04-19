package javaTraining;

import java.util.Scanner;

public class MyArray {
    static Scanner items = new Scanner(System.in);
    public static void main(String[] args) {
        String[] jobs = new String[5];
        jobs[0] = "Developer";
        jobs[1] = "QA";
        jobs[2] = "Manager";
        jobs[3] = "Admin";
        jobs[4] = "Designer";

        for(int i=0;i<5;i++){
            System.out.println("Job: "+jobs[i]);
        }

        System.out.println();
        System.out.println("Enter a product please");
        String[] products = new String[5];
        for(int j=0;j<5;j++){
            products[j]=items.nextLine();
        }
        System.out.println("Print products:");
        for(int k=0;k<5;k++){
        System.out.println("Item: "+products[k]);
        }
    }
}
