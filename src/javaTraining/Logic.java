package javaTraining;

public class Logic {
    /*
     * Logic operators (>, >=, <, <=, ==, !=)
     * Logic gates (&&, ||, !)
     */
    public static void main(String[] args) {
        // Truth table:
        // AND (only T and T = T, other = F)
        // OR (only F or F = F, other = T)
        // NOT (!T = F, !F = T)
        System.out.println(true);
        System.out.println(false);
        System.out.println(3<2);
        System.out.println(4==4);
        System.out.println((3>2)&&(3>5));
        System.out.println((3>2)||(3>5));
        System.out.println(!(3>5));
    }
}
