package com.practice.beforeUEA.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {

    int data;
    Node2 left, right;

    public Node2(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversalUsingQueues {

    Node2 root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() {

        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node2 tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child*/
            if(tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversalUsingQueues binaryTree = new LevelOrderTraversalUsingQueues();
        binaryTree.root = new Node2(1);
        binaryTree.root.left = new Node2(2);
        binaryTree.root.right = new Node2(3);
        binaryTree.root.left.left = new Node2(4);
        binaryTree.root.left.right = new Node2(5);

        System.out.print("level order traversal :-  ");
        binaryTree.printLevelOrder();
    }
}
