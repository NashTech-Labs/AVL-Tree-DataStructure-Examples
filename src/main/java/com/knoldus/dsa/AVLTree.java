package com.knoldus.dsa;

/**
* Avl is algo that balance itself while adding new values to tree
* by rotating branches of binary tree and make itself Binary search tree
* there are four cases which has to tackle
* rotating - left right ,left-left,right-right,right left.
 */

public class AVLTree {

    private Node root;

    private static class Node {

        private int key;
        private int balance;
        private int height;
        private Node left, right, parent;

        Node(int k, Node p) {
            key = k;
            parent = p;
        }
    }

    public void insert(int key) {
        if (root == null) {
            root = new Node(key, null);
        } else {
            Node n = root;
            Node parent;
            while (n.key != key) {

                parent = n;

                boolean goLeft = n.key > key;
                n = goLeft ? n.left : n.right;

                if (n == null) {
                    if (goLeft) {
                        parent.left = new Node(key, parent);
                    } else {
                        parent.right = new Node(key, parent);
                    }
                    reBalance(parent);
                    break;
                }
            }
        }
    }

    /**
     * methods used to deletion nodes
     * @param node pointing deletion node
     */
    private void delete(Node node) {
        if (node.left == null && node.right == null) {
            if (node.parent == null) {
                root = null;
            } else {
                Node parent = node.parent;
                if (parent.left == node) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                reBalance(parent);
            }
            return;
        }
        Node child;
        if (node.left != null) {
            child = node.left;
            while (child.right != null) {
                child = child.right;
            }
        } else {
            child = node.right;
            while (child.left != null) {
                child = child.left;
            }
        }
        node.key = child.key;
        delete(child);
    }

    /**
     *
     * @param delKey delete key
     */
    public void delete(int delKey) {
        if (root == null) {
            return;
        }
        Node node;
        Node child = root;

        while (child != null) {
            node = child;
            child = delKey >= node.key ? node.right : node.left;
            if (delKey == node.key) {
                delete(node);
                return;
            }
        }
    }

    private void reBalance(Node n) {
        setBalance(n);

        if (n.balance == -2) {
            if (height(n.left.left) >= height(n.left.right)) {
                n = rotateRight(n);
            } else {
                n = rotateLeftThenRight(n);
            }

        } else if (n.balance == 2) {
            if (height(n.right.right) >= height(n.right.left)) {
                n = rotateLeft(n);
            } else {
                n = rotateRightThenLeft(n);
            }
        }

        if (n.parent != null) {
            reBalance(n.parent);
        } else {
            root = n;
        }
    }

    /**
     *  Left-Left Rotation by Avl
     * @param a pointing node
     * @return
     */
    private Node rotateLeft(Node a) {

        Node b = a.right;
        b.parent = a.parent;

        a.right = b.left;

        if (a.right != null) {
            a.right.parent = a;
        }

        b.left = a;
        a.parent = b;

        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }

        setBalance(a, b);

        return b;
    }
    /**
     *  Right Rotation by Avl
     * @param a pointing node
     * @return AVl Tree
     */
    private Node rotateRight(Node a) {

        Node b = a.left;
        b.parent = a.parent;

        a.left = b.right;

        if (a.left != null) {
            a.left.parent = a;
        }

        b.right = a;
        a.parent = b;

        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }

        setBalance(a, b);

        return b;
    }

    /**
     *  Left-Right Rotation perform
     * @param n node
     * @return
     */
    private Node rotateLeftThenRight(Node n) {
        n.left = rotateLeft(n.left);
        return rotateRight(n);
    }
    /**
     *  Right Left Rotation perform
     * @param n node
     * @return
     */
    private Node rotateRightThenLeft(Node n) {
        n.right = rotateRight(n.right);
        return rotateLeft(n);
    }

    private int height(Node n) {
        if (n == null) {
            return -1;
        }
        return n.height;
    }

    private void setBalance(Node... nodes) {
        for (Node n : nodes) {
            reHeight(n);
            n.balance = height(n.right) - height(n.left);
        }
    }

    public void printBalance() {
        printBalance(root);
    }

    private void printBalance(Node n) {
        if (n != null) {
            printBalance(n.left);
            System.out.printf("%s ", n.balance);
            printBalance(n.right);
        }
    }

    private void reHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public boolean search(int key) {
        Node result = searchHelper(this.root, key);
        return result != null;
    }

    private Node searchHelper(Node root, int key) {
        // root is null or key is present at root
        if (root == null || root.key == key) {
            return root;
        }

        // key is greater than root's key
        if (root.key > key) {
            return searchHelper(root.left, key); // call the function on the node's left child
        }
        // key is less than root's key then
        // call the function on the node's right child as it is greater
        return searchHelper(root.right, key);
    }

    /**
     * main method called
     * @param args arguments
     */
    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        System.out.println("Inserting values 1 to 10");
        for (int i = 1; i < 10; i++) {
            tree.insert(i);

        }

        System.out.print("Printing balance: ");
        tree.printBalance();
    }
}