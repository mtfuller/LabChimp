package org.clevermonkeylabs.labchimp.controller;

import javafx.scene.control.TreeView;
import org.clevermonkeylabs.framework.controller.Controller;
import org.clevermonkeylabs.framework.view.LoadableView;
import org.clevermonkeylabs.labchimp.model.ProjectArchive;
import org.clevermonkeylabs.labchimp.model.directorytree.ProjectNode;
import org.clevermonkeylabs.labchimp.model.directorytree.TreeNode;

import java.util.ArrayList;

/**
 * Created by Thomas on 5/5/2017.
 */
public class ProjectTreeController extends Controller<LoadableView, ProjectArchive> {
    private TreeView<TreeNode<?,?>> projectTreeView;
    private ArrayList<ProjectNode> projectNodes;


}
