package org.clevermonkeylabs.labchimp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.clevermonkeylabs.framework.controller.Controller;
import org.clevermonkeylabs.framework.view.LoadableView;
import org.clevermonkeylabs.framework.view.Position;
import org.clevermonkeylabs.framework.view.ViewBuilder;
import org.clevermonkeylabs.labchimp.controller.CodeEditorController;
import org.clevermonkeylabs.labchimp.controller.MenuBarController;
import org.clevermonkeylabs.labchimp.model.LabChimpApplicationModel;
import org.clevermonkeylabs.labchimp.model.ProjectArchive;
import org.clevermonkeylabs.labchimp.model.Workspace;
import org.clevermonkeylabs.labchimp.view.CodeEditorView;

public class LabChimpApplication extends Application {

    public static final String APP_NAME = "LabChimp";
    public static final String APP_VERSION = "v1.0";
    public static final int APP_WINDOW_WIDTH = 800;
    public static final int APP_WINDOW_HEIGHT = 600;

    // Model
    private LabChimpApplicationModel applicationModel;

    // Views
    private ViewBuilder viewBuilder = new ViewBuilder();
    private LoadableView menubar = new LoadableView(Position.TOP, "menubar-layout.fxml");
    private LoadableView projectTree = new LoadableView(Position.LEFT, "project-tree-layout.fxml");
    private CodeEditorView codeEditor = new CodeEditorView(Position.CENTER, new CodeEditorController());

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Setup Application Model
        Workspace workspace = new Workspace();
        ProjectArchive projectArchive = new ProjectArchive();
        applicationModel = new LabChimpApplicationModel(workspace, projectArchive);

        // Setup GUI layout from fxml file
        Parent root = buildLabChimpView();

        // Setup Controllers for Views
        menubar.getController().setModel(applicationModel);
        menubar.getController().setStage(primaryStage);

        codeEditor.getController().setModel(workspace);
        workspace.addObserver((CodeEditorController) codeEditor.getController());

        // Display
        primaryStage.setScene(new Scene(root, APP_WINDOW_WIDTH, APP_WINDOW_HEIGHT));
        primaryStage.setTitle(APP_NAME + " - " + APP_VERSION);
        primaryStage.show();
    }

    private Parent buildLabChimpView() {
        BorderPane borderPane = new BorderPane();

        viewBuilder.addView(menubar);
        viewBuilder.addView(projectTree);
        viewBuilder.addView(codeEditor);

        return (Parent) viewBuilder.buildNode(borderPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}