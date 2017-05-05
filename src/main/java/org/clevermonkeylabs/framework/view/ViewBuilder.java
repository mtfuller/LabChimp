package org.clevermonkeylabs.framework.view;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import org.clevermonkeylabs.framework.controller.Controller;

import java.util.ArrayList;

/**
 * Created by Thomas on 5/5/2017.
 */
public class ViewBuilder {
    private ArrayList<View> views = new ArrayList<>();

    public boolean addView(View view) {
        return views.add(view);
    }

    public Node buildNode(BorderPane borderPane) {
        for (View v : views) {
            Node n = v.buildView();
            switch (v.getPosition()) {
                case TOP:
                    borderPane.setTop(n);
                    break;
                case LEFT:
                    borderPane.setLeft(n);
                    break;
                case CENTER:
                    borderPane.setCenter(n);
                    break;
                case RIGHT:
                    borderPane.setRight(n);
                    break;
                case BOTTOM:
                    borderPane.setBottom(n);
            }
        }
        return borderPane;
    }
}
