package com.practice.beforeUEA.trees;

class Node1 {
    int data;
    Node left;
    Node right;
}

class BinaryTree1 {

    public Node createBinaryTree(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.right = null;
        newNode.left = null;
        return newNode;
    }


    public void levelOrderTraversalUsingRecursion(Node node) {
        if (node == null) {
            return;
        }
        int height = getHeightOfTree(node);
        for (int i = 0; i <= height; i++) {
            printAtGivenLevel(node, i + 1);
            System.out.println();
        }
    }

    private void printAtGivenLevel(Node node, int level) {
        if (node == null) return;

        if(level == 1) {
            System.out.println(node.data + " ");
        }
        printAtGivenLevel(node.left, level - 1);
        printAtGivenLevel(node.right, level - 1);

     }

    private int getHeightOfTree(Node node) {
        if (node == null) {
            return -1;
        }
        return Math.max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;
    }
}







public class LevelOrderTraversal {

    public static void main(String[] args) {
        BinaryTree1 binaryTree1 = new BinaryTree1();
        Node root = binaryTree1.createBinaryTree(2);
        root.left = binaryTree1.createBinaryTree(7);
        root.right = binaryTree1.createBinaryTree(5);
        root.left.left = binaryTree1.createBinaryTree(2);
        root.left.right = binaryTree1.createBinaryTree(6);
        root.left.right.left = binaryTree1.createBinaryTree(5);
        root.left.right.right = binaryTree1.createBinaryTree(11);
        root.right.right = binaryTree1.createBinaryTree(9);
        root.right.right.left = binaryTree1.createBinaryTree(4);

        binaryTree1.levelOrderTraversalUsingRecursion(root);
    }
}
