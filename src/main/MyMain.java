package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(65);
        tree.insert(52);
        tree.insert(23);
        tree.insert(14);
        tree.insert(75);
        tree.insert(92);
        tree.inOrder(tree.getRoot());
        tree.insert(53);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(22));
        System.out.println(tree.search(75));
        // and perform insert, search, traversal, delete
    }
}
