package org.clevermonkeylabs.labchimp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/hello/sample.fxml"));
        primaryStage.setTitle("LabChimp");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        ObservableList<Integer> names = FXCollections.observableArrayList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,22,23,24,25,26,27,28,29,30);

        ListView<Integer> list = (ListView<Integer>) primaryStage.getScene().lookup("#lineNums");
        System.out.println(list);
        System.out.println(names);
        list.setItems(names);
    }


    public static void main(String[] args) {
        launch(args);
    }
}