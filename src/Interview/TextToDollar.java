package Interview;

import java.util.*;

public class TextToDollar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        Map<Integer, String> units = new HashMap<>();
        units.put(0, "Ten");
        units.put(1, "One");
        units.put(2, "Two");
        units.put(3, "Three");
        units.put(4, "Four");
        units.put(5, "Five");
        units.put(6, "Six");
        units.put(7, "Seven");
        units.put(8, "Eight");
        units.put(9, "Nine");

        Map<Integer, String> teens = new HashMap<>();
        teens.put(11, "Eleven");
        teens.put(12, "Twelve");
        teens.put(13, "Thirteen");
        teens.put(14, "Fourteen");
        teens.put(15, "Fifteen");
        teens.put(16, "Sixteen");
        teens.put(17, "Seventeen");
        teens.put(18, "Eighteen");
        teens.put(19, "Nineteen");

        Map<Integer, String> tens = new HashMap<>();
        tens.put(2, "Twenty");
        tens.put(3, "Thirty");
        tens.put(4, "Forty");
        tens.put(5, "Fifty");
        tens.put(6, "Sixty");
        tens.put(7, "Seventy");
        tens.put(8, "Eighty");
        tens.put(9, "Ninghty");

        int n = input.nextInt();
        int m, th, h, t, u;  // billion, millions, thousands,hundreds,tens,units
        int hTh, tTh, uTh, nTh; //hundred thousand, ten thousand, unit thousand, one Thousand
        int nH; // one

        nTh = (n / 1000) % 100;
        hTh = n / 100000;
        tTh = (n / 10000) % 10;
        uTh = (n / 1000) % 10;
        nH = n % 1000;
        u = n % 10;
        t = (n / 10) % 10;
        h = (n / 100) % 10;
        th = n / 1000;
        m = n / 100000;


        if (n > 0 && n < 11) {
            System.out.print(units.get(u) + "Dollars");
        } else if (n > 10 && n < 20) {
            System.out.print(teens.get(n) + "Dollars");
        } else if (n > 19 && n < 100) {
            System.out.print(tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 99 && n < 1000) {
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 999 && n < 11000) {
            System.out.print(units.get(th) + "Thousand" + units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 10999 && n < 20000) {
            System.out.print(teens.get(nTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 19999 && n < 100000) {
            System.out.print(tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 99999 && n < 111000) {
            System.out.print(units.get(nTh) + "Hundred" + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 110999 && n < 120000) {
            System.out.print(units.get(hTh) + "Hundred" + teens.get(nTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 119999 && n < 1000000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
// TBD
        } else if (n > 999999 && n < 1111000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 1110999 && n < 1120000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 1119999 && n < 11000000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 10999999 && n < 20000000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 19999999 && n < 100000000) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else if (n > 99999999 && n < 110999999) {
            System.out.print(units.get(hTh) + "Hundred" + tens.get(tTh) + units.get(uTh) + "Thousand");
            System.out.print(units.get(h) + "Hundred" + tens.get(t) + units.get(u) + "Dollars");
        } else {
            throw new IllegalArgumentException("Your entered amount is out of boundary");
        }
    }
}
