package org.clevermonkeylabs.labchimp.model.directorytree;

import javafx.beans.property.SimpleStringProperty;

import java.io.File;

/**
 * Created by Thomas on 5/5/2017.
 */
public class FileNode extends TreeNode<File, FileNode> {
    public FileNode(SimpleStringProperty name, File object) {
        super(name, object);
    }
}
