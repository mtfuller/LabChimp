package org.clevermonkeylabs.framework.view;

import javafx.scene.Node;

/**
 * Created by Thomas on 5/5/2017.
 */
public abstract class View {
    private Position position;

    public View(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public abstract Node buildView();
}
