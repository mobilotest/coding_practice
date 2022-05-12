package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label laTitle = new Label("Select item from list");
        Label laSelectedAdmin = new Label("You select");

        //create list
        //1- define dataset
        ObservableList<String> accounts = FXCollections.observableArrayList("Admin", "Tester", "Dev", "Manager");
        //2 - define list view and move data to it
        ListView <String> lvAccounts = new ListView<>(accounts);
        lvAccounts.setPrefSize(300, 150);
        lvAccounts.setOrientation(Orientation.VERTICAL);
        //3 - define multi select options
        MultipleSelectionModel<String> lvModule = lvAccounts.getSelectionModel();
        lvModule.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("selected: "+newValue);
                laSelectedAdmin.setText("You selected: "+newValue);
            }
        });
        FlowPane  root  = new FlowPane();
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(laTitle);
        root.getChildren().add(lvAccounts);
        root.getChildren().add(laSelectedAdmin);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //param args the command line argument
    public static void main(String[] args) {
        launch(args);
    }
}
