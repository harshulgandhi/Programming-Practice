package com.practice.after2017.datastructures;
import com.practice.after2017.datastructures.Node;
public class BinarySearchTree {

    public Node root = null;

    public void add(Node curr, int value) {
        if(curr == null) {
            curr = new Node(value);
            return;
        }

        if(curr.left == null && curr.getValue() > value) {
            curr.left = new Node(value);
        } else if (curr.right == null && curr.getValue() < value) {
            curr.right = new Node(value);
        }

        if(curr.getValue() > value) add(curr.left, value);
        else if(curr.getValue() < value) add(curr.right, value);
    }

    public void add(Node curr, Node toAdd) {
        if(curr == null) {
            curr = toAdd;
            return;
        }

        if(curr.left == null && curr.getValue() > toAdd.getValue()) {
            curr.left = toAdd;
        } else if(curr.right == null && curr.getValue() < toAdd.getValue()) {
            curr.right = toAdd;
        }

        if(toAdd.getValue() < curr.getValue()) add(curr.left, toAdd);
        else if(toAdd.getValue() > curr.getValue()) add(curr.right, toAdd);
    }

    public void inorder(Node root) {
        if(root!= null) {
            inorder(root.getLeft());
            System.out.println(root.getValue());
            inorder(root.getRight());
        }
    }

    public void preorder(Node root) {
        if(root!= null) {
            System.out.println(root.getValue());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    public void postorder(Node root) {
        if(root!= null) {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getValue());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(45);
        bst.add(root, 13);
        bst.add(root, 55);
        bst.add(root, 3);
        bst.add(root, 17);
        bst.add(root, 50);
        bst.inorder(root);
        bst.preorder(root);
        bst.postorder(root);
    }
}