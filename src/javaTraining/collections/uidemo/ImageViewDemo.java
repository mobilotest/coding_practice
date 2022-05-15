package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static com.sun.tools.doclint.Entity.image;

public class ImageViewDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image pic = new Image("uidemo/image.jpg");
        ImageView ivPic = new ImageView(pic);
        ivPic.setFitHeight(300);
        ivPic.setFitWidth(250);
        BorderPane pane = new BorderPane();
        pane.setCenter(ivPic);

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //param args the command line argument
    public static void main(String[] args) {
        launch(args);
    }
}
