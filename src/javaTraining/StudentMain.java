package javaTraining;

public class StudentMain {
    public static void main(String[] args) {
        Students st = new Students("Myshka", Gender.Female);
        System.out.println("Name: "+st.firstName);
        System.out.println("Gender: "+st.gender);
    }
}
