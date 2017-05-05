package org.clevermonkeylabs.framework.view;

import org.clevermonkeylabs.framework.controller.Controller;

/**
 * Created by Thomas on 5/5/2017.
 */
public abstract class ControllableView extends View {
    private Controller<?,?> controller;

    public ControllableView(Position position, Controller<?, ?> controller) {
        super(position);
        this.controller = controller;
    }
}
