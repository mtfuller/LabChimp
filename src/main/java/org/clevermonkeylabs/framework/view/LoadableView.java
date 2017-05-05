package org.clevermonkeylabs.framework.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by Thomas on 5/5/2017.
 */
public abstract class LoadableView extends View {
    private String fxmlPath;

    public LoadableView(Position position, String fxmlPath) {
        super(position);
        this.fxmlPath = fxmlPath;
    }

    private Parent loadView() throws IOException {
        return FXMLLoader.load(getClass().getResource(fxmlPath));
    }
}
