package javaTraining;

/*
 * 1. ()
 * 1. (--, ++ before)
 * 2. ^
 * 3. + -
 * 4. * /
 * 5. =
 * 6. (--, ++ after)
 */

// ++n = n++ --> n=n+1
// --n = n-- --> n=n-1

public class Operations {
    public static void main(String[] args) {
    int n1 = 5;
    int n2 = 10;
    int n3 = 15;
    int sum = (++n1+n2)*n3;
    System.out.println(sum);
    }
}
