package com.company;

public class SearchTree implements NodeList {
    private ListItem root = null;
    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            // the list is empty, so this item becomes the head of the list
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int compare = (currentItem.comaperTo(item));
            if (compare < 0) {
                // item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (compare > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                  currentItem.setPrevious(item);
                  return true;
                }
            } else {
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        // recursive method
        if (item != null) {
            traverse(item.previous());
            System.out.println(item.getValue());
            traverse(item.next());

        }

    }
}
