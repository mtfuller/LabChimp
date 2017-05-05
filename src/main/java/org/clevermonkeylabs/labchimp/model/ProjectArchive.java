package org.clevermonkeylabs.labchimp.model;

import java.util.ArrayList;

/**
 * Created by Thomas on 5/5/2017.
 */
public class ProjectArchive {
    private LabChimpApplicationModel applicationModel;
    private ArrayList<Project> projects;
    private Project currentProject;

    public ProjectArchive(LabChimpApplicationModel applicationModel) {
        this.applicationModel = applicationModel;
    }

    public Project getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(Project currentProject) {
        this.currentProject = currentProject;
    }

    public int size() {
        return projects.size();
    }

    public boolean isEmpty() {
        return projects.isEmpty();
    }

    public boolean contains(Project o) {
        return projects.contains(o);
    }

    public boolean addProject(Project project) {
        return projects.add(project);
    }

    public boolean removeProject(Object o) {
        return projects.remove(o);
    }

    public void clearProjects() {
        projects.clear();
    }
}
