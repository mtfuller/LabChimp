package org.clevermonkeylabs.framework.controller;

import javafx.stage.Stage;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Controller<V, M> {
    protected V view;
    protected M model;
    protected Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public <P> void setView(P view) {
        this.view = (V) view;
    }

    public <P> void setModel(P model) {
        this.model = (M) model;
    }
}
