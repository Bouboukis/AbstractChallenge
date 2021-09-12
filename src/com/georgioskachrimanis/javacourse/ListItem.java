package com.georgioskachrimanis.javacourse;

public abstract class ListItem {

    protected ListItem nextItem = null;
    protected ListItem previousItem = null;

    protected Object value;

    // Constructors
    public ListItem(Object value) {
        this.value = value;
    }

    // Getters
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    // Methods
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract int compareTo(ListItem item);

}
