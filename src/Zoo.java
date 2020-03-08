public class Zoo {

    public static void main(String args[]){

        Animal jiraffe = new Animal("Jiraffe", 180, "Orange", 30, "Savana", "Trees");

        jiraffe.animalDescription();
        jiraffe.eatFood();
        jiraffe.live();
        jiraffe.move();

        System.out.println();

        Fish fish = new Fish("Carp", 4, "Silver", 20, "Lake", "Worms");

        fish.fishDescription();
        fish.eatFood();
        fish.live();
        fish.move();

        System.out.println();

        Bird bird = new Bird("Eagle", 9, "White/Brown", 50, "Sky", "Mice");

        bird.animalDescription();
        bird.eatFood();
        bird.live();
        bird.move();

        System.out.println();

        Animal turtle = new Animal("Turtle", 5, "Green", 10, "Ocean", "Fish");

        turtle.animalDescription();
        turtle.eatFood();
        turtle.live();
        turtle.move();
    }
}

