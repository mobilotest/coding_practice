package javaTraining;


public class Functions {

    float summ (float n1, float n2){
        float summ=n1+n2;
        return summ;
    }

    void Draw() {
        for (int n = 0; n < 10; n++) {
            System.out.println("*");
            for (int m = n; m >= 0; m--) {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        new Functions().Draw();
        new Functions().Draw();

        System.out.println("\n\n");
        float result = new Functions().summ(5,6);
        System.out.println(result);
        result = new Functions().summ(51, 9);
        System.out.println(result);
    }
}
