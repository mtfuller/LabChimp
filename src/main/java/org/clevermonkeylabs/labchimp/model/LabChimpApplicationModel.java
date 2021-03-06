package org.clevermonkeylabs.labchimp.model;

import java.io.File;
import java.io.IOException;

/**
 * Created by Thomas on 5/5/2017.
 */
public class LabChimpApplicationModel {
    private Workspace workspace;
    private ProjectArchive projectArchive;

    public LabChimpApplicationModel(Workspace workspace, ProjectArchive projectArchive) {
        this.workspace = workspace;
        this.projectArchive = projectArchive;
        this.projectArchive.setApplicationModel(this);
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public ProjectArchive getProjectArchive() {
        return projectArchive;
    }

    public void foo() {
        System.out.println("WOWZA!!!");
    }

    public void openFile(File file) throws IOException {
        System.out.println(file.getName() + ": " + file.getPath());
        OpenedFile newFile = new OpenedFile(file);
        workspace.addFile(newFile);
    }
}
