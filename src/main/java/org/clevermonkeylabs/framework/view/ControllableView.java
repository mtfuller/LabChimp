package org.clevermonkeylabs.framework.view;

import org.clevermonkeylabs.framework.controller.Controller;

/**
 * Created by Thomas on 5/5/2017.
 */
public abstract class ControllableView extends View {
    public ControllableView(Position position, Controller<? extends View, ?> controller) {
        super(position);
        setController(controller);
    }
}
