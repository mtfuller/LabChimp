package org.clevermonkeylabs.labchimp.model;

import javafx.beans.property.SimpleStringProperty;
import org.fxmisc.undo.UndoManager;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Thomas on 5/5/2017.
 */
public class OpenedFile {
    private File file;
    private String fileContent;
    private UndoManager undoManager;

    public OpenedFile(File file) throws IOException {
        this.file = file;
        byte[] fileData = Files.readAllBytes(Paths.get(this.file.toURI()));
        fileContent = new String(fileData, StandardCharsets.UTF_8);
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
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
