package com.georgioskachrimanis.javacourse;

public class Node extends ListItem {

    // Constructors
    public Node(Object value) {
        super(value);
    }

    // Implemented Methods
    @Override
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    ListItem next() {
        return this.nextItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    int compareTo(ListItem item) {
       if(item != null) {
           return ((String) super.getValue()).compareTo((String) item.getValue());
       } else {
           return -1;
       }
    }
}
