public class Animal {

    String animal;
    int sizeInInches;
    String color;
    int speedOfMoving;
    String habitat;
    String mainFood;

    public Animal(String animal, int sizeInInches, String color, int speedOfMoving, String habitat, String mainFood) {
        this.animal = animal;
        this.sizeInInches = sizeInInches;
        this.color = color;
        this.speedOfMoving = speedOfMoving;
        this.habitat = habitat;
        this.mainFood = mainFood;
    }

    public void animalDescription(){
        System.out.println("The name of the animal is "+animal);
        System.out.println("The size is "+sizeInInches);
        System.out.println("The color is "+color);
    }

    public void eatFood(){
        System.out.println("Main source of food is "+mainFood);
    }

    public void live(){
        System.out.println("Most time active in the " +habitat);
    }

    public void move(){
        System.out.println("The speed of mooving is "+speedOfMoving);
    }
}
