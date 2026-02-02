package com.rimonmostafiz.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author rimonmostafiz
 */
public class BinaryTreeTraversal {
    public List<Node<String>> iterative(Node<String> root) {
        List<Node<String>> nodeArray = new ArrayList<>();

        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<String> current = stack.peek();
            stack.pop();

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);

            nodeArray.add(current);
        }
        return nodeArray;
    }
}
