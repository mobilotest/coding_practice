package javaTraining;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        while (i<15){
            if(i%4==0) {
                System.out.println("Mode by 4 is: "+i);
            }
            i++;
        }

        System.out.println();
        int j=16;
        do{
            if (j % 4 == 0) {
                System.out.println("Mode by 4 is: " + j);
            }
            j++;
        }while (j < 16);

        System.out.println();
        for(int k=0; k<15; k=k+1){
//            System.out.print("Count: "+i+", ");
            if(k%4==0) {
                System.out.println("Mode by 4 is: "+k);
            }
        }

        System.out.println();
        //Nested For:
        for(int n=0; n<10;n++){
            System.out.println("*");
            for(int m=n;m>=0;m--){
                System.out.print("-");
            }
        }
    }
}
