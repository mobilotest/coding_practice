package javaTraining;

public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<15; i=i+1){
//            System.out.print("Count: "+i+", ");
            if(i%4==0) {
                System.out.println("Mode by 4 is: "+i);
            }
        }
        System.out.println();
        //Nested For:
        for(int i=0; i<10;i++){
            System.out.println("*");
            for(int j=i;j>=0; j--){
                System.out.print("-");
            }
        }
    }
}
