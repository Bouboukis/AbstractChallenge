package com.georgioskachrimanis.javacourse;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverseList(ListItem root);
}
