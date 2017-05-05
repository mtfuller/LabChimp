package org.clevermonkeylabs.labchimp.model.directorytree;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

/**
 * Created by Thomas on 5/5/2017.
 */
public class TreeNode<T,C> {
    private SimpleStringProperty name;
    private ObservableList<C> children;
    private T object;

    public TreeNode(SimpleStringProperty name, T object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String v) {
        name.setValue(v);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public int size() {
        return children.size();
    }

    public boolean isEmpty() {
        return children.isEmpty();
    }

    public boolean add(C c) {
        return children.add(c);
    }

    public boolean remove(Object o) {
        return children.remove(o);
    }

    public void clear() {
        children.clear();
    }
}
