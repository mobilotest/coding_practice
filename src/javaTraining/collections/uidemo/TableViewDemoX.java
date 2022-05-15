package javaTraining.collections.uidemo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TableViewDemoX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //define table view
        //1 - define data set
        ObservableList<Accounts> accountList = FXCollections.observableArrayList(
                new Accounts("Chizhik", "Pyzhik", "admin"),
                new Accounts("Sivka", "Burka", "developer"),
                new Accounts("Serik", "Berik", "tester"),
                new Accounts("Anau", "Mynau", "manager")
        );

        //2 - define table view
        TableView<Accounts> tvAccounts = new TableView<>(accountList);
        TableColumn<Accounts, String> fUserName = new TableColumn<>("User Name"); //title
//        fUserName.setCellFactory(new PropertyValueFactory<>("UserName")); //real data
        tvAccounts.getColumns().add(fUserName);
        TableColumn<Accounts, String> fPassword = new TableColumn<>("Password");
//        fPassword.setCellFactory(new PropertyValueFactory<>("passWord"));
        tvAccounts.getColumns().add(fPassword);
        TableColumn<Accounts, String> fType = new TableColumn<>("Type");
//        fType.setCellFactory(new PropertyValueFactory<>("type"));

        tvAccounts.getColumns().add(fType);
        tvAccounts.setPrefSize(300, 300);
        //access events
        TableView.TableViewSelectionModel<Accounts> tvSelectModule = tvAccounts.getSelectionModel();
        tvSelectModule.selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int index = (int) newValue;
                System.out.println("Name: "+accountList.get(index).getUserName());
            }
        });
        FlowPane root = new FlowPane();
        root.getChildren().add(tvAccounts);
    }
}
