package javaTraining;

public class StringFile {
    public static void main(String[] args) {
        String name = "Boocka Kazyukka";
        System.out.println("Length: "+name.length());
        System.out.println("First char: "+name.charAt(0));
        System.out.println("Last char: "+name.charAt(name.length()-1));
        System.out.print("Print char: ");
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.print("Print reverse: ");
        for(int i=name.length()-1; i>=0;i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String text = "It is time to go home";
        String[] splitText = text.split(" ");
        for(int i=0; i<splitText.length; i++){
            System.out.println(splitText[i]);
        }
    }
}
