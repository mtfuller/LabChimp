package org.clevermonkeylabs.framework.controller;

import javafx.stage.Stage;
import org.clevermonkeylabs.framework.view.View;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Controller<V extends View, M extends Object> {
    protected V view;
    protected M model;
    protected Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setView(V view) {this.view = view;}

    public void setModel(M model) {
        this.model = model;
    }
}
