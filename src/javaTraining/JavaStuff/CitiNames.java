package javaTraining.JavaStuff;

import java.util.Scanner;

public class CitiNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your City Name: ");
        String name = sc.nextLine().toLowerCase().trim();
        if(name.equals("milpitas")){
            System.out.println("Hello Cali Center!");
        }else if(name.equals("san diego")){
            System.out.println("Hello Cali South!");
        }else if(name.equals("eureka")){
            System.out.println("Hello Cali North!");
        }else{
            System.out.println("Please enter a valid city name");
        }
    }

}
