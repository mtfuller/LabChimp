package org.clevermonkeylabs.labchimp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Setup GUI layout from fxml file
        Parent root = FXMLLoader.load(getClass().getResource("/labchimp-layout.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));

        // Load in RichTextFx editor
        CodeArea codeArea = new CodeArea();
        codeArea.setStyle("-fx-font-size: 22");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        VBox codeEditor = (VBox) primaryStage.getScene().lookup("#codeEditor");
        VirtualizedScrollPane codeEditorPane = new VirtualizedScrollPane<>(codeArea);
        VBox.setVgrow(codeEditorPane, Priority.ALWAYS);
        codeEditor.getChildren().add(codeEditorPane);

        // Display GUI Editor
        primaryStage.setTitle("LabChimp");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}