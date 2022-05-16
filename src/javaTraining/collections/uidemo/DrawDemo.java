package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle cir = new Circle(200,70,50);
        cir.setStroke(Color.RED);
        cir.setStrokeWidth(10);
        cir.setFill(Color.YELLOW);

        Line line = new Line(10, 350, 390, 350);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(8);

        Rectangle rec = new Rectangle(150, 270, 100, 70);
        rec.setStroke(Color.GREEN);
        rec.setFill(Color.BLUE);
        rec.setStrokeWidth(10);

        Group root = new Group();
        root.getChildren().addAll(cir, line, rec);
        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);

        primaryStage.setTitle("Draw Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
