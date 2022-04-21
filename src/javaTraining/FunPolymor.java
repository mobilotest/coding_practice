package javaTraining;

public class FunPolymor {

    double div(double n1, double n2){
        return n1/n2;
    }

    double div(int n1, int n2){
        return n1/n2*2;
    }

    double div(int n1, double n2){
        return n1/n2*3;
    }

    public static void main(String[] args) {
        System.out.println("Result: "+ new FunPolymor().div(10.1,5.3));
        System.out.println("Result: "+ new FunPolymor().div(10,5));
        System.out.println("Result: "+ new FunPolymor().div(10,5.4));
    }
}
