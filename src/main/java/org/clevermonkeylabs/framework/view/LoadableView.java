package org.clevermonkeylabs.framework.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by Thomas on 5/5/2017.
 */
public class LoadableView extends View {
    private String fxmlPath;

    public LoadableView(Position position, String fxmlPath) {
        super(position);
        this.fxmlPath = fxmlPath;
    }

    @Override
    public Node buildView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(fxmlPath));
            Node n = loader.load();
            setController(loader.getController());
            return n;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
