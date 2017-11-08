package com.practice.after2017.datastructures;

public class Node{
    int value;
    Node left = null;
    Node right = null;

    public Node(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}