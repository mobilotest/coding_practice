package javaTraining.pack2;

public class PlayGameClass {
    public static void main(String[] args) {

        //Lambda expression
        PlayGame myPlayGame = (x, y)-> {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            System.out.println("Game is on");
        };
        myPlayGame.play(2, 4);

        //Without Lambda
//        myPlayGame myClassInstanse = new myPlayGame();
//        myClassInstanse.play();
    }


//    static class myPlayGame implements PlayGame{
//        public void play(){
//            System.out.println("Game is on!");
//        }
//    }
}
