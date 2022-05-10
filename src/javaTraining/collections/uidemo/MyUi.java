package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyUi extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        //UI define
        Label laNumber1 = new Label("Number 1: ");
        TextField txtNumber1 = new TextField();
        Label laNumber2 = new Label("Number 2: ");
        TextField txtNumber2 = new TextField();
        Label laResults = new Label("Sum = ");
        Button btn = new Button();
        btn.setText("Click to Sum");
        btn.setOnAction(event -> {
            //sum operation
            int n1 = Integer.parseInt(txtNumber1.getText().toString());
            int n2 = Integer.parseInt(txtNumber2.getText().toString());
            int sum = n1+n2;
            laResults.setText("Sum = "+sum); //(String.valueOf(sum));
        });

        // Set UI
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
//        grid.setGridLinesVisible(true); //for development only
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Set UI to grid
        grid.add(laNumber1, 0, 0);
        grid.add(txtNumber2, 1,0);
        grid.add(laNumber2, 0,1);
        grid.add(txtNumber2, 1,1);
        grid.add(laResults, 1,2);
        grid.add(btn, 2,3);

        Scene scene = new Scene(grid, 400, 350);

        primaryStage.setTitle("ANOTHER UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //param args the command line argument
    public static void main(String[] args) {
        launch(args);
    }
}
