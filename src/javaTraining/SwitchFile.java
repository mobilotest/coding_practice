package javaTraining;

import java.util.Scanner;

public class SwitchFile {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter index: ");
        int index = read.nextInt();
        switch (index){
        case 1:
        System.out.println("He is male");
        break;
        case 2:
        System.out.println("She is female");
        break;
        default:
        System.out.println("Unknown");
        }
    }
}
