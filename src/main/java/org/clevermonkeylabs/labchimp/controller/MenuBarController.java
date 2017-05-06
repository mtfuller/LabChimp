package org.clevermonkeylabs.labchimp.controller;

import javafx.stage.FileChooser;
import org.clevermonkeylabs.framework.controller.Controller;
import org.clevermonkeylabs.framework.view.LoadableView;
import org.clevermonkeylabs.labchimp.model.LabChimpApplicationModel;

import java.io.File;
import java.io.IOException;

/**
 * Created by Thomas on 5/5/2017.
 */
public class MenuBarController extends Controller<LoadableView, LabChimpApplicationModel> {
    public void _new() {

    }

    public void open() {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        try {
            model.openFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {

    }

    public void saveAs() {

    }

    public void undo() {

    }

    public void redo() {

    }

    public void help() {

    }

    public void close() {

    }
}
