package org.clevermonkeylabs.labchimp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.clevermonkeylabs.framework.view.LoadableView;
import org.clevermonkeylabs.framework.view.Position;
import org.clevermonkeylabs.framework.view.ViewBuilder;

public class LabChimpApplication extends Application {

    public static final String APP_NAME = "LabChimp";
    public static final String APP_VERSION = "v1.0";
    public static final int APP_WINDOW_WIDTH = 800;
    public static final int APP_WINDOW_HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Setup GUI layout from fxml file
        Parent root = buildLabChimpView();


        // Display
        primaryStage.setScene(new Scene(root, APP_WINDOW_WIDTH, APP_WINDOW_HEIGHT));
        primaryStage.setTitle(APP_NAME + " - " + APP_VERSION);
        primaryStage.show();
    }

    private static Parent buildLabChimpView() {
        BorderPane borderPane = new BorderPane();

        ViewBuilder viewBuilder = new ViewBuilder();

        viewBuilder.addView(new LoadableView(Position.TOP, "menubar-layout.fxml"));
        //viewBuilder.addView(new LoadableView(Position.TOP, "menubar-layout.fxml"));

        return (Parent) viewBuilder.buildNode(borderPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}