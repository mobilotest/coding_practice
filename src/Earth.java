public class Earth {

    public static void main(String args[]){


        Human adam;
        adam = new Human("Adam", 33, 77, "Blue");

        adam.speak();

        System.out.println();

        Human eve = new Human("Eve", 27, 69, "Brown");

        eve.speak();
    }
}
