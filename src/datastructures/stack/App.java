package datastructures.stack;

public class App {

    public static void main(String args[]){

        System.out.println(reverseString("Hello"));
        Stack theStack = new Stack(3);

//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);

        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }
    }

    public static String reverseString(String str){

        int stackSize = str.length();
        Stack theStack = new Stack(stackSize);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            theStack.push(ch);
        }
        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result+= ch;
        }
        return result;
    }
}
