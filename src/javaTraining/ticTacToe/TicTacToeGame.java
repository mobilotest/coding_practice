package javaTraining.ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToeGame extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button btn1 = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    Button btn4 = new Button();
    Button btn5 = new Button();
    Button btn6 = new Button();
    Button btn7 = new Button();
    Button btn8 = new Button();
    Button btn9 = new Button();

    @Override
    public void start(Stage primaryStage) {
        btn1.setText(" ");
        btn1.setOnAction(event->{
            PlayGame(1,btn1);
        });

        btn2.setText(" ");
        btn2.setOnAction(event->{
            PlayGame(2,btn2);
        });

        btn3.setText(" ");
        btn3.setOnAction(event->{
            PlayGame(3,btn3);
        });

        btn4.setText(" ");
        btn4.setOnAction(event->{
            PlayGame(4,btn4);
        });

        btn5.setText(" ");
        btn5.setOnAction(event->{
            PlayGame(5,btn5);
        });

        btn6.setText(" ");
        btn6.setOnAction(event->{
            PlayGame(6,btn6);
        });

        btn7.setText(" ");
        btn7.setOnAction(event->{
            PlayGame(7,btn7);
        });

        btn8.setText(" ");
        btn8.setOnAction(event->{
            PlayGame(8,btn8);
        });

        btn9.setText(" ");
        btn9.setOnAction(event->{
            PlayGame(9,btn9);
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        grid.add(btn1,0,0);
        grid.add(btn2,1,0);
        grid.add(btn3,2,0);
        grid.add(btn4,0,1);
        grid.add(btn5,1,1);
        grid.add(btn6,2,1);
        grid.add(btn7,0,2);
        grid.add(btn8,1,2);
        grid.add(btn9,2,2);

        Scene scene = new Scene(grid, 400, 400);
        scene.getStylesheets().add(TicTacToeGame.class.getResource("style.css").toExternalForm());

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    ArrayList<Integer> playr1= new ArrayList<>();
    ArrayList<Integer> playr2= new ArrayList<>();
    int activePlayer = 1;
    void PlayGame(int cellID, Button selectedBtn){
        System.out.println("cellId: "+cellID);
        if(activePlayer==1){
            selectedBtn.setText("X");
            playr1.add(cellID);
            activePlayer=2;
            AutoPlayer();
        }else if(activePlayer==2){
            selectedBtn.setText("O");
            playr2.add(cellID);
            activePlayer=1;
        }
        selectedBtn.setDisable(true);
        CheckWinner();
    }

    void CheckWinner(){
        int winner = -1;
        if(playr1.contains(1)&&playr1.contains(2)&&playr1.contains(3)){winner = 1;}
        if(playr2.contains(1)&&playr2.contains(2)&&playr2.contains(3)){winner = 2;}

        if(playr1.contains(4)&&playr1.contains(5)&&playr1.contains(6)){winner = 1;}
        if(playr2.contains(4)&&playr2.contains(5)&&playr2.contains(6)){winner = 2;}

        if(playr1.contains(7)&&playr1.contains(8)&&playr1.contains(9)){winner = 1;}
        if(playr2.contains(7)&&playr2.contains(8)&&playr2.contains(9)){winner = 2;}

        if(playr1.contains(1)&&playr1.contains(4)&&playr1.contains(7)){winner = 1;}
        if(playr2.contains(1)&&playr2.contains(4)&&playr2.contains(7)){winner = 2;}

        if(playr1.contains(2)&&playr1.contains(5)&&playr1.contains(8)){winner = 1;}
        if(playr2.contains(2)&&playr2.contains(5)&&playr2.contains(8)){winner = 2;}

        if(playr1.contains(3)&&playr1.contains(6)&&playr1.contains(9)){winner = 1;}
        if(playr2.contains(3)&&playr2.contains(6)&&playr2.contains(9)){winner = 2;}

        if(playr1.contains(1)&&playr1.contains(5)&&playr1.contains(9)){winner = 1;}
        if(playr2.contains(1)&&playr2.contains(5)&&playr2.contains(9)){winner = 2;}

        if(playr1.contains(3)&&playr1.contains(5)&&playr1.contains(7)){winner = 1;}
        if(playr2.contains(3)&&playr2.contains(5)&&playr2.contains(7)){winner = 2;}

        //show the winner message
        if(winner !=-1){
            String message = "";
            if(winner==1){
                message="Player 1 is the winner!";
            }
            if(winner==2){
                message="Player 2 is the winner!";
            }

            //alert sialog
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game is over!");
            alert.setContentText(message);
            alert.setHeaderText("Playing info");
            alert.show();
        }
    }

    void AutoPlayer(){
        ArrayList<Integer> emptyCells = new ArrayList<>();
        for (int cell=1; cell<10; cell++){
            if(!(playr1.contains(cell) || playr2.contains(cell))){
                emptyCells.add(cell);
            }
        }
        Random r = new Random();
        int randIndex = r.nextInt(emptyCells.size()-0)+0;
        int cellID = emptyCells.get(randIndex);
        Button selectedBtn;
        switch (cellID){
            case 1:
                selectedBtn=btn1;
                break;
            case 2:
                selectedBtn=btn2;
                break;
            case 3:
                selectedBtn=btn3;
                break;
            case 4:
                selectedBtn=btn4;
                break;
            case 5:
                selectedBtn=btn5;
                break;
            case 6:
                selectedBtn=btn6;
                break;
            case 7:
                selectedBtn=btn7;
                break;
            case 8:
                selectedBtn=btn8;
                break;
            case 9:
                selectedBtn=btn9;
                break;
            default:
                selectedBtn=btn1;
        }
        PlayGame(cellID, selectedBtn);
    }
}
