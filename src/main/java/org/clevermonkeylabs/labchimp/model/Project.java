package org.clevermonkeylabs.labchimp.model;

import net.contentobjects.jnotify.JNotifyListener;
import org.clevermonkeylabs.labchimp.model.directorytree.ProjectNode;

import java.io.File;

/**
 * Created by Thomas on 5/5/2017.
 */
public class Project {
    private File rootDirectory;
    private ProjectNode projectRoot;
    private ProjectDirectoryListener listener;

    public Project(File rootDirectory) {
        this.rootDirectory = rootDirectory;
        listener = new ProjectDirectoryListener();
    }

    public ProjectNode getProjectNode() {
        return projectRoot;
    }

    public void setProjectNode(ProjectNode projectNode) {
        this.projectRoot = projectNode;
    }

    private class ProjectDirectoryListener implements JNotifyListener {
        @Override
        public void fileCreated(int wd, String rootPath, String name) {

        }

        @Override
        public void fileDeleted(int wd, String rootPath, String name) {

        }

        @Override
        public void fileModified(int wd, String rootPath, String name) {

        }

        @Override
        public void fileRenamed(int wd, String rootPath, String oldName, String newName) {

        }
    }
}
