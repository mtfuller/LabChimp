package org.clevermonkeylabs.labchimp.controller;

import javafx.beans.property.SimpleStringProperty;
import org.clevermonkeylabs.framework.controller.Controller;
import org.clevermonkeylabs.labchimp.model.Workspace;
import org.clevermonkeylabs.labchimp.view.CodeEditorView;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Thomas on 5/5/2017.
 */
public class CodeEditorController extends Controller<CodeEditorView, Workspace> implements Observer{



    @Override
    public void update(Observable o, Object arg) {
        System.out.println(model.getCurrentFile());
        String content = model.getCurrentFile().getFileContent();
        System.out.println(content);
        System.out.println(view);
        view.getCodeEditor().replaceText(0,0,content);
    }
}
