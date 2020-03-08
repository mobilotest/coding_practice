package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        reverseInsideParenthases();


        System.out.println("- - - - - - - -");
        weirdInput();

        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8};

        countUnique(arr);

        System.out.println();

        dublicatedWords();


//        isPalindrome("mom");
//        StringReplaceEmp();
//        dublicatedWords();

//    Case1.
//    Input Format
//    The first line contains a string A. The second line contains another string B . The strings are comprised of
//    only lowercase English letters.
//    Output Format
//    There are three lines of output:
//    For the first line, sum the lengths of A and B .
//    For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//    For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a
//    space.
//    Sample Input 0
//    hello
//    java
//    Sample Output 0
//    9
//    No
//    Hello Java

        //    1. Given two strings of lowercase English letters, and , perform the following operations:
//    Sum the lengths of A and B.
        String A = "hello";
        String B = "world";
        int lengthA = A.length();
        int lengthB = B.length();
        int sum = lengthB + lengthA;
        System.out.println(sum);

//    2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //    3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
        String CapitalizedStringA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String CapitalizedStringB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(CapitalizedStringA + " " + CapitalizedStringB);
    }


//    Case2:
//    Task Given an integer, , perform the following conditional actions: If is odd, print Weird If is even and in
//    the inclusive range of to , print Not Weird If is even and in the inclusive range of to , print Weird If is
//    even and greater than , print Not Weird Complete the stub code provided in your editor to print whether or
//    not is weird. Input Format A single line containing a positive integer, . Constraints
//    Output Format Print Weird if the number is weird; otherwise, print Not Weird.
//    Sample Input 0
//            3
//
//    Sample Output 0
//    Weird
//
//    Sample Input 1
//            24
//    Sample Output 1
//    Not Weird

    public static void weirdInput() {
        System.out.print("Enter your number 1-100: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) { //If n is odd, print Weird
            ans = "Weird";
        } else {
            if (n >= 2 && n <= 5) { //If n is even and in the inclusive range of 2 to 5, print Not Weird
                ans = "Not Weird";
            } else if (n >= 6 && n <= 20) { //If n is even and in the inclusive range of 6 to 20, print Weird
                ans = "Weird";
            } else {
                ans = "Not Weird"; //If n is even and greater than 20, print Not Weird
            }
        }
        System.out.println(ans);
    }


//    Case3:
//    Check a given number is palindrome or not.

    public static boolean isPalindrome(String s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

//    Case4:
//    How to replace a substring inside a string by another one ?

    public static void StringReplaceEmp() {
        String str = "Hello World";
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));
    }


    //    Case5:
//    Take an Input String with duplicate words.
//    Try to print the duplicate occurrence of words in the String.
//            Please try to solve the issue using HashMap.
//    Example :
//    Input : “This is a java Program java Program”
//    Output:
//    a=1
//    java=2
//    Program=2
//    This=1
//    is=1
//
    public static void dublicatedWords() {
        String str = "This is a java Program java Program";
        String item[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + " = ");
            System.out.println(map.get(key));
        }

    }


//    NoSuchElement Exception - when will it be thrown and how to avoid it?
    //An object of this class is thrown when a collection or iterator is empty.

//    How do I find out if element is present on the page
    //driver.findElements( By.id("...") ).size() != 0


//    Implement a function called countUniqueValues, which accepts a sorted array and counts the unique
//    values in the array.
//    int[] arr = [1,2,3,3,4,5,5,6,7,8]
//            3 - 2, 5 - 2

    public static void countUnique(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);

            } else {
                map.put(i, 1);
            }
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (map.get(key) > 1) {
                System.out.print(key + " = ");
                System.out.println(map.get(key));
            }
        }
    }

    public static void reverseInsideParenthases() {

        String test = "System(out)println";
        int open = test.indexOf('(');
        int close = test.indexOf(')');

        StringBuilder newString = new StringBuilder();

        String myArray[] = test.split("[\\(||\\)]");

        System.out.println(Arrays.toString(myArray));
        char[] wordArr = test.toCharArray();
        System.out.println(Arrays.toString(wordArr));

        for (int i = 0; i < open; i++) {
            newString.append(wordArr[i]);
            System.out.println(newString);
        }



        for (int i = close+1; i < test.length(); i++) {
            newString.append(wordArr[i]);
            System.out.println(newString);
        }

        System.out.println(newString);
        System.out.println("- - - - - - - -");
    }

// *** String vs StringBuffer vs StringBuilder ***
// String is immutable whereas StringBuffer and StringBuider are mutable classes.
// StringBuffer is thread safe and synchronized whereas StringBuilder is not, thats why StringBuilder is more faster than StringBuffer.
// String concat + operator internally uses StringBuffer or StringBuilder class.
// For String manipulations in non-multi threaded environment, we should use StringBuilder else use StringBuffer class.
}