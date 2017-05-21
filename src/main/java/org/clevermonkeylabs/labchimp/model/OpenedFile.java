package org.clevermonkeylabs.labchimp.model;

import javafx.beans.property.SimpleStringProperty;
import org.fxmisc.richtext.model.RichTextChange;
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
    private StringBuilder fileContent;
    private UndoManager undoManager;

    public OpenedFile(File file) throws IOException {
        this.file = file;
        byte[] fileData = Files.readAllBytes(Paths.get(this.file.toURI()));
        fileContent = new StringBuilder(new String(fileData, StandardCharsets.UTF_8));
    }

    public String getFileContent() {
        return fileContent.toString();
    }

    public void changeFileContent(String inserted, String removed, int position) {
        if (!removed.isEmpty()) this.fileContent.replace(position, position+removed.length(), "");
        if (!inserted.isEmpty()) this.fileContent.insert(position, inserted, 0, inserted.length());
    }

    public void rename() {

    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter(this.file, true);
        fileWriter.write(this.getFileContent());
        fileWriter.close();
        System.out.println("finished!!!");
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
