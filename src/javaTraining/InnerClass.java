package javaTraining;

public class InnerClass {

    class Animal{
        String Name;
        String Voice;
    }

    static class Insect{
        String Name;
        String Voice;
    }

    public static void main(String[] args) {
        Insect insect = new Insect();
        insect.Name = "Mosquito";
        insect.Voice = "bzzzzzzzik";
        System.out.println(insect.Voice);
    }

    void Call(){
        Animal animal = new Animal();
        animal.Name = "Cat";
        animal.Voice = "Miao";
        System.out.println(animal.Name);
    }

}
