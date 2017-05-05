package org.clevermonkeylabs.labchimp.model;

import java.util.ArrayList;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Workspace {
    private ArrayList<OpenedFile> openedFiles = new ArrayList<>();
    private OpenedFile currentFile = null;

    public OpenedFile getCurrentFile() {
        return currentFile;
    }

    public void setCurrentFile(OpenedFile currentFile) {
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
        return openedFiles.add(openedFile);
    }

    public boolean removeFile(OpenedFile o) {
        return openedFiles.remove(o);
    }

    public void clearFiles() {
        openedFiles.clear();
    }
}
