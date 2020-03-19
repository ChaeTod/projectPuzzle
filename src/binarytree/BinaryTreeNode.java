package binarytree;

public class BinaryTreeNode {
    private int key;
    BinaryTreeNode left, right;

    public BinaryTreeNode(int item) {
        key = item;
        left = right = null;
    }

    public void insert(BinaryTreeNode node, int value) {
        if (value < node.key) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.key);
                node.left = new BinaryTreeNode(value);
            }
        } else if (value > node.key) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.key);
                node.right = new BinaryTreeNode(value);
            }
        }
    }

    public void traverseInOrder(BinaryTreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(BinaryTreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

}
