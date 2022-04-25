package javaTraining;

public class Generic <M,N>{
    public static void main(String[] args) {
        String[] a1 = {"Alex", "Jonathan", "Karen"};
        Integer[] a2 = {1, 2, 3, 34, 2, 17};
        Double[] a3 = {2.4, 6.3, 4.9};
//        M[] a3 = {2.4, 6.3, 4.9};
        print(a1);
        print(a2);
        print(a3);
    }
    static <T> void print(T[] ar){
        for(T s: ar){
            System.out.println(s);
        }
    }
//    static void print(int[] ar){
//        for(int s: ar){
//            System.out.println(s);
//        }
//    }
//    static void print(double[] ar){
//        for(double s: ar){
//            System.out.println(s);
//        }
//    }
}
