package com.georgioskachrimanis.javacourse;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem; // List is empty, newItem becomes root.
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0){ // newItem is greater, so move it to next/right if possible
                if(currentItem.next() != null) {
                    currentItem =currentItem.next();
                } else {
                    currentItem.setNext(newItem); // No next item insert end of list
                    newItem.setPrevious(currentItem); // The new last item point as previous to the previous last item.
                    // Shortcut of the previous 2 lines --> currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) { // newItem is less so has to go before the current item
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem); // the previous item of the current points to the new item as next...
                    newItem.setPrevious(currentItem.previous()); // new item points previous, the previous of the current item
                    // Abbreviation of the code --> currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem); // new item points as next the current one
                    currentItem.setPrevious(newItem); // the current is pointing as previous the new item
                    // Abbreviation of the code --> newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    currentItem.setPrevious(newItem); // No previous item at the beginning of the list, newItem is the first item.
                    newItem.setNext(currentItem); // newItem points to the next item of the list that was the current item.
                    this.root = newItem; // The newItem becomes the head of the list.
                }
                return true;
            } else {
                // eguals
                System.out.println("The item" + newItem.getValue() + " is already in the list, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToBeDeleted) {
        if (itemToBeDeleted !=null) {
            System.out.println("Deleting item " + itemToBeDeleted.getValue());
        }

        ListItem currentItem = this.root;

        while(currentItem != null) {
            int comparison = currentItem.compareTo(itemToBeDeleted);
            if(comparison == 0) {
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0 ) {
                currentItem = currentItem.next();
            } else {
                // Comparison > 0, so the item we are now is greater than the one we want to delete,
                // so the item is not in the list.
                System.out.println("Item was not deleted, it was not in the list.(While Loop)");
                return false;
            }
        }
        System.out.println("Item was not deleted, it was not in the list. Not in the while loop");
        return false;
    }

    @Override
    public void traverseList(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while(root != null) {
                System.out.println(root.getValue());
                root= root.next();
            }
        }

        // this is the same code with recursion, keep in mind if you have huge amount of data the program will crash(no memory )
//        if (root != null) {
//            System.out.println(root.getValue());
//            traverseList(root.next());
//        }
    }
}
