package org.clevermonkeylabs.framework.controller;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Controller<V, M> {
    private V view;
    private M model;

    public void setView(V view) {
        this.view = view;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
