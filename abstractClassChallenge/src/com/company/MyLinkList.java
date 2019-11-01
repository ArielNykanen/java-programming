package com.company;

public class MyLinkList implements NodeList {

    private ListItem root = null;

    public MyLinkList(ListItem root) {
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
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if (compare > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int compare = currentItem.comaperTo(item);
            if(compare == 0) {
                // found the item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(compare < 0) {
                currentItem = currentItem.next();
            }else {
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                System.out.println("The item you want to delete is not in the list.");
                return false;

            }
        }
        // we have reached the end of the list
         return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {

            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
