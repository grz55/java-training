package com.grz55.javatraining.algorithms.linkedlists;

import java.io.*;
import java.util.*;

public class SortedLinkedListInsertingAlgorithm {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // HACKER RANK
    // Inserting a Node Into a Sorted Doubly Linked List
    // Function inserts a given value to the list and keeps the list sorted
    // While inserting the function has to track data from inside nodes

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (data <= head.data) {
            newNode.next = head;
            newNode.prev = head.prev;
            head = newNode;
            return head;
        }
        DoublyLinkedListNode iteratorNode = head;
        iteratorNode.next = head.next;

        while (iteratorNode.next != null) {
            if (iteratorNode.next.data > data) {
                newNode.prev = iteratorNode;
                newNode.next = iteratorNode.next;
                iteratorNode.next.prev = newNode;
                iteratorNode.next = newNode;
                return head;
            }
            iteratorNode = iteratorNode.next;
        }
        newNode.prev = iteratorNode;
        iteratorNode.next = newNode;
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide number of lists");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Provide number of list elements");
        for (int tItr = 0; tItr < t; tItr++) {
            DoublyLinkedList llist = new DoublyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println("Provide list elements");
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            System.out.println("Provide data to add");
            int data = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.println("Data added. Your linked list will be sorted");
            DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

            printDoublyLinkedList(llist1);
        }

        scanner.close();
    }
}

