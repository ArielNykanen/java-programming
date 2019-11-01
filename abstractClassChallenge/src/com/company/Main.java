package com.company;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "1 2 3 4 5 6";
        String[] data = stringData.split(" ");

        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("4"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("1"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());

    }
}
