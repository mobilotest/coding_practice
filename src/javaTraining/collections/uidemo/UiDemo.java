package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UiDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setId("btnc");
        btn.setText("Say 'Hello World!'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });

        btn.setOnAction(event -> {
            System.out.println("Hello World!");
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

//        scene.getStylesheets().add(UiDemo.class.getResource("calculator.css".toExternalForm()));

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //param args the command line argument
    public static void main(String[] args) {
        launch(args);
    }
}
