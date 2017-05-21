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

    public void setup() {
        view.getCodeEditor().richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved()))
                .subscribe(change -> {
                    System.out.println(change.toString());
                    model.getCurrentFile().changeFileContent(change.getInserted().getText(),
                            change.getRemoved().getText(), change.getPosition());
                    }
                );
    }

    @Override
    public void update(Observable o, Object arg) {
        String content = model.getCurrentFile().getFileContent();
        view.getCodeEditor().replaceText(0,0,content);
    }
}
