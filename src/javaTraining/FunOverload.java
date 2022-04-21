package javaTraining;

public class FunOverload {

    float Sub(float n1, float n2){
        float res=n1-n2;
        return res;
    }

    float Sub(float n1, float n2, float n3){
        float res=n1-n2-n3;
        return res;
    }

    public static void main(String[] args) {
        float s1 = new FunOverload().Sub(5,2);
        System.out.println("s1: "+s1);

        float s2 = new FunOverload().Sub(5,2,1);
        System.out.println("s2: "+s2);
    }
}
