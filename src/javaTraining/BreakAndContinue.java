package javaTraining;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<15; i=i+1){
            if(i%4==0){
                continue;
            }
            System.out.println("Count: "+i);
            System.out.println("This line of code is printed");
        }
        System.out.println("#####################################");
        for(int i=0; i<15; i=i+1){
            if(i==10){
                break;
            }
            System.out.println("Count: "+i);
            System.out.println("This line of code is printed");
        }
    }
}
