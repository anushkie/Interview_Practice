package com.practice.beforeUEA.lists.arrayList.linkedList;


import java.util.List;

public class LinkedList {
    Node head;
    static public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second =  new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int data) {
        if(prev_node == null) {
            System.out.println("The given previous node cannot be null");
        }

        Node new_node1 = new Node(data);
        new_node1.next = prev_node.next;
        prev_node.next = new_node1;
    }

    public void insertAtTheEnd(int new_data) {
        //if the linked list is empty
        Node new_node = new Node(new_data);

        if(head == null) {
            head = new Node(new_data);
            return;

        } else {
            Node last = head;
            while(last.next != null) last = last.next;
            last.next = new_node;
            return;
        }
    }

    public static LinkedList deleteUsingKey(LinkedList list,int key) {

        //store head node
        Node currNode = list.head, prev = null;

        //CASE-1: HEAD IS A KEY

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + "Found and deleted");
            return list;
        }

        //CASE-2 : KEY IS SOMEWHERE ODER THAN AT HEAD
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + "Deleted wuhooooo");
        }

        if(currNode == null) {
            System.out.println("key is not there");
        }

        return list;
    }

    public void deleteNode(int index) {

        //store head
        Node currNode = head, prev = null;

        //Case=1 : if pos = 0 and head to be deleted
        if(index == 0 && currNode != null) {
            head = currNode.next;
            System.out.println(index + "Found and deleted");
        }

        //CASE - 2: Index is greater than 0
        int counter = 0;

        while (currNode != null) {

            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(index + "Found and deleted");
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println(index + "Position element not found");
        }
    }

    /*
    [0][1][2][3][4]
    [1][0][3][2][4]
     */
    public void swapEvenAndOddIndexes() {
        if(head ==  null) {
            System.out.println("Empty list");
        }

        Node even = head;
        Node odd = head.next;

        while(odd != null && odd.next != null) {

        }
    }

    public void reverse () {
        Node current = head;
        Node previous = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    }

    public Node circular() {
        Node start = head;
        while(head.next != null) {
            head = head.next;
        }
        head.next = start;
        return start;
    }

    public Node MiddleElement() {
        Node slowPtr = head;
        Node fastPtr = head.next;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public void removeDupsFromUnsortedArray() {

        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
        //pick element one by one
        while(ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while(ptr2.next != null) {
                if(ptr1.data == ptr2.data) {
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    public void removeDupsFromSortedArray() {
        Node current = head;

        while(current != null) {
            Node temp = head;

            while(temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    public void rotateLinkedList(int k) {

        if(head == null || k < 0) {
            return;
        }

        Node current = head;
        int count = 1;

        while(count < k && current != null) {
            current = current.next;
            count++;
        }

        if(current == null) {
            return;
        }

        //storing kthNode
        Node kthNode = current;
        //current wil point to last node ie 60 after this loop
        while(current.next != null) {
            current = current.next;
        }

        //change last of node to prev head
        //next of 60 is now 10
        current.next = head;

        //change heaf to (k+1)th node
        //head is now 50
        head = kthNode.next;

        //change the next of kthNode to null
        kthNode.next = null;
    }

   /* public void isPalindrome() {
        boolean isPalindrome(LinkedListNode head) {
            2 LinkedListNode reversed = reverseAndClone(head);
            3 return isEqualfhead, reversed);
            4 }
        5
        6 LinkedListNode reverseAndClone(LinkedListNode node) {
            7 LinkedListNode head = n u l l ;
            8 while {node != n u l l ) {
                LinkedListNode n = new LinkedListNode(node.data); // Clone
                10 n.next = head;
                11 head = n;
                12 node = node.next;
                13 }
                14 return head;
                15 >
                        16
                17 boolean IsEqualfLinkedListNode one, LinkedListNode two) {
                    18 while {one 1= n u l l && two != n u l l ) {
                        19 if (one.data 1= two.data) {
                            20 return false;
                            21 >
                                    22 one = one.next;
                            23 two = two.next;
                            24 >
                                    25 return one == n u l l && two =* n u l l ;
                            26 }
    }*/
}
