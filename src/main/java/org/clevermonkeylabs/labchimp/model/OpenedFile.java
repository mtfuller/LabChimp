package org.clevermonkeylabs.labchimp.model;

import javafx.beans.property.SimpleStringProperty;
import org.fxmisc.undo.UndoManager;

import java.io.File;

/**
 * Created by Thomas on 5/5/2017.
 */
public class OpenedFile {
    private File file;
    private SimpleStringProperty fileContent;
    private UndoManager undoManager;

    public OpenedFile(File file) {
        this.file = file;
    }

    public SimpleStringProperty getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent.setValue(fileContent);
    }

    public void rename() {

    }

    public void save() {

    }

    public void saveAs(String newPath) {

    }

    public void undo() {

    }

    public void redo() {

    }

    public void close() {

    }
}
