package org.clevermonkeylabs.labchimp.model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Workspace extends Observable{
    private ArrayList<OpenedFile> openedFiles = new ArrayList<>();
    private OpenedFile currentFile = null;

    public OpenedFile getCurrentFile() {
        return currentFile;
    }

    private void setCurrentFile(OpenedFile currentFile) {
        this.currentFile = currentFile;
    }

    public int size() {
        return openedFiles.size();
    }

    public boolean isEmpty() {
        return openedFiles.isEmpty();
    }

    public boolean contains(Object o) {
        return openedFiles.contains(o);
    }

    public boolean addFile(OpenedFile openedFile) {
        setCurrentFile(openedFile);
        boolean bool = openedFiles.add(openedFile);
        setChanged();
        notifyObservers();
        return bool;
    }

    public boolean removeFile(OpenedFile o) {
        return openedFiles.remove(o);
    }

    public void clearFiles() {
        openedFiles.clear();
    }
}
