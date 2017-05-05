package org.clevermonkeylabs.framework.controller;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Controller<V, M> {
    protected V view;
    protected M model;

    public void setView(V view) {
        this.view = view;
    }

    public <P> void setModel(P model) {
        this.model = (M) model;
    }
}
