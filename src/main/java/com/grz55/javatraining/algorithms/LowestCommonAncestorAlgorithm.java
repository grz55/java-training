package com.grz55.javatraining.algorithms;

import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LowestCommonAncestorAlgorithm {

    // HACKER RANK
    // Lowest Common Ancestor
    // Binary Tree is populated and then
    // lowest common ancestor is found

    public static Node lca(Node root, int v1, int v2) {
        if (v1 > root.data && v2 > root.data) {
            root = lca(root.right, v1, v2);
        }
        if (v1 < root.data && v2 < root.data) {
            root = lca(root.left, v1, v2);
        }
        return root;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide number of nodes");
        int t = scan.nextInt();
        Node root = null;
        System.out.println("Provide nodes");
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        System.out.println("Provide first node");
        int v1 = scan.nextInt();
        System.out.println("Provide second node");
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }
}
