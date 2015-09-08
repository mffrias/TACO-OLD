package ar.edu.itba.alu.crpereyr.impl.bsearchtree2;

/**
 * Created by cris on 7/11/14.
 */
public class Node {
    // An object of type TreeNode represents one node
    // in a binary tree of strings.
    int item;      // The data in this node.
    Node left;    // Pointer to left subtree.
    Node right;   // Pointer to right subtree.
    Node(int str) {
        // Constructor.  Make a node containing str.
        item = str;
    }
}
