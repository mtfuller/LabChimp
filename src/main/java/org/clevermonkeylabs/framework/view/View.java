package org.clevermonkeylabs.framework.view;

import javafx.scene.Node;
import org.clevermonkeylabs.framework.controller.Controller;

/**
 * Created by Thomas on 5/5/2017.
 */
public abstract class View {
    private Position position;
    private Controller controller;

    public View(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public abstract Node buildView();
}
