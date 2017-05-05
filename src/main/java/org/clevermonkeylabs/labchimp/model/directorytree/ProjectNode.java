package org.clevermonkeylabs.labchimp.model.directorytree;

import javafx.beans.property.SimpleStringProperty;
import org.clevermonkeylabs.labchimp.model.Project;

/**
 * Created by Thomas on 5/5/2017.
 */
public class ProjectNode extends TreeNode<Project, FileNode> {
    public ProjectNode(SimpleStringProperty name, Project object) {
        super(name, object);
    }
}
